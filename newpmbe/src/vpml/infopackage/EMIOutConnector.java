/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Out Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMIOutConnector（输出逻辑连接符）是输出与、输出或的基类。
 * 活动通过EMIActToOut和输出逻辑连接符相连；
 * 输出与、输出或之间通过EMIOutToOut相连；
 * 输出逻辑连接符可以通过EMIOutToPro和产品相连
 * <!-- end-model-doc -->
 *
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIOutConnector()
 * @model
 * @generated
 */
public interface EMIOutConnector extends EMILogicalConnector {
} // EMIOutConnector
