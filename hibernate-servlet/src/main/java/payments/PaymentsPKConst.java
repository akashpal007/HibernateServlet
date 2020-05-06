/**
 * 
 */
package payments;

import java.io.Serializable;

import customers.CustomersVO;

/**
 * @author Akash 
 * In order to define the composite primary keys, we should follow
 *         some rules: The composite primary key class must be public It must
 *         have a no-arg constructor It must define equals() and hashCode()
 *         methods It must be Serializable
 */

public class PaymentsPKConst implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4468481636527257965L;

	/**
	 * 
	 */

	private CustomersVO customerNumber;

	private String checkNumber;

	// Constructor
	public PaymentsPKConst(CustomersVO customerNumber, String checkNumber) {
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
	}

	/**
	 * @return the customerNumber
	 */
	public CustomersVO getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @return the checkNumber
	 */
	public String getCheckNumber() {
		return checkNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkNumber == null) ? 0 : checkNumber.hashCode());
		result = prime * result + ((customerNumber == null) ? 0 : customerNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentsPKConst other = (PaymentsPKConst) obj;
		if (checkNumber == null) {
			if (other.checkNumber != null)
				return false;
		} else if (!checkNumber.equals(other.checkNumber))
			return false;
		if (customerNumber == null) {
			if (other.customerNumber != null)
				return false;
		} else if (!customerNumber.equals(other.customerNumber))
			return false;
		return true;
	}

}
