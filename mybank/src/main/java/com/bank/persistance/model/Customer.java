/**
 * 
 */
package com.bank.persistance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author cragh
 *
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@Column(name = "ACCT_NO",  unique = true, updatable = false, nullable = false)
	public int acctNo;
	
	@Column(name = "LastName")
	private String lastName;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "SSN")
	private String ssn;

	@Column(name = "Address")
	private String address;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@Column(name = "ZipCode")
	private String zipCode;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

	/**
	 * @return the acctNo
	 */
	public int getAcctNo() {
		return acctNo;
	}

	/**
	 * @param acctNo
	 *            the acctNo to set
	 */
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [acctNo=" + acctNo + ", lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ ", username=" + username + ", password=" + password + ", getAcctNo()=" + getAcctNo()
				+ ", getLastName()=" + getLastName() + ", getFirstName()=" + getFirstName() + ", getSsn()=" + getSsn()
				+ ", getAddress()=" + getAddress() + ", getUsername()=" + getUsername() + ", getCity()=" + getCity()
				+ ", getState()=" + getState() + ", getZipCode()=" + getZipCode() + ", getPassword()=" + getPassword()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}