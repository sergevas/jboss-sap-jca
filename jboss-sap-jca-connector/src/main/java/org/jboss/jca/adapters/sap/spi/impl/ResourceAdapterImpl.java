/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jca.adapters.sap.spi.impl;

import java.util.HashSet;
import java.util.Set;

import javax.resource.ResourceException;
import javax.resource.spi.ActivationSpec;
import javax.resource.spi.BootstrapContext;
import javax.resource.spi.ResourceAdapter;
import javax.resource.spi.ResourceAdapterInternalException;
import javax.resource.spi.endpoint.MessageEndpointFactory;
import javax.transaction.xa.XAResource;

import com.sap.conn.jco.ext.Environment;

/**
 * Implements the {@link ResourceAdapter } interface for the JBoss SAP JCA Connector.
 *
 * @author William Collins
 * 
 * @version $Id: 25d6694a6bed8a642b3ff41ca346848db6072ba6 $
 */
public class ResourceAdapterImpl implements ResourceAdapter {

	/** Destination Provider for JCo runtime. */
	private final DestinationDataProviderImpl destinationDataProvider;

	/**
	 * The set of active managed connection factories currently managed by this resource adapter.
	 */
	private final Set<ManagedConnectionFactoryImpl> factories = new HashSet<ManagedConnectionFactoryImpl>();
	
	/**
	 * Default constructor
	 */
	public ResourceAdapterImpl() {
		destinationDataProvider = new DestinationDataProviderImpl();
	}

	/**
	 * {@inheritDoc}
	 */
	public void endpointActivation(MessageEndpointFactory endpointFactory, ActivationSpec spec)
			throws ResourceException {
	}

	/**
	 * {@inheritDoc}
	 */
	public void endpointDeactivation(MessageEndpointFactory endpointFactory, ActivationSpec spec) {
	}

	/**
	 * {@inheritDoc}
	 */
	public void start(BootstrapContext ctx) throws ResourceAdapterInternalException {
		Environment.registerDestinationDataProvider(destinationDataProvider);
	}

	/**
	 * {@inheritDoc}
	 */
	public void stop() {

		// Destroy all outstanding connection factories
		Set<ManagedConnectionFactoryImpl> copy = null;
		synchronized (factories) {
			if (factories.size() > 0) 
				copy = new HashSet<ManagedConnectionFactoryImpl>(factories);
		}
		
		if (copy != null) {
			for (ManagedConnectionFactoryImpl managedConnectionFactory: copy) {
				try {
					managedConnectionFactory.destroy();
				} catch (ResourceException e) {
					e.printStackTrace();
				}
			}
		}

		Environment.unregisterDestinationDataProvider(destinationDataProvider);
	}

	/**
	 * {@inheritDoc}
	 */
	public XAResource[] getXAResources(ActivationSpec[] specs) throws ResourceException {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		int result = 17;
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		if (other == this)
			return true;
		if (!(other instanceof ResourceAdapterImpl))
			return false;

		// Return true to prevent application server from deploying multiple instances of this resource adapter.
		return true;
	}

	protected DestinationDataProviderImpl getDestinationDataProvider() {
		return destinationDataProvider;
	}

	/**
	 * Associate the given managed connection factory with this adapter.
	 *  
	 * @param factory - The managed connection factory to be associated.
	 */
	protected void associateConnectionFactory(ManagedConnectionFactoryImpl factory) {
		synchronized (factories) {
			factories.add(factory);
		}
	}

	/**
	 * Dissociate the given managed connection factory with this a adapter.
	 * @param factory - The managed connection factory to be dissociated.
	 */
	protected void dissociateConnection(ManagedConnectionFactoryImpl factory) {
		synchronized (factories) {
			factories.remove(factory);
		}
	}
	
}