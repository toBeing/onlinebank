package com.neusoft.po;

import java.util.Date;

/**
 * CreditCardBill entity. @author MyEclipse Persistence Tools
 */
public class CreditCardBill extends AbstractCreditCardBill implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CreditCardBill() {
	}

	/** full constructor */
	public CreditCardBill(CreditCard creditCard, Date statementDate,
			Double dueDate, String currency, Long statementBalance,
			Long minPayment, Long lastStatementBalance, Long amountPayment,
			Long amountReceived) {
		super(creditCard, statementDate, dueDate, currency, statementBalance,
				minPayment, lastStatementBalance, amountPayment, amountReceived);
	}

}
