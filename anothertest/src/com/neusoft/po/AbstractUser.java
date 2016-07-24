package com.neusoft.po;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userName;
	private String password;
	private String phoneNumber;
	private String realName;
	private String idNumber;
	private Timestamp createDate;
	private String createBank;
	private Set creditCards = new HashSet(0);
	private Set accounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(String userName, String password, String phoneNumber,
			String realName, String idNumber, Timestamp createDate,
			String createBank) {
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.realName = realName;
		this.idNumber = idNumber;
		this.createDate = createDate;
		this.createBank = createBank;
	}

	/** full constructor */
	public AbstractUser(String userName, String password, String phoneNumber,
			String realName, String idNumber, Timestamp createDate,
			String createBank, Set creditCards, Set accounts) {
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.realName = realName;
		this.idNumber = idNumber;
		this.createDate = createDate;
		this.createBank = createBank;
		this.creditCards = creditCards;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreateBank() {
		return this.createBank;
	}

	public void setCreateBank(String createBank) {
		this.createBank = createBank;
	}

	public Set getCreditCards() {
		return this.creditCards;
	}

	public void setCreditCards(Set creditCards) {
		this.creditCards = creditCards;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}