package com.neusoft.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.po.TransactionDetail;

/**
 * A data access object (DAO) providing persistence and search support for
 * TransactionDetail entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.neusoft.po.TransactionDetail
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TransactionDetailDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TransactionDetailDAO.class);
	// property constants
	public static final String AMOUNT_PAID = "amountPaid";
	public static final String AMOUNT_RECEIVED = "amountReceived";
	public static final String BALANCE = "balance";
	public static final String TARGET_ACCOUNT = "targetAccount";
	public static final String TARGET_NAME = "targetName";
	public static final String CURRENCY = "currency";
	public static final String TYPE = "type";
	public static final String LOCATION = "location";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(TransactionDetail transientInstance) {
		log.debug("saving TransactionDetail instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TransactionDetail persistentInstance) {
		log.debug("deleting TransactionDetail instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TransactionDetail findById(java.lang.Integer id) {
		log.debug("getting TransactionDetail instance with id: " + id);
		try {
			TransactionDetail instance = (TransactionDetail) getCurrentSession()
					.get("com.neusoft.po.TransactionDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TransactionDetail instance) {
		log.debug("finding TransactionDetail instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.neusoft.po.TransactionDetail")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TransactionDetail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TransactionDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAmountPaid(Object amountPaid) {
		return findByProperty(AMOUNT_PAID, amountPaid);
	}

	public List findByAmountReceived(Object amountReceived) {
		return findByProperty(AMOUNT_RECEIVED, amountReceived);
	}

	public List findByBalance(Object balance) {
		return findByProperty(BALANCE, balance);
	}

	public List findByTargetAccount(Object targetAccount) {
		return findByProperty(TARGET_ACCOUNT, targetAccount);
	}

	public List findByTargetName(Object targetName) {
		return findByProperty(TARGET_NAME, targetName);
	}

	public List findByCurrency(Object currency) {
		return findByProperty(CURRENCY, currency);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findAll() {
		log.debug("finding all TransactionDetail instances");
		try {
			String queryString = "from TransactionDetail";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TransactionDetail merge(TransactionDetail detachedInstance) {
		log.debug("merging TransactionDetail instance");
		try {
			TransactionDetail result = (TransactionDetail) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TransactionDetail instance) {
		log.debug("attaching dirty TransactionDetail instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TransactionDetail instance) {
		log.debug("attaching clean TransactionDetail instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TransactionDetailDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TransactionDetailDAO) ctx.getBean("TransactionDetailDAO");
	}
}