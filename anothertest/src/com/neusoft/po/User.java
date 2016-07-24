package com.neusoft.po;

import java.sql.Timestamp;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String password, String phoneNumber,
			String realName, String idNumber, Timestamp createDate,
			String createBank) {
		super(userName, password, phoneNumber, realName, idNumber, createDate,
				createBank);
	}

	/** full constructor */
	public User(String userName, String password, String phoneNumber,
			String realName, String idNumber, Timestamp createDate,
			String createBank, Set creditCards, Set accounts) {
		super(userName, password, phoneNumber, realName, idNumber, createDate,
				createBank, creditCards, accounts);
	}

}
