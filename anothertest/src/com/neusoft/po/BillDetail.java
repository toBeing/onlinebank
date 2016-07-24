package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * BillDetail entity. @author MyEclipse Persistence Tools
 */
public class BillDetail extends AbstractBillDetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BillDetail() {
	}

	/** minimal constructor */
	public BillDetail(CreditCard creditCard, Date recordDate,
			Timestamp transactionTime, String currency, Long amountPaid,
			Long amountReceived, Long balance) {
		super(creditCard, recordDate, transactionTime, currency, amountPaid,
				amountReceived, balance);
	}

	/** full constructor */
	public BillDetail(CreditCard creditCard, Date recordDate,
			Timestamp transactionTime, String type, String location,
			String currency, Long amountPaid, Long amountReceived,
			Long balance, String summary) {
		super(creditCard, recordDate, transactionTime, type, location,
				currency, amountPaid, amountReceived, balance, summary);
	}

}
