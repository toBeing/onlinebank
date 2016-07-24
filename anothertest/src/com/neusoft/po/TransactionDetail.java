package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * TransactionDetail entity. @author MyEclipse Persistence Tools
 */
public class TransactionDetail extends AbstractTransactionDetail implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public TransactionDetail() {
	}

	/** minimal constructor */
	public TransactionDetail(Account account, Date recordDate,
			Timestamp transactionTime, Long amountPaid, Long amountReceived,
			Long balance, String currency) {
		super(account, recordDate, transactionTime, amountPaid, amountReceived,
				balance, currency);
	}

	/** full constructor */
	public TransactionDetail(Account account, Date recordDate,
			Timestamp transactionTime, Long amountPaid, Long amountReceived,
			Long balance, Integer targetAccount, String targetName,
			String currency, String type, String location) {
		super(account, recordDate, transactionTime, amountPaid, amountReceived,
				balance, targetAccount, targetName, currency, type, location);
	}

}
