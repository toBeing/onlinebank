package com.neusoft.dao;

import java.util.List;
import java.util.Set;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.po.CreditCard;

/**
 * A data access object (DAO) providing persistence and search support for
 * CreditCard entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.neusoft.po.CreditCard
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class CreditCardDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CreditCardDAO.class);
	// property constants
	public static final String CARD_NUMBER = "cardNumber";
	public static final String NAME = "name";
	public static final String TYPE = "type";
	public static final String CURRENCY = "currency";
	public static final String CREDIT_LIMIT = "creditLimit";
	public static final String PASSWORD = "password";
	public static final String BALANCE = "balance";
	public static final String CREATE_BANK = "createBank";
	public static final String STATEMENT_DATE = "statementDate";
	public static final String STATUS = "status";
	public static final String DUE_DATE = "dueDate";
	public static final String SCORE = "score";

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

	public void save(CreditCard transientInstance) {
		log.debug("saving CreditCard instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CreditCard persistentInstance) {
		log.debug("deleting CreditCard instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CreditCard findById(java.lang.Integer id) {
		log.debug("getting CreditCard instance with id: " + id);
		try {
			CreditCard instance = (CreditCard) getCurrentSession().get(
					"com.neusoft.po.CreditCard", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(CreditCard instance) {
		log.debug("finding CreditCard instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.neusoft.po.CreditCard")
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
		log.debug("finding CreditCard instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from CreditCard as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCardNumber(Object cardNumber) {
		return findByProperty(CARD_NUMBER, cardNumber);
	}

	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}

	public List findByType(Object type) {
		return findByProperty(TYPE, type);
	}

	public List findByCurrency(Object currency) {
		return findByProperty(CURRENCY, currency);
	}

	public List findByCreditLimit(Object creditLimit) {
		return findByProperty(CREDIT_LIMIT, creditLimit);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findByBalance(Object balance) {
		return findByProperty(BALANCE, balance);
	}

	public List findByCreateBank(Object createBank) {
		return findByProperty(CREATE_BANK, createBank);
	}

	public List findByStatementDate(Object statementDate) {
		return findByProperty(STATEMENT_DATE, statementDate);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByDueDate(Object dueDate) {
		return findByProperty(DUE_DATE, dueDate);
	}

	public List findByScore(Object score) {
		return findByProperty(SCORE, score);
	}

	public List findAll() {
		log.debug("finding all CreditCard instances");
		try {
			String queryString = "from CreditCard";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public CreditCard merge(CreditCard detachedInstance) {
		log.debug("merging CreditCard instance");
		try {
			CreditCard result = (CreditCard) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(CreditCard instance) {
		log.debug("attaching dirty CreditCard instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CreditCard instance) {
		log.debug("attaching clean CreditCard instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CreditCardDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CreditCardDAO) ctx.getBean("CreditCardDAO");
	}
}