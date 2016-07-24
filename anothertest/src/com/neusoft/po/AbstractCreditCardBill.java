package com.neusoft.po;

import java.util.Date;

/**
 * AbstractCreditCardBill entity provides the base persistence definition of the
 * CreditCardBill entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCreditCardBill implements java.io.Serializable {

	// Fields

	private Integer id;
	private CreditCard creditCard;
	private Date statementDate;
	private Double dueDate;
	private String currency;
	private Long statementBalance;
	private Long minPayment;
	private Long lastStatementBalance;
	private Long amountPayment;
	private Long amountReceived;

	// Constructors

	/** default constructor */
	public AbstractCreditCardBill() {
	}

	/** full constructor */
	public AbstractCreditCardBill(CreditCard creditCard, Date statementDate,
			Double dueDate, String currency, Long statementBalance,
			Long minPayment, Long lastStatementBalance, Long amountPayment,
			Long amountReceived) {
		this.creditCard = creditCard;
		this.statementDate = statementDate;
		this.dueDate = dueDate;
		this.currency = currency;
		this.statementBalance = statementBalance;
		this.minPayment = minPayment;
		this.lastStatementBalance = lastStatementBalance;
		this.amountPayment = amountPayment;
		this.amountReceived = amountReceived;
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

	public Date getStatementDate() {
		return this.statementDate;
	}

	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}

	public Double getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Double dueDate) {
		this.dueDate = dueDate;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Long getStatementBalance() {
		return this.statementBalance;
	}

	public void setStatementBalance(Long statementBalance) {
		this.statementBalance = statementBalance;
	}

	public Long getMinPayment() {
		return this.minPayment;
	}

	public void setMinPayment(Long minPayment) {
		this.minPayment = minPayment;
	}

	public Long getLastStatementBalance() {
		return this.lastStatementBalance;
	}

	public void setLastStatementBalance(Long lastStatementBalance) {
		this.lastStatementBalance = lastStatementBalance;
	}

	public Long getAmountPayment() {
		return this.amountPayment;
	}

	public void setAmountPayment(Long amountPayment) {
		this.amountPayment = amountPayment;
	}

	public Long getAmountReceived() {
		return this.amountReceived;
	}

	public void setAmountReceived(Long amountReceived) {
		this.amountReceived = amountReceived;
	}

}