/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Abstract Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractLocationType#getSourceClassificationRelations <em>Source Classification Relations</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification <em>Target Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractLocationType()
 * @model
 * @generated
 */
public interface EMRAbstractLocationType extends EMRAbstractResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getAbstractLocationTypes <em>Abstract Location Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractLocationType_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractLocationTypes
	 * @model opposite="abstractLocationTypes" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractLocationType#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Source Classification Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRClassificationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType <em>Source Abs Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Classification Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Classification Relations</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractLocationType_SourceClassificationRelations()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType
	 * @model type="vpml.resourcepackage.EMRClassificationRelation" opposite="sourceAbsLocationType"
	 * @generated
	 */
	EList getSourceClassificationRelations();

	/**
	 * Returns the value of the '<em><b>Target Classification</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType <em>Target Abs Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Classification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Classification</em>' reference.
	 * @see #setTargetClassification(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractLocationType_TargetClassification()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType
	 * @model opposite="targetAbsLocationType"
	 * @generated
	 */
	EMRClassificationRelation getTargetClassification();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification <em>Target Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Classification</em>' reference.
	 * @see #getTargetClassification()
	 * @generated
	 */
	void setTargetClassification(EMRClassificationRelation value);

} // EMRAbstractLocationType
