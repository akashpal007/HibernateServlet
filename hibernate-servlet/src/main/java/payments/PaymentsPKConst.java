/**
 * 
 */
package payments;

import java.io.Serializable;

import customers.CustomersVO;

/**
 * @author Akash In order to define the composite primary keys, we should follow
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
	private CustomersVO customersVO;

	private String checkNumber;

	// Constructor
	public PaymentsPKConst(CustomersVO customersVO, String checkNumber) {
		this.customersVO = customersVO;
		this.checkNumber = checkNumber;
	}
	public PaymentsPKConst() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkNumber == null) ? 0 : checkNumber.hashCode());
		result = prime * result + ((customersVO == null) ? 0 : customersVO.hashCode());
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
		if (customersVO == null) {
			if (other.customersVO != null)
				return false;
		} else if (!customersVO.equals(other.customersVO))
			return false;
		return true;
	}

}
