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

import com.neusoft.po.BillDetail;

/**
 * A data access object (DAO) providing persistence and search support for
 * BillDetail entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.neusoft.po.BillDetail
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class BillDetailDAO {
	private static final Logger log = LoggerFactory
			.getLogger(BillDetailDAO.class);
	// property constants
	public static final String TYPE = "type";
	public static final String LOCATION = "location";
	public static final String CURRENCY = "currency";
	public static final String AMOUNT_PAID = "amountPaid";
	public static final String AMOUNT_RECEIVED = "amountReceived";
	public static final String BALANCE = "balance";
	public static final String SUMMARY = "summary";

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

	public void save(BillDetail transientInstance) {
		log.debug("saving BillDetail instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(BillDetail persistentInstance) {
		log.debug("deleting BillDetail instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BillDetail findById(java.lang.Integer id) {
		log.debug("getting BillDetail instance with id: " + id);
		try {
			BillDetail instance = (BillDetail) getCurrentSession().get(
					"com.neusoft.po.BillDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(BillDetail instance) {
		log.debug("finding BillDetail instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.neusoft.po.BillDetail")
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
		log.debug("finding BillDetail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from BillDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findByCurrency(Object currency) {
		return findByProperty(CURRENCY, currency);
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

	public List findBySummary(Object summary) {
		return findByProperty(SUMMARY, summary);
	}

	public List findAll() {
		log.debug("finding all BillDetail instances");
		try {
			String queryString = "from BillDetail";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public BillDetail merge(BillDetail detachedInstance) {
		log.debug("merging BillDetail instance");
		try {
			BillDetail result = (BillDetail) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(BillDetail instance) {
		log.debug("attaching dirty BillDetail instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BillDetail instance) {
		log.debug("attaching clean BillDetail instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BillDetailDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BillDetailDAO) ctx.getBean("BillDetailDAO");
	}
}