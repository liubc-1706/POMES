/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EM Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMObject是新版VPML元类的继承关系树中的基类，所有元类都是EMObject的后代。EMObject定义了作为建模元素应该有的一般属性，如ID、名称、编码、描述。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.EMObject#getName <em>Name</em>}</li>
 *   <li>{@link vpml.EMObject#getId <em>Id</em>}</li>
 *   <li>{@link vpml.EMObject#getCode <em>Code</em>}</li>
 *   <li>{@link vpml.EMObject#getDescription <em>Description</em>}</li>
 *   <li>{@link vpml.EMObject#getOID <em>OID</em>}</li>
 *   <li>{@link vpml.EMObject#getSourceObjSourceRelation <em>Source Obj Source Relation</em>}</li>
 *   <li>{@link vpml.EMObject#getTargetObjTargetRelation <em>Target Obj Target Relation</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.VpmlPackage#getEMObject()
 * @model
 * @generated
 */
public interface EMObject extends EObject {
	
	//xsm
	public String GetFullBasePackageType();
	
	//xsm
	public String GetClassType();
	
	Long getSimOID();

	void setSimOID(Long value);
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see vpml.VpmlPackage#getEMObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link vpml.EMObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see vpml.VpmlPackage#getEMObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link vpml.EMObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see vpml.VpmlPackage#getEMObject_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link vpml.EMObject#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see vpml.VpmlPackage#getEMObject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link vpml.EMObject#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>OID</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OID</em>' attribute.
	 * @see #setOID(Long)
	 * @see vpml.VpmlPackage#getEMObject_OID()
	 * @model default="0"
	 * @generated
	 */
	Long getOID();

	/**
	 * Sets the value of the '{@link vpml.EMObject#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(Long value);

	/**
	 * Returns the value of the '<em><b>Source Obj Source Relation</b></em>' reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj <em>Source Relation Source Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Obj Source Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Obj Source Relation</em>' reference list.
	 * @see vpml.VpmlPackage#getEMObject_SourceObjSourceRelation()
	 * @see vpml.collaborationpackage.EMCRelation#getSourceRelationSourceObj
	 * @model type="vpml.collaborationpackage.EMCRelation" opposite="sourceRelationSourceObj"
	 * @generated
	 */
	EList getSourceObjSourceRelation();

	/**
	 * Returns the value of the '<em><b>Target Obj Target Relation</b></em>' reference list.
	 * The list contents are of type {@link vpml.collaborationpackage.EMCRelation}.
	 * It is bidirectional and its opposite is '{@link vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj <em>Target Relation Target Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Obj Target Relation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Obj Target Relation</em>' reference list.
	 * @see vpml.VpmlPackage#getEMObject_TargetObjTargetRelation()
	 * @see vpml.collaborationpackage.EMCRelation#getTargetRelationTargetObj
	 * @model type="vpml.collaborationpackage.EMCRelation" opposite="targetRelationTargetObj"
	 * @generated
	 */
	EList getTargetObjTargetRelation();

} // EMObject
