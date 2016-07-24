package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */
public class Account extends AbstractAccount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(User user, String accountNumber, String withdrawalPassword,
			String transactionPassword, String currency, String createBank,
			Timestamp createDate, Boolean isSigned, String status, String type,
			Long balance, Long availableBalance) {
		super(user, accountNumber, withdrawalPassword, transactionPassword,
				currency, createBank, createDate, isSigned, status, type,
				balance, availableBalance);
	}

	/** full constructor */
	public Account(User user, String name, String accountNumber,
			String withdrawalPassword, String transactionPassword,
			String currency, String createBank, Timestamp createDate,
			Boolean isSigned, String status, String type, Long balance,
			Long availableBalance, Set transactionDetails) {
		super(user, name, accountNumber, withdrawalPassword,
				transactionPassword, currency, createBank, createDate,
				isSigned, status, type, balance, availableBalance,
				transactionDetails);
	}

}
