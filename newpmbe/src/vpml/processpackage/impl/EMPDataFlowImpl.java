/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.processpackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import vpml.EMObject;
import vpml.processpackage.EMPActivity;
import vpml.processpackage.EMPAutoActivity;
import vpml.processpackage.EMPAutoBatchActivity;
import vpml.processpackage.EMPCompActivity;
import vpml.processpackage.EMPDataFlow;
import vpml.processpackage.EMPDiagram;
import vpml.processpackage.EMPInAnd;
import vpml.processpackage.EMPInOr;
import vpml.processpackage.EMPManualBatchActivity;
import vpml.processpackage.EMPMileStone;
import vpml.processpackage.EMPNormalActivity;
import vpml.processpackage.EMPOutAnd;
import vpml.processpackage.EMPOutOr;
import vpml.processpackage.EMPProduct;
import vpml.processpackage.ProcesspackagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMP Data Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getEmpDiagram <em>Emp Diagram</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetProduct <em>Target Product</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetActivity <em>Target Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceProduct <em>Source Product</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceActivity <em>Source Activity</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceInAnd <em>Source In And</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetInAnd <em>Target In And</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetInOr <em>Target In Or</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceInOr <em>Source In Or</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceOutAnd <em>Source Out And</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetOutAnd <em>Target Out And</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getSourceOutOr <em>Source Out Or</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getTargetOutOr <em>Target Out Or</em>}</li>
 *   <li>{@link vpml.processpackage.impl.EMPDataFlowImpl#getMileStone <em>Mile Stone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMPDataFlowImpl extends EMPFlowImpl implements EMPDataFlow {
	
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Double PROBABILITY_EDEFAULT = new Double(1.0);

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected Double probability = PROBABILITY_EDEFAULT;

	//xsm	
//	protected float fProbability;
//	
//	public  float GetProbability()
//	{
//		return fProbability;
//	}
//	public void SetProbability(float Probability)
//	{
//		fProbability = Probability;
//	}
	
	public EMObject pStartPoint;
	
	public EMObject pEndPoint;
	
	public EMObject GetStartPoint()
	{
		return pStartPoint;
	}
	public void SetStartPoint(EMObject StartPoint)
	{
		pStartPoint = StartPoint;
	}
	public EMObject GetEndPoint()
	{
		if(targetActivity != null)
			pEndPoint = targetActivity;
		else if(targetInOr != null)
			pEndPoint = targetInOr;
		else if(targetInAnd != null)
			pEndPoint = targetInAnd;
		else if(targetOutOr != null)
			pEndPoint = targetOutOr;
		else if(targetOutAnd != null)
			pEndPoint = targetOutAnd;
		else if(targetProduct != null)
			pEndPoint = targetProduct;
		
		return pEndPoint;
	}
	public void SetEndPoint(EMObject EndPoint)
	{
		pEndPoint = EndPoint;
	}
	
	/**
	 * The cached value of the '{@link #getTargetProduct() <em>Target Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProduct()
	 * @generated
	 * @ordered
	 */
	protected EMPProduct targetProduct = null;

	/**
	 * The cached value of the '{@link #getTargetActivity() <em>Target Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPActivity targetActivity = null;

	/**
	 * The cached value of the '{@link #getSourceProduct() <em>Source Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceProduct()
	 * @generated
	 * @ordered
	 */
	protected EMPProduct sourceProduct = null;

	/**
	 * The cached value of the '{@link #getSourceActivity() <em>Source Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceActivity()
	 * @generated
	 * @ordered
	 */
	protected EMPActivity sourceActivity = null;

	/**
	 * The cached value of the '{@link #getSourceInAnd() <em>Source In And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInAnd()
	 * @generated
	 * @ordered
	 */
	protected EMPInAnd sourceInAnd = null;

	/**
	 * The cached value of the '{@link #getTargetInAnd() <em>Target In And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInAnd()
	 * @generated
	 * @ordered
	 */
	protected EMPInAnd targetInAnd = null;

	/**
	 * The cached value of the '{@link #getTargetInOr() <em>Target In Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInOr()
	 * @generated
	 * @ordered
	 */
	protected EMPInOr targetInOr = null;

	/**
	 * The cached value of the '{@link #getSourceInOr() <em>Source In Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceInOr()
	 * @generated
	 * @ordered
	 */
	protected EMPInOr sourceInOr = null;

	/**
	 * The cached value of the '{@link #getSourceOutAnd() <em>Source Out And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOutAnd()
	 * @generated
	 * @ordered
	 */
	protected EMPOutAnd sourceOutAnd = null;

	/**
	 * The cached value of the '{@link #getTargetOutAnd() <em>Target Out And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOutAnd()
	 * @generated
	 * @ordered
	 */
	protected EMPOutAnd targetOutAnd = null;

	/**
	 * The cached value of the '{@link #getSourceOutOr() <em>Source Out Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOutOr()
	 * @generated
	 * @ordered
	 */
	protected EMPOutOr sourceOutOr = null;

	/**
	 * The cached value of the '{@link #getTargetOutOr() <em>Target Out Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetOutOr()
	 * @generated
	 * @ordered
	 */
	protected EMPOutOr targetOutOr = null;

	/**
	 * The cached value of the '{@link #getMileStone() <em>Mile Stone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMileStone()
	 * @generated
	 * @ordered
	 */
	protected EMPMileStone mileStone = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMPDataFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ProcesspackagePackage.Literals.EMP_DATA_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(Double newProbability) {
		Double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPDiagram getEmpDiagram() {
		if (eContainerFeatureID != ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM) return null;
		return (EMPDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmpDiagram(EMPDiagram newEmpDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEmpDiagram, ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmpDiagram(EMPDiagram newEmpDiagram) {
		if (newEmpDiagram != eInternalContainer() || (eContainerFeatureID != ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM && newEmpDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newEmpDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEmpDiagram != null)
				msgs = ((InternalEObject)newEmpDiagram).eInverseAdd(this, ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS, EMPDiagram.class, msgs);
			msgs = basicSetEmpDiagram(newEmpDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM, newEmpDiagram, newEmpDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct getTargetProduct() {
		if (targetProduct != null && targetProduct.eIsProxy()) {
			InternalEObject oldTargetProduct = (InternalEObject)targetProduct;
			targetProduct = (EMPProduct)eResolveProxy(oldTargetProduct);
			if (targetProduct != oldTargetProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT, oldTargetProduct, targetProduct));
			}
		}
		return targetProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct basicGetTargetProduct() {
		return targetProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetProduct(EMPProduct newTargetProduct, NotificationChain msgs) {
		pEndPoint = newTargetProduct;
		
		EMPProduct oldTargetProduct = targetProduct;
		targetProduct = newTargetProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT, oldTargetProduct, newTargetProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetProduct(EMPProduct newTargetProduct) {
		if (newTargetProduct != targetProduct) {
			NotificationChain msgs = null;
			if (targetProduct != null)
				msgs = ((InternalEObject)targetProduct).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS, EMPProduct.class, msgs);
			if (newTargetProduct != null)
				msgs = ((InternalEObject)newTargetProduct).eInverseAdd(this, ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS, EMPProduct.class, msgs);
			msgs = basicSetTargetProduct(newTargetProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT, newTargetProduct, newTargetProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity getTargetActivity() {
		if (targetActivity != null && targetActivity.eIsProxy()) {
			InternalEObject oldTargetActivity = (InternalEObject)targetActivity;
			targetActivity = (EMPActivity)eResolveProxy(oldTargetActivity);
			if (targetActivity != oldTargetActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY, oldTargetActivity, targetActivity));
			}
		}
		return targetActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity basicGetTargetActivity() {
		return targetActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetActivity(EMPActivity newTargetActivity, NotificationChain msgs) {
//		if((newTargetActivity instanceof EMPNormalActivity) || 
//				(newTargetActivity instanceof EMPAutoActivity) ||
//				(newTargetActivity instanceof EMPAutoBatchActivity) ||
//				(newTargetActivity instanceof EMPManualBatchActivity)||
//				(newTargetActivity instanceof EMPCompActivity)
//				)
//		{
//			pEndPoint = newTargetActivity;
//		}
		
		
		EMPActivity oldTargetActivity = targetActivity;
		targetActivity = newTargetActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY, oldTargetActivity, newTargetActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetActivity(EMPActivity newTargetActivity) {
		if (newTargetActivity != targetActivity) {
			NotificationChain msgs = null;
			if (targetActivity != null)
				msgs = ((InternalEObject)targetActivity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS, EMPActivity.class, msgs);
			if (newTargetActivity != null)
				msgs = ((InternalEObject)newTargetActivity).eInverseAdd(this, ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS, EMPActivity.class, msgs);
			msgs = basicSetTargetActivity(newTargetActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY, newTargetActivity, newTargetActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct getSourceProduct() {
		if (sourceProduct != null && sourceProduct.eIsProxy()) {
			InternalEObject oldSourceProduct = (InternalEObject)sourceProduct;
			sourceProduct = (EMPProduct)eResolveProxy(oldSourceProduct);
			if (sourceProduct != oldSourceProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT, oldSourceProduct, sourceProduct));
			}
		}
		return sourceProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPProduct basicGetSourceProduct() {
		return sourceProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceProduct(EMPProduct newSourceProduct, NotificationChain msgs) {
		pStartPoint = newSourceProduct;
		
		EMPProduct oldSourceProduct = sourceProduct;
		sourceProduct = newSourceProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT, oldSourceProduct, newSourceProduct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceProduct(EMPProduct newSourceProduct) {
		if (newSourceProduct != sourceProduct) {
			NotificationChain msgs = null;
			if (sourceProduct != null)
				msgs = ((InternalEObject)sourceProduct).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS, EMPProduct.class, msgs);
			if (newSourceProduct != null)
				msgs = ((InternalEObject)newSourceProduct).eInverseAdd(this, ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS, EMPProduct.class, msgs);
			msgs = basicSetSourceProduct(newSourceProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT, newSourceProduct, newSourceProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity getSourceActivity() {
		if (sourceActivity != null && sourceActivity.eIsProxy()) {
			InternalEObject oldSourceActivity = (InternalEObject)sourceActivity;
			sourceActivity = (EMPActivity)eResolveProxy(oldSourceActivity);
			if (sourceActivity != oldSourceActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY, oldSourceActivity, sourceActivity));
			}
		}
		return sourceActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPActivity basicGetSourceActivity() {
		return sourceActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceActivity(EMPActivity newSourceActivity, NotificationChain msgs) {
		pStartPoint = newSourceActivity;
		
		EMPActivity oldSourceActivity = sourceActivity;
		sourceActivity = newSourceActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY, oldSourceActivity, newSourceActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceActivity(EMPActivity newSourceActivity) {
		if (newSourceActivity != sourceActivity) {
			NotificationChain msgs = null;
			if (sourceActivity != null)
				msgs = ((InternalEObject)sourceActivity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS, EMPActivity.class, msgs);
			if (newSourceActivity != null)
				msgs = ((InternalEObject)newSourceActivity).eInverseAdd(this, ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS, EMPActivity.class, msgs);
			msgs = basicSetSourceActivity(newSourceActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY, newSourceActivity, newSourceActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInAnd getSourceInAnd() {
		if (sourceInAnd != null && sourceInAnd.eIsProxy()) {
			InternalEObject oldSourceInAnd = (InternalEObject)sourceInAnd;
			sourceInAnd = (EMPInAnd)eResolveProxy(oldSourceInAnd);
			if (sourceInAnd != oldSourceInAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND, oldSourceInAnd, sourceInAnd));
			}
		}
		return sourceInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInAnd basicGetSourceInAnd() {
		return sourceInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceInAnd(EMPInAnd newSourceInAnd, NotificationChain msgs) {
		pStartPoint = newSourceInAnd;
		
		EMPInAnd oldSourceInAnd = sourceInAnd;
		sourceInAnd = newSourceInAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND, oldSourceInAnd, newSourceInAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInAnd(EMPInAnd newSourceInAnd) {
		if (newSourceInAnd != sourceInAnd) {
			NotificationChain msgs = null;
			if (sourceInAnd != null)
				msgs = ((InternalEObject)sourceInAnd).eInverseRemove(this, ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS, EMPInAnd.class, msgs);
			if (newSourceInAnd != null)
				msgs = ((InternalEObject)newSourceInAnd).eInverseAdd(this, ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS, EMPInAnd.class, msgs);
			msgs = basicSetSourceInAnd(newSourceInAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND, newSourceInAnd, newSourceInAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInAnd getTargetInAnd() {
		if (targetInAnd != null && targetInAnd.eIsProxy()) {
			InternalEObject oldTargetInAnd = (InternalEObject)targetInAnd;
			targetInAnd = (EMPInAnd)eResolveProxy(oldTargetInAnd);
			if (targetInAnd != oldTargetInAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND, oldTargetInAnd, targetInAnd));
			}
		}
		return targetInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInAnd basicGetTargetInAnd() {
		return targetInAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetInAnd(EMPInAnd newTargetInAnd, NotificationChain msgs) {
		pEndPoint = newTargetInAnd;
		
		EMPInAnd oldTargetInAnd = targetInAnd;
		targetInAnd = newTargetInAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND, oldTargetInAnd, newTargetInAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInAnd(EMPInAnd newTargetInAnd) {
		if (newTargetInAnd != targetInAnd) {
			NotificationChain msgs = null;
			if (targetInAnd != null)
				msgs = ((InternalEObject)targetInAnd).eInverseRemove(this, ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS, EMPInAnd.class, msgs);
			if (newTargetInAnd != null)
				msgs = ((InternalEObject)newTargetInAnd).eInverseAdd(this, ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS, EMPInAnd.class, msgs);
			msgs = basicSetTargetInAnd(newTargetInAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND, newTargetInAnd, newTargetInAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInOr getTargetInOr() {
		if (targetInOr != null && targetInOr.eIsProxy()) {
			InternalEObject oldTargetInOr = (InternalEObject)targetInOr;
			targetInOr = (EMPInOr)eResolveProxy(oldTargetInOr);
			if (targetInOr != oldTargetInOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR, oldTargetInOr, targetInOr));
			}
		}
		return targetInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInOr basicGetTargetInOr() {
		return targetInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetInOr(EMPInOr newTargetInOr, NotificationChain msgs) {
		pEndPoint = newTargetInOr;
		
		EMPInOr oldTargetInOr = targetInOr;
		targetInOr = newTargetInOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR, oldTargetInOr, newTargetInOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetInOr(EMPInOr newTargetInOr) {
		if (newTargetInOr != targetInOr) {
			NotificationChain msgs = null;
			if (targetInOr != null)
				msgs = ((InternalEObject)targetInOr).eInverseRemove(this, ProcesspackagePackage.EMP_IN_OR__TARGET_FLOWS, EMPInOr.class, msgs);
			if (newTargetInOr != null)
				msgs = ((InternalEObject)newTargetInOr).eInverseAdd(this, ProcesspackagePackage.EMP_IN_OR__TARGET_FLOWS, EMPInOr.class, msgs);
			msgs = basicSetTargetInOr(newTargetInOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR, newTargetInOr, newTargetInOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInOr getSourceInOr() {
		if (sourceInOr != null && sourceInOr.eIsProxy()) {
			InternalEObject oldSourceInOr = (InternalEObject)sourceInOr;
			sourceInOr = (EMPInOr)eResolveProxy(oldSourceInOr);
			if (sourceInOr != oldSourceInOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR, oldSourceInOr, sourceInOr));
			}
		}
		return sourceInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPInOr basicGetSourceInOr() {
		return sourceInOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceInOr(EMPInOr newSourceInOr, NotificationChain msgs) {
		pStartPoint = newSourceInOr;
		
		EMPInOr oldSourceInOr = sourceInOr;
		sourceInOr = newSourceInOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR, oldSourceInOr, newSourceInOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceInOr(EMPInOr newSourceInOr) {
		if (newSourceInOr != sourceInOr) {
			NotificationChain msgs = null;
			if (sourceInOr != null)
				msgs = ((InternalEObject)sourceInOr).eInverseRemove(this, ProcesspackagePackage.EMP_IN_OR__SOURCE_FLOWS, EMPInOr.class, msgs);
			if (newSourceInOr != null)
				msgs = ((InternalEObject)newSourceInOr).eInverseAdd(this, ProcesspackagePackage.EMP_IN_OR__SOURCE_FLOWS, EMPInOr.class, msgs);
			msgs = basicSetSourceInOr(newSourceInOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR, newSourceInOr, newSourceInOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutAnd getSourceOutAnd() {
		if (sourceOutAnd != null && sourceOutAnd.eIsProxy()) {
			InternalEObject oldSourceOutAnd = (InternalEObject)sourceOutAnd;
			sourceOutAnd = (EMPOutAnd)eResolveProxy(oldSourceOutAnd);
			if (sourceOutAnd != oldSourceOutAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND, oldSourceOutAnd, sourceOutAnd));
			}
		}
		return sourceOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutAnd basicGetSourceOutAnd() {
		return sourceOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceOutAnd(EMPOutAnd newSourceOutAnd, NotificationChain msgs) {
		pStartPoint = newSourceOutAnd;
		
		EMPOutAnd oldSourceOutAnd = sourceOutAnd;
		sourceOutAnd = newSourceOutAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND, oldSourceOutAnd, newSourceOutAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOutAnd(EMPOutAnd newSourceOutAnd) {
		if (newSourceOutAnd != sourceOutAnd) {
			NotificationChain msgs = null;
			if (sourceOutAnd != null)
				msgs = ((InternalEObject)sourceOutAnd).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_AND__SOURCE_FLOWS, EMPOutAnd.class, msgs);
			if (newSourceOutAnd != null)
				msgs = ((InternalEObject)newSourceOutAnd).eInverseAdd(this, ProcesspackagePackage.EMP_OUT_AND__SOURCE_FLOWS, EMPOutAnd.class, msgs);
			msgs = basicSetSourceOutAnd(newSourceOutAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND, newSourceOutAnd, newSourceOutAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutAnd getTargetOutAnd() {
		if (targetOutAnd != null && targetOutAnd.eIsProxy()) {
			InternalEObject oldTargetOutAnd = (InternalEObject)targetOutAnd;
			targetOutAnd = (EMPOutAnd)eResolveProxy(oldTargetOutAnd);
			if (targetOutAnd != oldTargetOutAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND, oldTargetOutAnd, targetOutAnd));
			}
		}
		return targetOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutAnd basicGetTargetOutAnd() {
		return targetOutAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetOutAnd(EMPOutAnd newTargetOutAnd, NotificationChain msgs) {
		pEndPoint = newTargetOutAnd;
		
		EMPOutAnd oldTargetOutAnd = targetOutAnd;
		targetOutAnd = newTargetOutAnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND, oldTargetOutAnd, newTargetOutAnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOutAnd(EMPOutAnd newTargetOutAnd) {
		if (newTargetOutAnd != targetOutAnd) {
			NotificationChain msgs = null;
			if (targetOutAnd != null)
				msgs = ((InternalEObject)targetOutAnd).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_AND__TARGET_FLOWS, EMPOutAnd.class, msgs);
			if (newTargetOutAnd != null)
				msgs = ((InternalEObject)newTargetOutAnd).eInverseAdd(this, ProcesspackagePackage.EMP_OUT_AND__TARGET_FLOWS, EMPOutAnd.class, msgs);
			msgs = basicSetTargetOutAnd(newTargetOutAnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND, newTargetOutAnd, newTargetOutAnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutOr getSourceOutOr() {
		if (sourceOutOr != null && sourceOutOr.eIsProxy()) {
			InternalEObject oldSourceOutOr = (InternalEObject)sourceOutOr;
			sourceOutOr = (EMPOutOr)eResolveProxy(oldSourceOutOr);
			if (sourceOutOr != oldSourceOutOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR, oldSourceOutOr, sourceOutOr));
			}
		}
		return sourceOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutOr basicGetSourceOutOr() {
		return sourceOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetSourceOutOr(EMPOutOr newSourceOutOr, NotificationChain msgs) {
		pStartPoint = newSourceOutOr;
		
		EMPOutOr oldSourceOutOr = sourceOutOr;
		sourceOutOr = newSourceOutOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR, oldSourceOutOr, newSourceOutOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceOutOr(EMPOutOr newSourceOutOr) {
		if (newSourceOutOr != sourceOutOr) {
			NotificationChain msgs = null;
			if (sourceOutOr != null)
				msgs = ((InternalEObject)sourceOutOr).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_OR__SOURCE_FLOWS, EMPOutOr.class, msgs);
			if (newSourceOutOr != null)
				msgs = ((InternalEObject)newSourceOutOr).eInverseAdd(this, ProcesspackagePackage.EMP_OUT_OR__SOURCE_FLOWS, EMPOutOr.class, msgs);
			msgs = basicSetSourceOutOr(newSourceOutOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR, newSourceOutOr, newSourceOutOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutOr getTargetOutOr() {
		if (targetOutOr != null && targetOutOr.eIsProxy()) {
			InternalEObject oldTargetOutOr = (InternalEObject)targetOutOr;
			targetOutOr = (EMPOutOr)eResolveProxy(oldTargetOutOr);
			if (targetOutOr != oldTargetOutOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR, oldTargetOutOr, targetOutOr));
			}
		}
		return targetOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPOutOr basicGetTargetOutOr() {
		return targetOutOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTargetOutOr(EMPOutOr newTargetOutOr, NotificationChain msgs) {
		pEndPoint = newTargetOutOr;
		
		EMPOutOr oldTargetOutOr = targetOutOr;
		targetOutOr = newTargetOutOr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR, oldTargetOutOr, newTargetOutOr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetOutOr(EMPOutOr newTargetOutOr) {
		if (newTargetOutOr != targetOutOr) {
			NotificationChain msgs = null;
			if (targetOutOr != null)
				msgs = ((InternalEObject)targetOutOr).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_OR__TARGET_FLOWS, EMPOutOr.class, msgs);
			if (newTargetOutOr != null)
				msgs = ((InternalEObject)newTargetOutOr).eInverseAdd(this, ProcesspackagePackage.EMP_OUT_OR__TARGET_FLOWS, EMPOutOr.class, msgs);
			msgs = basicSetTargetOutOr(newTargetOutOr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR, newTargetOutOr, newTargetOutOr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPMileStone getMileStone() {
		if (mileStone != null && mileStone.eIsProxy()) {
			InternalEObject oldMileStone = (InternalEObject)mileStone;
			mileStone = (EMPMileStone)eResolveProxy(oldMileStone);
			if (mileStone != oldMileStone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE, oldMileStone, mileStone));
			}
		}
		return mileStone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMPMileStone basicGetMileStone() {
		return mileStone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetMileStone(EMPMileStone newMileStone, NotificationChain msgs) {
		pStartPoint = newMileStone;
		
		EMPMileStone oldMileStone = mileStone;
		mileStone = newMileStone;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE, oldMileStone, newMileStone);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMileStone(EMPMileStone newMileStone) {
		if (newMileStone != mileStone) {
			NotificationChain msgs = null;
			if (mileStone != null)
				msgs = ((InternalEObject)mileStone).eInverseRemove(this, ProcesspackagePackage.EMP_MILE_STONE__DATA_FLOWS, EMPMileStone.class, msgs);
			if (newMileStone != null)
				msgs = ((InternalEObject)newMileStone).eInverseAdd(this, ProcesspackagePackage.EMP_MILE_STONE__DATA_FLOWS, EMPMileStone.class, msgs);
			msgs = basicSetMileStone(newMileStone, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE, newMileStone, newMileStone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEmpDiagram((EMPDiagram)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				if (targetProduct != null)
					msgs = ((InternalEObject)targetProduct).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__TARGET_DATA_FLOWS, EMPProduct.class, msgs);
				return basicSetTargetProduct((EMPProduct)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				if (targetActivity != null)
					msgs = ((InternalEObject)targetActivity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__TARGET_DATA_FLOWS, EMPActivity.class, msgs);
				return basicSetTargetActivity((EMPActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				if (sourceProduct != null)
					msgs = ((InternalEObject)sourceProduct).eInverseRemove(this, ProcesspackagePackage.EMP_PRODUCT__SOURCE_DATA_FLOWS, EMPProduct.class, msgs);
				return basicSetSourceProduct((EMPProduct)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				if (sourceActivity != null)
					msgs = ((InternalEObject)sourceActivity).eInverseRemove(this, ProcesspackagePackage.EMP_ACTIVITY__SOURCE_DATA_FLOWS, EMPActivity.class, msgs);
				return basicSetSourceActivity((EMPActivity)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				if (sourceInAnd != null)
					msgs = ((InternalEObject)sourceInAnd).eInverseRemove(this, ProcesspackagePackage.EMP_IN_AND__SOURCE_FLOWS, EMPInAnd.class, msgs);
				return basicSetSourceInAnd((EMPInAnd)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				if (targetInAnd != null)
					msgs = ((InternalEObject)targetInAnd).eInverseRemove(this, ProcesspackagePackage.EMP_IN_AND__TARGET_FLOWS, EMPInAnd.class, msgs);
				return basicSetTargetInAnd((EMPInAnd)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				if (targetInOr != null)
					msgs = ((InternalEObject)targetInOr).eInverseRemove(this, ProcesspackagePackage.EMP_IN_OR__TARGET_FLOWS, EMPInOr.class, msgs);
				return basicSetTargetInOr((EMPInOr)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				if (sourceInOr != null)
					msgs = ((InternalEObject)sourceInOr).eInverseRemove(this, ProcesspackagePackage.EMP_IN_OR__SOURCE_FLOWS, EMPInOr.class, msgs);
				return basicSetSourceInOr((EMPInOr)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				if (sourceOutAnd != null)
					msgs = ((InternalEObject)sourceOutAnd).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_AND__SOURCE_FLOWS, EMPOutAnd.class, msgs);
				return basicSetSourceOutAnd((EMPOutAnd)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				if (targetOutAnd != null)
					msgs = ((InternalEObject)targetOutAnd).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_AND__TARGET_FLOWS, EMPOutAnd.class, msgs);
				return basicSetTargetOutAnd((EMPOutAnd)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				if (sourceOutOr != null)
					msgs = ((InternalEObject)sourceOutOr).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_OR__SOURCE_FLOWS, EMPOutOr.class, msgs);
				return basicSetSourceOutOr((EMPOutOr)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				if (targetOutOr != null)
					msgs = ((InternalEObject)targetOutOr).eInverseRemove(this, ProcesspackagePackage.EMP_OUT_OR__TARGET_FLOWS, EMPOutOr.class, msgs);
				return basicSetTargetOutOr((EMPOutOr)otherEnd, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				if (mileStone != null)
					msgs = ((InternalEObject)mileStone).eInverseRemove(this, ProcesspackagePackage.EMP_MILE_STONE__DATA_FLOWS, EMPMileStone.class, msgs);
				return basicSetMileStone((EMPMileStone)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				return basicSetEmpDiagram(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				return basicSetTargetProduct(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				return basicSetTargetActivity(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				return basicSetSourceProduct(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				return basicSetSourceActivity(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				return basicSetSourceInAnd(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				return basicSetTargetInAnd(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				return basicSetTargetInOr(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				return basicSetSourceInOr(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				return basicSetSourceOutAnd(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				return basicSetTargetOutAnd(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				return basicSetSourceOutOr(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				return basicSetTargetOutOr(null, msgs);
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				return basicSetMileStone(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ProcesspackagePackage.EMP_DIAGRAM__DATA_FLOWS, EMPDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY:
				return getProbability();
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				return getEmpDiagram();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				if (resolve) return getTargetProduct();
				return basicGetTargetProduct();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				if (resolve) return getTargetActivity();
				return basicGetTargetActivity();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				if (resolve) return getSourceProduct();
				return basicGetSourceProduct();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				if (resolve) return getSourceActivity();
				return basicGetSourceActivity();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				if (resolve) return getSourceInAnd();
				return basicGetSourceInAnd();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				if (resolve) return getTargetInAnd();
				return basicGetTargetInAnd();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				if (resolve) return getTargetInOr();
				return basicGetTargetInOr();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				if (resolve) return getSourceInOr();
				return basicGetSourceInOr();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				if (resolve) return getSourceOutAnd();
				return basicGetSourceOutAnd();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				if (resolve) return getTargetOutAnd();
				return basicGetTargetOutAnd();
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				if (resolve) return getSourceOutOr();
				return basicGetSourceOutOr();
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				if (resolve) return getTargetOutOr();
				return basicGetTargetOutOr();
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				if (resolve) return getMileStone();
				return basicGetMileStone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				setTargetProduct((EMPProduct)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				setTargetActivity((EMPActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				setSourceProduct((EMPProduct)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				setSourceActivity((EMPActivity)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				setSourceInAnd((EMPInAnd)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				setTargetInAnd((EMPInAnd)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				setTargetInOr((EMPInOr)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				setSourceInOr((EMPInOr)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				setSourceOutAnd((EMPOutAnd)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				setTargetOutAnd((EMPOutAnd)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				setSourceOutOr((EMPOutOr)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				setTargetOutOr((EMPOutOr)newValue);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				setMileStone((EMPMileStone)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				setEmpDiagram((EMPDiagram)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				setTargetProduct((EMPProduct)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				setTargetActivity((EMPActivity)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				setSourceProduct((EMPProduct)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				setSourceActivity((EMPActivity)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				setSourceInAnd((EMPInAnd)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				setTargetInAnd((EMPInAnd)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				setTargetInOr((EMPInOr)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				setSourceInOr((EMPInOr)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				setSourceOutAnd((EMPOutAnd)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				setTargetOutAnd((EMPOutAnd)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				setSourceOutOr((EMPOutOr)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				setTargetOutOr((EMPOutOr)null);
				return;
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				setMileStone((EMPMileStone)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcesspackagePackage.EMP_DATA_FLOW__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case ProcesspackagePackage.EMP_DATA_FLOW__EMP_DIAGRAM:
				return getEmpDiagram() != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_PRODUCT:
				return targetProduct != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_ACTIVITY:
				return targetActivity != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_PRODUCT:
				return sourceProduct != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_ACTIVITY:
				return sourceActivity != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_AND:
				return sourceInAnd != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_AND:
				return targetInAnd != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_IN_OR:
				return targetInOr != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_IN_OR:
				return sourceInOr != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_AND:
				return sourceOutAnd != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_AND:
				return targetOutAnd != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__SOURCE_OUT_OR:
				return sourceOutOr != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__TARGET_OUT_OR:
				return targetOutOr != null;
			case ProcesspackagePackage.EMP_DATA_FLOW__MILE_STONE:
				return mileStone != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //EMPDataFlowImpl
