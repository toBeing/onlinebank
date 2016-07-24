package com.neusoft.po;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCreditCard entity provides the base persistence definition of the
 * CreditCard entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCreditCard implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String cardNumber;
	private String name;
	private String type;
	private String currency;
	private Long creditLimit;
	private String password;
	private Long balance;
	private String createBank;
	private Integer statementDate;
	private String status;
	private Integer dueDate;
	private Long score;
	private Set billDetails = new HashSet(0);
	private Set creditCardBills = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCreditCard() {
	}

	/** minimal constructor */
	public AbstractCreditCard(User user, String cardNumber, String type,
			String currency, Long creditLimit, String password, Long balance,
			String createBank, Integer statementDate, String status,
			Integer dueDate, Long score) {
		this.user = user;
		this.cardNumber = cardNumber;
		this.type = type;
		this.currency = currency;
		this.creditLimit = creditLimit;
		this.password = password;
		this.balance = balance;
		this.createBank = createBank;
		this.statementDate = statementDate;
		this.status = status;
		this.dueDate = dueDate;
		this.score = score;
	}

	/** full constructor */
	public AbstractCreditCard(User user, String cardNumber, String name,
			String type, String currency, Long creditLimit, String password,
			Long balance, String createBank, Integer statementDate,
			String status, Integer dueDate, Long score, Set billDetails,
			Set creditCardBills) {
		this.user = user;
		this.cardNumber = cardNumber;
		this.name = name;
		this.type = type;
		this.currency = currency;
		this.creditLimit = creditLimit;
		this.password = password;
		this.balance = balance;
		this.createBank = createBank;
		this.statementDate = statementDate;
		this.status = status;
		this.dueDate = dueDate;
		this.score = score;
		this.billDetails = billDetails;
		this.creditCardBills = creditCardBills;
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

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getCreditLimit() {
		return this.creditLimit;
	}

	public void setCreditLimit(Long creditLimit) {
		this.creditLimit = creditLimit;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getBalance() {
		return this.balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getCreateBank() {
		return this.createBank;
	}

	public void setCreateBank(String createBank) {
		this.createBank = createBank;
	}

	public Integer getStatementDate() {
		return this.statementDate;
	}

	public void setStatementDate(Integer statementDate) {
		this.statementDate = statementDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Integer dueDate) {
		this.dueDate = dueDate;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Set getBillDetails() {
		return this.billDetails;
	}

	public void setBillDetails(Set billDetails) {
		this.billDetails = billDetails;
	}

	public Set getCreditCardBills() {
		return this.creditCardBills;
	}

	public void setCreditCardBills(Set creditCardBills) {
		this.creditCardBills = creditCardBills;
	}

}