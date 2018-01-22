/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import vpml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VpmlFactoryImpl extends EFactoryImpl implements VpmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VpmlFactory init() {
		try {
			VpmlFactory theVpmlFactory = (VpmlFactory)EPackage.Registry.INSTANCE.getEFactory("http:///vpml.ecore"); 
			if (theVpmlFactory != null) {
				return theVpmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VpmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VpmlPackage.EM_OBJECT: return createEMObject();
			case VpmlPackage.EM_MODEL: return createEMModel();
			case VpmlPackage.EM_DIAGRAM: return createEMDiagram();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMObject createEMObject() {
		EMObjectImpl emObject = new EMObjectImpl();
		return emObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMModel createEMModel() {
		EMModelImpl emModel = new EMModelImpl();
		return emModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMDiagram createEMDiagram() {
		EMDiagramImpl emDiagram = new EMDiagramImpl();
		return emDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VpmlPackage getVpmlPackage() {
		return (VpmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static VpmlPackage getPackage() {
		return VpmlPackage.eINSTANCE;
	}

} //VpmlFactoryImpl
