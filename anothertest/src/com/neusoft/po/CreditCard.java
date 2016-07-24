package com.neusoft.po;

import java.util.Set;

/**
 * CreditCard entity. @author MyEclipse Persistence Tools
 */
public class CreditCard extends AbstractCreditCard implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CreditCard() {
	}

	/** minimal constructor */
	public CreditCard(User user, String cardNumber, String type,
			String currency, Long creditLimit, String password, Long balance,
			String createBank, Integer statementDate, String status,
			Integer dueDate, Long score) {
		super(user, cardNumber, type, currency, creditLimit, password, balance,
				createBank, statementDate, status, dueDate, score);
	}

	/** full constructor */
	public CreditCard(User user, String cardNumber, String name, String type,
			String currency, Long creditLimit, String password, Long balance,
			String createBank, Integer statementDate, String status,
			Integer dueDate, Long score, Set billDetails, Set creditCardBills) {
		super(user, cardNumber, name, type, currency, creditLimit, password,
				balance, createBank, statementDate, status, dueDate, score,
				billDetails, creditCardBills);
	}

}
