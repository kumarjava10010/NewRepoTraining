package com.java.bnak.MyBankDemo;

public class CustomerPojo implements Cloneable {

	String fn;
	String ln;
	String addr;
	String ph;
	int ssn;
	String email;

	/**
	 * @return the fn
	 */
	public String getFn() {
		return fn;
	}

	/**
	 * @param fn
	 *            the fn to set
	 */
	public void setFn(String fn) {

		if (fn.length() > 0) {
			this.fn = fn;
		} else {
			this.fn = "Not Provided";
		}
	}

	/**
	 * @return the ln
	 */
	public String getLn() {
		return ln;
	}

	/**
	 * @param ln
	 *            the ln to set
	 */
	public void setLn(String ln) {
		this.ln = ln;
	}

	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * @param addr
	 *            the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}

	/**
	 * @return the ph
	 */
	public String getPh() {
		return ph;
	}

	/**
	 * @param ph
	 *            the ph to set
	 */
	public void setPh(String ph) {

		if (ph != null) {
			this.ph = ph;
		} else {
			this.ph = "xxx-xxx-xxxx";
		}
	}

	/**
	 * @return the ssn
	 */
	public int getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fn == null) ? 0 : fn.hashCode());
		result = prime * result + ((ln == null) ? 0 : ln.hashCode());
		result = prime * result + ssn;
		return result;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	public boolean equals(CustomerPojo myCust) {
		if (this == myCust)
			return true;

		if (myCust == null) {
			return false;
		}

		if (fn == null) {

			if (myCust.fn != null)
				return false;
		} else if (!fn.equals(myCust.fn)) {
			return false;
		}

		if (ln == null) {
			if (myCust.ln != null)
				return false;
		} else if (!ln.equals(myCust.ln)) {
			return false;
		}

		if (ssn != myCust.ssn) {
			return false;
		}

		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
