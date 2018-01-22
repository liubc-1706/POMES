/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Out Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMPOutConnector（输出逻辑连接符）是输出与、输出或的基类。
 * 活动通过EMPActToOut和输出逻辑连接符相连；
 * 输出与、输出或之间通过EMPOutToOut相连；
 * 输出逻辑连接符可以通过EMPOutToPro和产品相连
 * <!-- end-model-doc -->
 *
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPOutConnector()
 * @model
 * @generated
 */
public interface EMPOutConnector extends EMPLogicalConnector {
} // EMPOutConnector
