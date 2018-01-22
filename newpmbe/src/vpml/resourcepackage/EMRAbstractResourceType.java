/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.resourcepackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMR Abstract Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * EMRAbstractResourceType从资源分类的角度描述企业的资源类型，是企业资源的一个抽像类型，与EMRBasicResourceType不同，EMRAbstractResourceType没有实际的资源实体。
 * 可以用EMRResourceClassificationRelationship对EMRAbstractResourceType再分类，也可以把多个EMRAbstractResourceType组合在一起，抽象出一更高层的资源类型，形成企业的资源分类图。
 * <!-- end-model-doc -->
 *
 *
 * @see vpml.resourcepackage.ResourcepackagePackage#getEMRAbstractResourceType()
 * @model
 * @generated
 */
public interface EMRAbstractResourceType extends EMRResourceType {
} // EMRAbstractResourceType
