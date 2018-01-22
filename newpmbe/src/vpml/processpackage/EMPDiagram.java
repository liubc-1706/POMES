/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import vpml.EMDiagram;

import vpml.collaborationpackage.EMCDiagram;

import vpml.infopackage.EMIDiagram;

import vpml.utilpackage.DSDistribution;
import vpml.utilpackage.EnumDistribution;
import vpml.utilpackage.EnumTimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMP Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.processpackage.EMPDiagram#getEmoDiagrams <em>Emo Diagrams</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getEmrDiagrams <em>Emr Diagrams</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getEmcDiagram <em>Emc Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getEmiDiagram <em>Emi Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getStartedTime <em>Started Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getInOrs <em>In Ors</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getProductPackages <em>Product Packages</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getOutAnds <em>Out Ands</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getDataFlows <em>Data Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getClockFlows <em>Clock Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getClocks <em>Clocks</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getInAnds <em>In Ands</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getNormalActivities <em>Normal Activities</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getCompActivities <em>Comp Activities</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getOutOrs <em>Out Ors</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getAssFlows <em>Ass Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getRefFlows <em>Ref Flows</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getOthers <em>Others</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getForms <em>Forms</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getDocuments <em>Documents</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getAutoActivities <em>Auto Activities</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getMessages <em>Messages</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getManualBatchActivities <em>Manual Batch Activities</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getAutoBatchActivities <em>Auto Batch Activities</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getMachineTypes <em>Machine Types</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getRoles <em>Roles</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getLocationTypes <em>Location Types</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getToolTypes <em>Tool Types</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getResourceGroupTypes <em>Resource Group Types</em>}</li>
 *   <li>{@link vpml.processpackage.EMPDiagram#getMileStones <em>Mile Stones</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram()
 * @model
 * @generated
 */
public interface EMPDiagram extends EMDiagram {
	/**
	 * Returns the value of the '<em><b>Emo Diagrams</b></em>' reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMODiagram}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMODiagram#getEmpDiagrams <em>Emp Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emo Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emo Diagrams</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_EmoDiagrams()
	 * @see vpml.organizationpackage.EMODiagram#getEmpDiagrams
	 * @model type="vpml.organizationpackage.EMODiagram" opposite="empDiagrams" required="true"
	 * @generated
	 */
	EList getEmoDiagrams();

	/**
	 * Returns the value of the '<em><b>Emr Diagrams</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRDiagram}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getEmpDiagrams <em>Emp Diagrams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagrams</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagrams</em>' reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_EmrDiagrams()
	 * @see vpml.resourcepackage.EMRDiagram#getEmpDiagrams
	 * @model type="vpml.resourcepackage.EMRDiagram" opposite="empDiagrams" required="true"
	 * @generated
	 */
	EList getEmrDiagrams();

	/**
	 * Returns the value of the '<em><b>Emc Diagram</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCDiagram#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emc Diagram</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emc Diagram</em>' reference.
	 * @see #setEmcDiagram(EMCDiagram)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_EmcDiagram()
	 * @see vpml.collaborationpackage.EMCDiagram#getEmpDiagram
	 * @model opposite="empDiagram"
	 * @generated
	 */
	EMCDiagram getEmcDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDiagram#getEmcDiagram <em>Emc Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emc Diagram</em>' reference.
	 * @see #getEmcDiagram()
	 * @generated
	 */
	void setEmcDiagram(EMCDiagram value);

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
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_EmiDiagram()
	 * @see vpml.infopackage.EMIDiagram#getEmiDiagram
	 * @model opposite="emiDiagram"
	 * @generated
	 */
	EMIDiagram getEmiDiagram();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDiagram#getEmiDiagram <em>Emi Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emi Diagram</em>' reference.
	 * @see #getEmiDiagram()
	 * @generated
	 */
	void setEmiDiagram(EMIDiagram value);

	/**
	 * Returns the value of the '<em><b>Started Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Time</em>' attribute.
	 * @see #setStartedTime(Date)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_StartedTime()
	 * @model dataType="vpml.utilpackage.JavaDate"
	 * @generated
	 */
	Date getStartedTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDiagram#getStartedTime <em>Started Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started Time</em>' attribute.
	 * @see #getStartedTime()
	 * @generated
	 */
	void setStartedTime(Date value);

	/**
	 * Returns the value of the '<em><b>Duration Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Time</em>' containment reference.
	 * @see #setDurationTime(DSDistribution)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_DurationTime()
	 * @model containment="true"
	 * @generated
	 */
	DSDistribution getDurationTime();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDiagram#getDurationTime <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Time</em>' containment reference.
	 * @see #getDurationTime()
	 * @generated
	 */
	void setDurationTime(DSDistribution value);

	/**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * The literals are from the enumeration {@link vpml.utilpackage.EnumTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #setTimeUnit(EnumTimeUnit)
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_TimeUnit()
	 * @model default="2"
	 * @generated
	 */
	EnumTimeUnit getTimeUnit();

	/**
	 * Sets the value of the '{@link vpml.processpackage.EMPDiagram#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see vpml.utilpackage.EnumTimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
	void setTimeUnit(EnumTimeUnit value);

	/**
	 * Returns the value of the '<em><b>In Ors</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPInOr}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInOr#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ors</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_InOrs()
	 * @see vpml.processpackage.EMPInOr#getEmpDiagram
	 * @model type="vpml.processpackage.EMPInOr" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getInOrs();

	/**
	 * Returns the value of the '<em><b>Product Packages</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPProductPackage}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPProductPackage#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Packages</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_ProductPackages()
	 * @see vpml.processpackage.EMPProductPackage#getEmpDiagram
	 * @model type="vpml.processpackage.EMPProductPackage" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getProductPackages();

	/**
	 * Returns the value of the '<em><b>Out Ands</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPOutAnd}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutAnd#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ands</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_OutAnds()
	 * @see vpml.processpackage.EMPOutAnd#getEmpDiagram
	 * @model type="vpml.processpackage.EMPOutAnd" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getOutAnds();

	/**
	 * Returns the value of the '<em><b>Data Flows</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDataFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDataFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Flows</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_DataFlows()
	 * @see vpml.processpackage.EMPDataFlow#getEmpDiagram
	 * @model type="vpml.processpackage.EMPDataFlow" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getDataFlows();

	/**
	 * Returns the value of the '<em><b>Clock Flows</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPClockFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPClockFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Flows</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_ClockFlows()
	 * @see vpml.processpackage.EMPClockFlow#getEmpDiagram
	 * @model type="vpml.processpackage.EMPClockFlow" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getClockFlows();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPClock}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPClock#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Clocks()
	 * @see vpml.processpackage.EMPClock#getEmpDiagram
	 * @model type="vpml.processpackage.EMPClock" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getClocks();

	/**
	 * Returns the value of the '<em><b>In Ands</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPInAnd}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPInAnd#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Ands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Ands</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_InAnds()
	 * @see vpml.processpackage.EMPInAnd#getEmpDiagram
	 * @model type="vpml.processpackage.EMPInAnd" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getInAnds();

	/**
	 * Returns the value of the '<em><b>Normal Activities</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPNormalActivity}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPNormalActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Activities</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_NormalActivities()
	 * @see vpml.processpackage.EMPNormalActivity#getEmpDiagram
	 * @model type="vpml.processpackage.EMPNormalActivity" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getNormalActivities();

	/**
	 * Returns the value of the '<em><b>Comp Activities</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPCompActivity}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPCompActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp Activities</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_CompActivities()
	 * @see vpml.processpackage.EMPCompActivity#getEmpDiagram
	 * @model type="vpml.processpackage.EMPCompActivity" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getCompActivities();

	/**
	 * Returns the value of the '<em><b>Out Ors</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPOutOr}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOutOr#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Ors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Ors</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_OutOrs()
	 * @see vpml.processpackage.EMPOutOr#getEmpDiagram
	 * @model type="vpml.processpackage.EMPOutOr" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getOutOrs();

	/**
	 * Returns the value of the '<em><b>Ass Flows</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAssFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAssFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ass Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ass Flows</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_AssFlows()
	 * @see vpml.processpackage.EMPAssFlow#getEmpDiagram
	 * @model type="vpml.processpackage.EMPAssFlow" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getAssFlows();

	/**
	 * Returns the value of the '<em><b>Ref Flows</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPRefFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPRefFlow#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Flows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Flows</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_RefFlows()
	 * @see vpml.processpackage.EMPRefFlow#getEmpDiagram
	 * @model type="vpml.processpackage.EMPRefFlow" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getRefFlows();

	/**
	 * Returns the value of the '<em><b>Others</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPOther}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPOther#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Others</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Others()
	 * @see vpml.processpackage.EMPOther#getEmpDiagram
	 * @model type="vpml.processpackage.EMPOther" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getOthers();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPArtifact}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPArtifact#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifacts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Artifacts()
	 * @see vpml.processpackage.EMPArtifact#getEmpDiagram
	 * @model type="vpml.processpackage.EMPArtifact" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getArtifacts();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPForm}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPForm#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Forms()
	 * @see vpml.processpackage.EMPForm#getEmpDiagram
	 * @model type="vpml.processpackage.EMPForm" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getForms();

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPDocument}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPDocument#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Documents()
	 * @see vpml.processpackage.EMPDocument#getEmpDiagram
	 * @model type="vpml.processpackage.EMPDocument" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getDocuments();

	/**
	 * Returns the value of the '<em><b>Auto Activities</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAutoActivity}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAutoActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Activities</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_AutoActivities()
	 * @see vpml.processpackage.EMPAutoActivity#getEmpDiagram
	 * @model type="vpml.processpackage.EMPAutoActivity" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getAutoActivities();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPMessage}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPMessage#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Messages()
	 * @see vpml.processpackage.EMPMessage#getEmpDiagram
	 * @model type="vpml.processpackage.EMPMessage" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getMessages();

	/**
	 * Returns the value of the '<em><b>Manual Batch Activities</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPManualBatchActivity}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPManualBatchActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Batch Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Batch Activities</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_ManualBatchActivities()
	 * @see vpml.processpackage.EMPManualBatchActivity#getEmpDiagram
	 * @model type="vpml.processpackage.EMPManualBatchActivity" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getManualBatchActivities();

	/**
	 * Returns the value of the '<em><b>Auto Batch Activities</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPAutoBatchActivity}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPAutoBatchActivity#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Batch Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Batch Activities</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_AutoBatchActivities()
	 * @see vpml.processpackage.EMPAutoBatchActivity#getEmpDiagram
	 * @model type="vpml.processpackage.EMPAutoBatchActivity" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getAutoBatchActivities();

	/**
	 * Returns the value of the '<em><b>Machine Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRMachineType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRMachineType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Types</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_MachineTypes()
	 * @see vpml.resourcepackage.EMRMachineType#getEmpDiagram
	 * @model type="vpml.resourcepackage.EMRMachineType" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getMachineTypes();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRRole}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_Roles()
	 * @see vpml.resourcepackage.EMRRole#getEmpDiagram
	 * @model type="vpml.resourcepackage.EMRRole" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getRoles();

	/**
	 * Returns the value of the '<em><b>Location Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRLocationType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRLocationType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Types</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_LocationTypes()
	 * @see vpml.resourcepackage.EMRLocationType#getEmpDiagram
	 * @model type="vpml.resourcepackage.EMRLocationType" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getLocationTypes();

	/**
	 * Returns the value of the '<em><b>Tool Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRToolType}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRToolType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Types</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_ToolTypes()
	 * @see vpml.resourcepackage.EMRToolType#getEmpDiagram
	 * @model type="vpml.resourcepackage.EMRToolType" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getToolTypes();

	/**
	 * Returns the value of the '<em><b>Resource Group Types</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.organizationpackage.EMOResourceGroupType}.
	 * It is bidirectional and its opposite is '{@link vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Group Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Group Types</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_ResourceGroupTypes()
	 * @see vpml.organizationpackage.EMOResourceGroupType#getEmpDiagram
	 * @model type="vpml.organizationpackage.EMOResourceGroupType" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getResourceGroupTypes();

	/**
	 * Returns the value of the '<em><b>Mile Stones</b></em>' containment reference list.
	 * The list contents are of type {@link vpml.processpackage.EMPMileStone}.
	 * It is bidirectional and its opposite is '{@link vpml.processpackage.EMPMileStone#getEmpDiagram <em>Emp Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mile Stones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mile Stones</em>' containment reference list.
	 * @see vpml.processpackage.ProcesspackagePackage#getEMPDiagram_MileStones()
	 * @see vpml.processpackage.EMPMileStone#getEmpDiagram
	 * @model type="vpml.processpackage.EMPMileStone" opposite="empDiagram" containment="true"
	 * @generated
	 */
	EList getMileStones();

} // EMPDiagram
