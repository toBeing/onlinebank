package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractTransactionDetail entity provides the base persistence definition of
 * the TransactionDetail entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTransactionDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private Account account;
	private Date recordDate;
	private Timestamp transactionTime;
	private Long amountPaid;
	private Long amountReceived;
	private Long balance;
	private Integer targetAccount;
	private String targetName;
	private String currency;
	private String type;
	private String location;

	// Constructors

	/** default constructor */
	public AbstractTransactionDetail() {
	}

	/** minimal constructor */
	public AbstractTransactionDetail(Account account, Date recordDate,
			Timestamp transactionTime, Long amountPaid, Long amountReceived,
			Long balance, String currency) {
		this.account = account;
		this.recordDate = recordDate;
		this.transactionTime = transactionTime;
		this.amountPaid = amountPaid;
		this.amountReceived = amountReceived;
		this.balance = balance;
		this.currency = currency;
	}

	/** full constructor */
	public AbstractTransactionDetail(Account account, Date recordDate,
			Timestamp transactionTime, Long amountPaid, Long amountReceived,
			Long balance, Integer targetAccount, String targetName,
			String currency, String type, String location) {
		this.account = account;
		this.recordDate = recordDate;
		this.transactionTime = transactionTime;
		this.amountPaid = amountPaid;
		this.amountReceived = amountReceived;
		this.balance = balance;
		this.targetAccount = targetAccount;
		this.targetName = targetName;
		this.currency = currency;
		this.type = type;
		this.location = location;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
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

	public Integer getTargetAccount() {
		return this.targetAccount;
	}

	public void setTargetAccount(Integer targetAccount) {
		this.targetAccount = targetAccount;
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

}