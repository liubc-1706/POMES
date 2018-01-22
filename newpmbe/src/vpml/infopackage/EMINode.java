/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMI Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vpml.infopackage.EMINode#getTargetFlow <em>Target Flow</em>}</li>
 *   <li>{@link vpml.infopackage.EMINode#getSourceFlow <em>Source Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @see vpml.infopackage.InfopackagePackage#getEMINode()
 * @model
 * @generated
 */
public interface EMINode extends EMIObject {
	/**
	 * Returns the value of the '<em><b>Target Flow</b></em>' reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIFlow#getSourceNode <em>Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Flow</em>' reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMINode_TargetFlow()
	 * @see vpml.infopackage.EMIFlow#getSourceNode
	 * @model type="vpml.infopackage.EMIFlow" opposite="sourceNode"
	 * @generated
	 */
	EList getTargetFlow();

	/**
	 * Returns the value of the '<em><b>Source Flow</b></em>' reference list.
	 * The list contents are of type {@link vpml.infopackage.EMIFlow}.
	 * It is bidirectional and its opposite is '{@link vpml.infopackage.EMIFlow#getTargetNode <em>Target Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Flow</em>' reference list.
	 * @see vpml.infopackage.InfopackagePackage#getEMINode_SourceFlow()
	 * @see vpml.infopackage.EMIFlow#getTargetNode
	 * @model type="vpml.infopackage.EMIFlow" opposite="targetNode"
	 * @generated
	 */
	EList getSourceFlow();

} // EMINode
