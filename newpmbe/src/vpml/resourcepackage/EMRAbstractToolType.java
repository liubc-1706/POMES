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
 * A representation of the model object '<em><b>EMR Abstract Tool Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation <em>Target Classification Relation</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRAbstractToolType#getSourceAbsClassficationRelations <em>Source Abs Classfication Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractToolType()
 * @model
 * @generated
 */
public interface EMRAbstractToolType extends EMRAbstractResourceType {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getAbstractToolTypes <em>Abstract Tool Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractToolType_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getAbstractToolTypes
	 * @model opposite="abstractToolTypes" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractToolType#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Target Classification Relation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType <em>Target Abs Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Classification Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Classification Relation</em>' reference.
	 * @see #setTargetClassificationRelation(EMRClassificationRelation)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractToolType_TargetClassificationRelation()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType
	 * @model opposite="targetAbsToolType"
	 * @generated
	 */
	EMRClassificationRelation getTargetClassificationRelation();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation <em>Target Classification Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Classification Relation</em>' reference.
	 * @see #getTargetClassificationRelation()
	 * @generated
	 */
	void setTargetClassificationRelation(EMRClassificationRelation value);

	/**
	 * Returns the value of the '<em><b>Source Abs Classfication Relations</b></em>' reference list.
	 * The list contents are of type {@link vpml.resourcepackage.EMRClassificationRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType <em>Source Abs Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Abs Classfication Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Abs Classfication Relations</em>' reference list.
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractToolType_SourceAbsClassficationRelations()
	 * @see vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType
	 * @model type="vpml.resourcepackage.EMRClassificationRelation" opposite="sourceAbsToolType"
	 * @generated
	 */
	EList getSourceAbsClassficationRelations();

} // EMRAbstractToolType
