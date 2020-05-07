package orderdetails;

import javax.persistence.Column;
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
	
	@Column(name = "quantityOrdered", columnDefinition ="int(11) NOT NULL")
	private double quantityOrdered;
	
	@Column(name = "priceEach", columnDefinition ="decimal(10,2) NOT NULL")
	private double priceEach;
	
	@Column(name = "orderLineNumber", columnDefinition ="smallint(6) NOT NULL")
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
	 * @return the priceEach
	 */
	public double getPriceEach() {
		return priceEach;
	}

	/**
	 * @param priceEach the priceEach to set
	 */
	public void setPriceEach(double priceEach) {
		this.priceEach = priceEach;
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
