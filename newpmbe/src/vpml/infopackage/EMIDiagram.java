/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

import org.eclipse.emf.common.util.EList;

import vpml.EMDiagram;

import vpml.processpackage.EMPDiagram;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMIDiagram#getEmiDiagram <em>Emi Diagram</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getInand <em>Inand</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getInor <em>Inor</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getStateConnector <em>State Connector</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getOther <em>Other</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getProductPackage <em>Product Package</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getOutand <em>Outand</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getOutor <em>Outor</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getRefFlow <em>Ref Flow</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getDocument <em>Document</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getDataFlow <em>Data Flow</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getComInfo <em>Com Info</em>}</li>
 *   <li>{@link vpml.infopackage.EMIDiagram#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram()
 * @model
 * @generated
 */
public interface EMIDiagram extends EMDiagram {
	/**
	 * Returns the value of the '<em><b>Emi Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDiagram#getEmiDiagram <em>Emi Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emi Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emi Diagram</em>' reference.
	 * @see #setEmiDiagram(EMIDiagram)
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_EmiDiagram()
	 * @see vpml.infopackage.EMIDiagram#getEmiDiagram
	 * @model opposite="emiDiagram" required="true"
	 * @generated
	 */
	EMIDiagram getEmiDiagram();

	/**
	 * Sets the value of the '{@link vpml.infopackage.EMIDiagram#getEmiDiagram <em>Emi Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emi Diagram</em>' reference.
	 * @see #getEmiDiagram()
	 * @generated
	 */
	void setEmiDiagram(EMIDiagram value);

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIArtifact}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIArtifact#getArtifactDiagram <em>Artifact Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Artifact()
	 * @see vpml.infopackage.EMIArtifact#getArtifactDiagram
	 * @model type="vpml.infopackage.EMIArtifact" opposite="artifactDiagram" containment="true"
	 * @generated
	 */
	EList getArtifact();

	/**
	 * Returns the value of the '<em><b>Inand</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIInAnd}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIInAnd#getInandDiagram <em>Inand Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inand</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Inand()
	 * @see vpml.infopackage.EMIInAnd#getInandDiagram
	 * @model type="vpml.infopackage.EMIInAnd" opposite="inandDiagram" containment="true"
	 * @generated
	 */
	EList getInand();

	/**
	 * Returns the value of the '<em><b>Inor</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIInOr}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIInOr#getInorDiagram <em>Inor Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inor</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Inor()
	 * @see vpml.infopackage.EMIInOr#getInorDiagram
	 * @model type="vpml.infopackage.EMIInOr" opposite="inorDiagram" containment="true"
	 * @generated
	 */
	EList getInor();

	/**
	 * Returns the value of the '<em><b>State Connector</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIStateConnector}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIStateConnector#getStateConnectorDiagram <em>State Connector Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Connector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Connector</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_StateConnector()
	 * @see vpml.infopackage.EMIStateConnector#getStateConnectorDiagram
	 * @model type="vpml.infopackage.EMIStateConnector" opposite="stateConnectorDiagram" containment="true"
	 * @generated
	 */
	EList getStateConnector();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIOther}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIOther#getOtherDiagram <em>Other Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Other()
	 * @see vpml.infopackage.EMIOther#getOtherDiagram
	 * @model type="vpml.infopackage.EMIOther" opposite="otherDiagram" containment="true"
	 * @generated
	 */
	EList getOther();

	/**
	 * Returns the value of the '<em><b>Product Package</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIProductPackage}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIProductPackage#getProductPackageDiagram <em>Product Package Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Package</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_ProductPackage()
	 * @see vpml.infopackage.EMIProductPackage#getProductPackageDiagram
	 * @model type="vpml.infopackage.EMIProductPackage" opposite="productPackageDiagram" containment="true"
	 * @generated
	 */
	EList getProductPackage();

	/**
	 * Returns the value of the '<em><b>Outand</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIOutAnd}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIOutAnd#getOutandDiagram <em>Outand Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outand</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Outand()
	 * @see vpml.infopackage.EMIOutAnd#getOutandDiagram
	 * @model type="vpml.infopackage.EMIOutAnd" opposite="outandDiagram" containment="true"
	 * @generated
	 */
	EList getOutand();

	/**
	 * Returns the value of the '<em><b>Outor</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIOutOr}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIOutOr#getOutorDiagram <em>Outor Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outor</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Outor()
	 * @see vpml.infopackage.EMIOutOr#getOutorDiagram
	 * @model type="vpml.infopackage.EMIOutOr" opposite="outorDiagram" containment="true"
	 * @generated
	 */
	EList getOutor();

	/**
	 * Returns the value of the '<em><b>Ref Flow</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIRefFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIRefFlow#getRefFlowDiagram <em>Ref Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Flow</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_RefFlow()
	 * @see vpml.infopackage.EMIRefFlow#getRefFlowDiagram
	 * @model type="vpml.infopackage.EMIRefFlow" opposite="refFlowDiagram" containment="true"
	 * @generated
	 */
	EList getRefFlow();

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIDocument}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDocument#getDocumentDiagram <em>Document Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Document()
	 * @see vpml.infopackage.EMIDocument#getDocumentDiagram
	 * @model type="vpml.infopackage.EMIDocument" opposite="documentDiagram" containment="true"
	 * @generated
	 */
	EList getDocument();

	/**
	 * Returns the value of the '<em><b>Data Flow</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIDataFlow#getDataFlowDiagram <em>Data Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flow</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_DataFlow()
	 * @see vpml.infopackage.EMIDataFlow#getDataFlowDiagram
	 * @model type="vpml.infopackage.EMIDataFlow" opposite="dataFlowDiagram" containment="true"
	 * @generated
	 */
	EList getDataFlow();

	/**
	 * Returns the value of the '<em><b>Com Info</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIComInfo}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIComInfo#getComInfoDiagram <em>Com Info Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Info</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_ComInfo()
	 * @see vpml.infopackage.EMIComInfo#getComInfoDiagram
	 * @model type="vpml.infopackage.EMIComInfo" opposite="comInfoDiagram" containment="true"
	 * @generated
	 */
	EList getComInfo();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMIDiagram_Message()
	 * @model type="vpml.infopackage.EMIMessage" containment="true"
	 * @generated
	 */
	EList getMessage();

} // EMIDiagram
