/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.infopackage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import vpml.infopackage.EMILeafProduct;
import vpml.infopackage.InfopackagePackage;

import vpml.utilpackage.DSDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMI Leaf Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getIotype <em>Iotype</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getInitList <em>Init List</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getDurationTime <em>Duration Time</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getDbTable <em>Db Table</em>}</li>
 *   <li>{@link vpml.infopackage.impl.EMILeafProductImpl#getDbTableItem <em>Db Table Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMILeafProductImpl extends EMIProductImpl implements EMILeafProduct {
	/**
	 * The default value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductID() <em>Product ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductID()
	 * @generated
	 * @ordered
	 */
	protected String productID = PRODUCT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected String attachment = ATTACHMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIotype() <em>Iotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotype()
	 * @generated
	 * @ordered
	 */
	protected static final String IOTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIotype() <em>Iotype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIotype()
	 * @generated
	 * @ordered
	 */
	protected String iotype = IOTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected Integer interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitList() <em>Init List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitList()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INIT_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitList() <em>Init List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitList()
	 * @generated
	 * @ordered
	 */
	protected Integer initList = INIT_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final Double COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected Double cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDurationTime() <em>Duration Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationTime()
	 * @generated
	 * @ordered
	 */
	protected DSDistribution durationTime = null;

	/**
	 * The default value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected String database = DATABASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_TABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbTable() <em>Db Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTable()
	 * @generated
	 * @ordered
	 */
	protected String dbTable = DB_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDbTableItem() <em>Db Table Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTableItem()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_TABLE_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbTableItem() <em>Db Table Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTableItem()
	 * @generated
	 * @ordered
	 */
	protected String dbTableItem = DB_TABLE_ITEM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMILeafProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return InfopackagePackage.Literals.EMI_LEAF_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductID(String newProductID) {
		String oldProductID = productID;
		productID = newProductID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID, oldProductID, productID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachment() {
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachment(String newAttachment) {
		String oldAttachment = attachment;
		attachment = newAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT, oldAttachment, attachment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIotype() {
		return iotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIotype(String newIotype) {
		String oldIotype = iotype;
		iotype = newIotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE, oldIotype, iotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(Integer newInterval) {
		Integer oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInitList() {
		return initList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitList(Integer newInitList) {
		Integer oldInitList = initList;
		initList = newInitList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST, oldInitList, initList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(Double newCost) {
		Double oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSDistribution getDurationTime() {
		return durationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurationTime(DSDistribution newDurationTime, NotificationChain msgs) {
		DSDistribution oldDurationTime = durationTime;
		durationTime = newDurationTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME, oldDurationTime, newDurationTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationTime(DSDistribution newDurationTime) {
		if (newDurationTime != durationTime) {
			NotificationChain msgs = null;
			if (durationTime != null)
				msgs = ((InternalEObject)durationTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME, null, msgs);
			if (newDurationTime != null)
				msgs = ((InternalEObject)newDurationTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME, null, msgs);
			msgs = basicSetDurationTime(newDurationTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME, newDurationTime, newDurationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(String newDatabase) {
		String oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE, oldDatabase, database));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbTable() {
		return dbTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTable(String newDbTable) {
		String oldDbTable = dbTable;
		dbTable = newDbTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE, oldDbTable, dbTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbTableItem() {
		return dbTableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbTableItem(String newDbTableItem) {
		String oldDbTableItem = dbTableItem;
		dbTableItem = newDbTableItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM, oldDbTableItem, dbTableItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
				return basicSetDurationTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID:
				return getProductID();
			case InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT:
				return getAttachment();
			case InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE:
				return getIotype();
			case InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL:
				return getInterval();
			case InfopackagePackage.EMI_LEAF_PRODUCT__UNIT:
				return getUnit();
			case InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST:
				return getInitList();
			case InfopackagePackage.EMI_LEAF_PRODUCT__COST:
				return getCost();
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
				return getDurationTime();
			case InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE:
				return getDatabase();
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE:
				return getDbTable();
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM:
				return getDbTableItem();
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
			case InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID:
				setProductID((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT:
				setAttachment((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE:
				setIotype((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__UNIT:
				setUnit((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST:
				setInitList((Integer)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__COST:
				setCost((Double)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
				setDurationTime((DSDistribution)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE:
				setDatabase((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE:
				setDbTable((String)newValue);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM:
				setDbTableItem((String)newValue);
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
			case InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID:
				setProductID(PRODUCT_ID_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT:
				setAttachment(ATTACHMENT_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE:
				setIotype(IOTYPE_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST:
				setInitList(INIT_LIST_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__COST:
				setCost(COST_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
				setDurationTime((DSDistribution)null);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE:
				setDatabase(DATABASE_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE:
				setDbTable(DB_TABLE_EDEFAULT);
				return;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM:
				setDbTableItem(DB_TABLE_ITEM_EDEFAULT);
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
			case InfopackagePackage.EMI_LEAF_PRODUCT__PRODUCT_ID:
				return PRODUCT_ID_EDEFAULT == null ? productID != null : !PRODUCT_ID_EDEFAULT.equals(productID);
			case InfopackagePackage.EMI_LEAF_PRODUCT__ATTACHMENT:
				return ATTACHMENT_EDEFAULT == null ? attachment != null : !ATTACHMENT_EDEFAULT.equals(attachment);
			case InfopackagePackage.EMI_LEAF_PRODUCT__IOTYPE:
				return IOTYPE_EDEFAULT == null ? iotype != null : !IOTYPE_EDEFAULT.equals(iotype);
			case InfopackagePackage.EMI_LEAF_PRODUCT__INTERVAL:
				return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
			case InfopackagePackage.EMI_LEAF_PRODUCT__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case InfopackagePackage.EMI_LEAF_PRODUCT__INIT_LIST:
				return INIT_LIST_EDEFAULT == null ? initList != null : !INIT_LIST_EDEFAULT.equals(initList);
			case InfopackagePackage.EMI_LEAF_PRODUCT__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case InfopackagePackage.EMI_LEAF_PRODUCT__DURATION_TIME:
				return durationTime != null;
			case InfopackagePackage.EMI_LEAF_PRODUCT__DATABASE:
				return DATABASE_EDEFAULT == null ? database != null : !DATABASE_EDEFAULT.equals(database);
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE:
				return DB_TABLE_EDEFAULT == null ? dbTable != null : !DB_TABLE_EDEFAULT.equals(dbTable);
			case InfopackagePackage.EMI_LEAF_PRODUCT__DB_TABLE_ITEM:
				return DB_TABLE_ITEM_EDEFAULT == null ? dbTableItem != null : !DB_TABLE_ITEM_EDEFAULT.equals(dbTableItem);
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
		result.append(" (productID: ");
		result.append(productID);
		result.append(", attachment: ");
		result.append(attachment);
		result.append(", iotype: ");
		result.append(iotype);
		result.append(", interval: ");
		result.append(interval);
		result.append(", unit: ");
		result.append(unit);
		result.append(", initList: ");
		result.append(initList);
		result.append(", cost: ");
		result.append(cost);
		result.append(", database: ");
		result.append(database);
		result.append(", dbTable: ");
		result.append(dbTable);
		result.append(", dbTableItem: ");
		result.append(dbTableItem);
		result.append(')');
		return result.toString();
	}

} //EMILeafProductImpl
