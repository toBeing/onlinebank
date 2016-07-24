package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractBillDetail entity provides the base persistence definition of the
 * BillDetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBillDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private CreditCard creditCard;
	private Date recordDate;
	private Timestamp transactionTime;
	private String type;
	private String location;
	private String currency;
	private Long amountPaid;
	private Long amountReceived;
	private Long balance;
	private String summary;

	// Constructors

	/** default constructor */
	public AbstractBillDetail() {
	}

	/** minimal constructor */
	public AbstractBillDetail(CreditCard creditCard, Date recordDate,
			Timestamp transactionTime, String currency, Long amountPaid,
			Long amountReceived, Long balance) {
		this.creditCard = creditCard;
		this.recordDate = recordDate;
		this.transactionTime = transactionTime;
		this.currency = currency;
		this.amountPaid = amountPaid;
		this.amountReceived = amountReceived;
		this.balance = balance;
	}

	/** full constructor */
	public AbstractBillDetail(CreditCard creditCard, Date recordDate,
			Timestamp transactionTime, String type, String location,
			String currency, Long amountPaid, Long amountReceived,
			Long balance, String summary) {
		this.creditCard = creditCard;
		this.recordDate = recordDate;
		this.transactionTime = transactionTime;
		this.type = type;
		this.location = location;
		this.currency = currency;
		this.amountPaid = amountPaid;
		this.amountReceived = amountReceived;
		this.balance = balance;
		this.summary = summary;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public Date getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}

	public Timestamp getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getAmountPaid() {
		return this.amountPaid;
	}

	public void setAmountPaid(Long amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Long getAmountReceived() {
		return this.amountReceived;
	}

	public void setAmountReceived(Long amountReceived) {
		this.amountReceived = amountReceived;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}