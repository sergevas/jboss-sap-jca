/**
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
 * 
 */
package org.jboss.jca.adapters.sap.cci;

import javax.resource.ResourceException;
import javax.resource.cci.ResultSetInfo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.jboss.jca.adapters.sap.cci.CciPackage#getConnection()
 * @model superTypes="org.jboss.jca.adapters.sap.cci.CCIConnection"
 * @generated
 */
public interface Connection extends EObject, javax.resource.cci.Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	void begin() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	void end() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isStateful();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	ConnectionSpec getConnectionSpec();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	Interaction createInteraction() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	LocalTransaction getLocalTransaction() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	ConnectionMetaData getMetaData() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.jboss.jca.adapters.sap.cci.ResultSetInfo" exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	ResultSetInfo getResultSetInfo() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	void ping() throws ResourceException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.jboss.jca.adapters.sap.cci.ResourceException"
	 * @generated
	 */
	void close() throws ResourceException;

} // Connection
