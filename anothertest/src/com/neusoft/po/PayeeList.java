package com.neusoft.po;

/**
 * PayeeList entity. @author MyEclipse Persistence Tools
 */
public class PayeeList extends AbstractPayeeList implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PayeeList() {
	}

	/** full constructor */
	public PayeeList(Integer payeeIdNumber, String payeeName,
			String payeeAccount) {
		super(payeeIdNumber, payeeName, payeeAccount);
	}

}
