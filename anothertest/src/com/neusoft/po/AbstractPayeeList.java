package com.neusoft.po;

/**
 * AbstractPayeeList entity provides the base persistence definition of the
 * PayeeList entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPayeeList implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer payeeIdNumber;
	private String payeeName;
	private String payeeAccount;

	// Constructors

	/** default constructor */
	public AbstractPayeeList() {
	}

	/** full constructor */
	public AbstractPayeeList(Integer payeeIdNumber, String payeeName,
			String payeeAccount) {
		this.payeeIdNumber = payeeIdNumber;
		this.payeeName = payeeName;
		this.payeeAccount = payeeAccount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPayeeIdNumber() {
		return this.payeeIdNumber;
	}

	public void setPayeeIdNumber(Integer payeeIdNumber) {
		this.payeeIdNumber = payeeIdNumber;
	}

	public String getPayeeName() {
		return this.payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public String getPayeeAccount() {
		return this.payeeAccount;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}

}