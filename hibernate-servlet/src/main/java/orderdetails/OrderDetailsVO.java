package orderdetails;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Akash
 *
 */
@Entity
@Table(name = "orderdetails")
public class OrderDetailsVO {
	@EmbeddedId
	private OrderDetailsPKConst pkConst;
	private double quantityOrdered;
	private int orderLineNumber;

	/**
	 * @return the pkConst
	 */
	public OrderDetailsPKConst getPkConst() {
		return pkConst;
	}

	/**
	 * @return the quantityOrdered
	 */
	public double getQuantityOrdered() {
		return quantityOrdered;
	}

	/**
	 * @return the orderLineNumber
	 */
	public int getOrderLineNumber() {
		return orderLineNumber;
	}

	/**
	 * @param pkConst the pkConst to set
	 */
	public void setPkConst(OrderDetailsPKConst pkConst) {
		this.pkConst = pkConst;
	}

	/**
	 * @param quantityOrdered the quantityOrdered to set
	 */
	public void setQuantityOrdered(double quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	/**
	 * @param orderLineNumber the orderLineNumber to set
	 */
	public void setOrderLineNumber(int orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
}
