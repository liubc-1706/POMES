/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Classification Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMRResourceClassificationRelationship定义资源类型之间的分类关系。允许企业资源的多种分类方式，所以一个抽象资源类型可以有多个子类型，也可以有多个父类型。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram <em>Emr Diagram</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getRole <em>Role</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType <em>Source Abs Role Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType <em>Target Abs Role Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getLocationType <em>Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType <em>Source Abs Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType <em>Target Abs Location Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getToolType <em>Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType <em>Target Abs Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType <em>Source Abs Tool Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getMachineType <em>Machine Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsMachineType <em>Source Abs Machine Type</em>}</li>
 *   <li>{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsMachineType <em>Target Abs Machine Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation()
 * @model
 * @generated
 */
public interface EMRClassificationRelation extends EMRRelation {
	/**
	 * Returns the value of the '<em><b>Emr Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRDiagram#getClassificationRelations <em>Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emr Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emr Diagram</em>' container reference.
	 * @see #setEmrDiagram(EMRDiagram)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_EmrDiagram()
	 * @see vpml.resourcepackage.EMRDiagram#getClassificationRelations
	 * @model opposite="classificationRelations" required="true"
	 * @generated
	 */
	EMRDiagram getEmrDiagram();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getEmrDiagram <em>Emr Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emr Diagram</em>' container reference.
	 * @see #getEmrDiagram()
	 * @generated
	 */
	void setEmrDiagram(EMRDiagram value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRRole#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(EMRRole)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_Role()
	 * @see vpml.resourcepackage.EMRRole#getClassificationRelation
	 * @model opposite="classificationRelation"
	 * @generated
	 */
	EMRRole getRole();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(EMRRole value);

	/**
	 * Returns the value of the '<em><b>Source Abs Role Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractRole#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Abs Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Abs Role Type</em>' reference.
	 * @see #setSourceAbsRoleType(EMRAbstractRole)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_SourceAbsRoleType()
	 * @see vpml.resourcepackage.EMRAbstractRole#getSourceClassificationRelations
	 * @model opposite="sourceClassificationRelations"
	 * @generated
	 */
	EMRAbstractRole getSourceAbsRoleType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsRoleType <em>Source Abs Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Abs Role Type</em>' reference.
	 * @see #getSourceAbsRoleType()
	 * @generated
	 */
	void setSourceAbsRoleType(EMRAbstractRole value);

	/**
	 * Returns the value of the '<em><b>Target Abs Role Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Abs Role Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Abs Role Type</em>' reference.
	 * @see #setTargetAbsRoleType(EMRAbstractRole)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_TargetAbsRoleType()
	 * @see vpml.resourcepackage.EMRAbstractRole#getTargetClassificationRelation
	 * @model opposite="targetClassificationRelation"
	 * @generated
	 */
	EMRAbstractRole getTargetAbsRoleType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsRoleType <em>Target Abs Role Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Abs Role Type</em>' reference.
	 * @see #getTargetAbsRoleType()
	 * @generated
	 */
	void setTargetAbsRoleType(EMRAbstractRole value);

	/**
	 * Returns the value of the '<em><b>Location Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRLocationType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Type</em>' reference.
	 * @see #setLocationType(EMRLocationType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_LocationType()
	 * @see vpml.resourcepackage.EMRLocationType#getClassificationRelation
	 * @model opposite="classificationRelation"
	 * @generated
	 */
	EMRLocationType getLocationType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getLocationType <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Type</em>' reference.
	 * @see #getLocationType()
	 * @generated
	 */
	void setLocationType(EMRLocationType value);

	/**
	 * Returns the value of the '<em><b>Source Abs Location Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractLocationType#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Abs Location Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Abs Location Type</em>' reference.
	 * @see #setSourceAbsLocationType(EMRAbstractLocationType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_SourceAbsLocationType()
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getSourceClassificationRelations
	 * @model opposite="sourceClassificationRelations"
	 * @generated
	 */
	EMRAbstractLocationType getSourceAbsLocationType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsLocationType <em>Source Abs Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Abs Location Type</em>' reference.
	 * @see #getSourceAbsLocationType()
	 * @generated
	 */
	void setSourceAbsLocationType(EMRAbstractLocationType value);

	/**
	 * Returns the value of the '<em><b>Target Abs Location Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification <em>Target Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Abs Location Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Abs Location Type</em>' reference.
	 * @see #setTargetAbsLocationType(EMRAbstractLocationType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_TargetAbsLocationType()
	 * @see vpml.resourcepackage.EMRAbstractLocationType#getTargetClassification
	 * @model opposite="targetClassification"
	 * @generated
	 */
	EMRAbstractLocationType getTargetAbsLocationType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsLocationType <em>Target Abs Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Abs Location Type</em>' reference.
	 * @see #getTargetAbsLocationType()
	 * @generated
	 */
	void setTargetAbsLocationType(EMRAbstractLocationType value);

	/**
	 * Returns the value of the '<em><b>Tool Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRToolType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Type</em>' reference.
	 * @see #setToolType(EMRToolType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_ToolType()
	 * @see vpml.resourcepackage.EMRToolType#getClassificationRelation
	 * @model opposite="classificationRelation"
	 * @generated
	 */
	EMRToolType getToolType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getToolType <em>Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Type</em>' reference.
	 * @see #getToolType()
	 * @generated
	 */
	void setToolType(EMRToolType value);

	/**
	 * Returns the value of the '<em><b>Target Abs Tool Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Abs Tool Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Abs Tool Type</em>' reference.
	 * @see #setTargetAbsToolType(EMRAbstractToolType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_TargetAbsToolType()
	 * @see vpml.resourcepackage.EMRAbstractToolType#getTargetClassificationRelation
	 * @model opposite="targetClassificationRelation"
	 * @generated
	 */
	EMRAbstractToolType getTargetAbsToolType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsToolType <em>Target Abs Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Abs Tool Type</em>' reference.
	 * @see #getTargetAbsToolType()
	 * @generated
	 */
	void setTargetAbsToolType(EMRAbstractToolType value);

	/**
	 * Returns the value of the '<em><b>Source Abs Tool Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractToolType#getSourceAbsClassficationRelations <em>Source Abs Classfication Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Abs Tool Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Abs Tool Type</em>' reference.
	 * @see #setSourceAbsToolType(EMRAbstractToolType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_SourceAbsToolType()
	 * @see vpml.resourcepackage.EMRAbstractToolType#getSourceAbsClassficationRelations
	 * @model opposite="sourceAbsClassficationRelations"
	 * @generated
	 */
	EMRAbstractToolType getSourceAbsToolType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsToolType <em>Source Abs Tool Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Abs Tool Type</em>' reference.
	 * @see #getSourceAbsToolType()
	 * @generated
	 */
	void setSourceAbsToolType(EMRAbstractToolType value);

	/**
	 * Returns the value of the '<em><b>Machine Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRMachineType#getClassificationRelation <em>Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machine Type</em>' reference.
	 * @see #setMachineType(EMRMachineType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_MachineType()
	 * @see vpml.resourcepackage.EMRMachineType#getClassificationRelation
	 * @model opposite="classificationRelation"
	 * @generated
	 */
	EMRMachineType getMachineType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getMachineType <em>Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Machine Type</em>' reference.
	 * @see #getMachineType()
	 * @generated
	 */
	void setMachineType(EMRMachineType value);

	/**
	 * Returns the value of the '<em><b>Source Abs Machine Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractMachineType#getSourceClassificationRelations <em>Source Classification Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Abs Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Abs Machine Type</em>' reference.
	 * @see #setSourceAbsMachineType(EMRAbstractMachineType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_SourceAbsMachineType()
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getSourceClassificationRelations
	 * @model opposite="sourceClassificationRelations"
	 * @generated
	 */
	EMRAbstractMachineType getSourceAbsMachineType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getSourceAbsMachineType <em>Source Abs Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Abs Machine Type</em>' reference.
	 * @see #getSourceAbsMachineType()
	 * @generated
	 */
	void setSourceAbsMachineType(EMRAbstractMachineType value);

	/**
	 * Returns the value of the '<em><b>Target Abs Machine Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link vpml.resourcepackage.EMRAbstractMachineType#getTargetClassificationRelation <em>Target Classification Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Abs Machine Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Abs Machine Type</em>' reference.
	 * @see #setTargetAbsMachineType(EMRAbstractMachineType)
	 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRClassificationRelation_TargetAbsMachineType()
	 * @see vpml.resourcepackage.EMRAbstractMachineType#getTargetClassificationRelation
	 * @model opposite="targetClassificationRelation"
	 * @generated
	 */
	EMRAbstractMachineType getTargetAbsMachineType();

	/**
	 * Sets the value of the '{@link vpml.resourcepackage.EMRClassificationRelation#getTargetAbsMachineType <em>Target Abs Machine Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Abs Machine Type</em>' reference.
	 * @see #getTargetAbsMachineType()
	 * @generated
	 */
	void setTargetAbsMachineType(EMRAbstractMachineType value);

} // EMRClassificationRelation
