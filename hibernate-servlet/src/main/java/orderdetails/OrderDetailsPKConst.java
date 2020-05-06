package orderdetails;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import orders.OrdersVO;
import products.ProductsVO;
/**
 * @author Akash
 *
 */
//In order to define the composite primary keys, we should follow some rules:
//	The composite primary key class must be public
//	It must have a no-arg constructor
//	It must define equals() and hashCode() methods
//	It must be Serializable

@Embeddable
public class OrderDetailsPKConst implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2674376770651974462L;

	@ManyToOne
	@JoinColumn(name = "orderNumber")
	private OrdersVO orderNumber;
	
	@ManyToOne
	@JoinColumn(name = "orderNumber")
	private ProductsVO productCode;

	public OrderDetailsPKConst(OrdersVO orderNumber, ProductsVO productCode) {
		this.orderNumber = orderNumber;
		this.productCode = productCode;
	}

	/**
	 * @return the orderNumber
	 */
	public OrdersVO getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @return the productCode
	 */
	public ProductsVO getProductCode() {
		return productCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((productCode == null) ? 0 : productCode.hashCode());
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
		OrderDetailsPKConst other = (OrderDetailsPKConst) obj;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		if (productCode == null) {
			if (other.productCode != null)
				return false;
		} else if (!productCode.equals(other.productCode))
			return false;
		return true;
	}

}
