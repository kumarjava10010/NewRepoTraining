/**
 * 
 */
package com.bank.persistance.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author cragh
 *
 */
@Entity
@Table(name = "ACCT_INFO")
public class AcctInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4295416422691613836L;

	@Id
	@Column(name = "ACCT_NO", unique = true, nullable = false)
	private Integer acctNumber;

	@Column(name = "ACCT_TYPE")
	private String acctType;

	@Column(name = "BALANCE")
	private String balance;

	@Column(name = "LASTUPDATEDBY")
	private String lastupdatedby;

	@Column(name = "LASTUPDATEDDATE")
	private String lastupdateddate;
	
	private String transactionAmount;
	private String transactionType;
	
	/*@OneToOne()
	TransactionHistory transaction;*/

	public Integer getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(Integer acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	public String getLastupdateddate() {
		return lastupdateddate;
	}

	public void setLastupdateddate(String lastupdateddate) {
		this.lastupdateddate = lastupdateddate;
	}

	/**
	 * @return the transactionAmount
	 */
	public String getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AcctInfo [acctNumber=" + acctNumber + ", acctType=" + acctType + ", balance=" + balance
				+ ", lastupdatedby=" + lastupdatedby + ", lastupdateddate=" + lastupdateddate + ", transactionAmount="
				+ transactionAmount + ", transactionType=" + transactionType + "]";
	}
	

}
