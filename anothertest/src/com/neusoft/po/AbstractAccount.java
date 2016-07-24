package com.neusoft.po;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAccount entity provides the base persistence definition of the
 * Account entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAccount implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String name;
	private String accountNumber;
	private String withdrawalPassword;
	private String transactionPassword;
	private String currency;
	private String createBank;
	private Timestamp createDate;
	private Boolean isSigned;
	private String status;
	private String type;
	private Long balance;
	private Long availableBalance;
	private Set transactionDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAccount() {
	}

	/** minimal constructor */
	public AbstractAccount(User user, String accountNumber,
			String withdrawalPassword, String transactionPassword,
			String currency, String createBank, Timestamp createDate,
			Boolean isSigned, String status, String type, Long balance,
			Long availableBalance) {
		this.user = user;
		this.accountNumber = accountNumber;
		this.withdrawalPassword = withdrawalPassword;
		this.transactionPassword = transactionPassword;
		this.currency = currency;
		this.createBank = createBank;
		this.createDate = createDate;
		this.isSigned = isSigned;
		this.status = status;
		this.type = type;
		this.balance = balance;
		this.availableBalance = availableBalance;
	}

	/** full constructor */
	public AbstractAccount(User user, String name, String accountNumber,
			String withdrawalPassword, String transactionPassword,
			String currency, String createBank, Timestamp createDate,
			Boolean isSigned, String status, String type, Long balance,
			Long availableBalance, Set transactionDetails) {
		this.user = user;
		this.name = name;
		this.accountNumber = accountNumber;
		this.withdrawalPassword = withdrawalPassword;
		this.transactionPassword = transactionPassword;
		this.currency = currency;
		this.createBank = createBank;
		this.createDate = createDate;
		this.isSigned = isSigned;
		this.status = status;
		this.type = type;
		this.balance = balance;
		this.availableBalance = availableBalance;
		this.transactionDetails = transactionDetails;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getWithdrawalPassword() {
		return this.withdrawalPassword;
	}

	public void setWithdrawalPassword(String withdrawalPassword) {
		this.withdrawalPassword = withdrawalPassword;
	}

	public String getTransactionPassword() {
		return this.transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCreateBank() {
		return this.createBank;
	}

	public void setCreateBank(String createBank) {
		this.createBank = createBank;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Boolean getIsSigned() {
		return this.isSigned;
	}

	public void setIsSigned(Boolean isSigned) {
		this.isSigned = isSigned;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getAvailableBalance() {
		return this.availableBalance;
	}

	public void setAvailableBalance(Long availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Set getTransactionDetails() {
		return this.transactionDetails;
	}

	public void setTransactionDetails(Set transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

}