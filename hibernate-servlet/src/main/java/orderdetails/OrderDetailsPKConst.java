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
	private OrdersVO ordersVO;
	
	@ManyToOne
	@JoinColumn(name = "productCode")
	private ProductsVO productsVO;

	public OrderDetailsPKConst() {
		
	}
	
	public OrderDetailsPKConst(OrdersVO ordersVO, ProductsVO productsVO) {
		this.ordersVO = ordersVO;
		this.productsVO = productsVO;
	}

	/**
	 * @return the orderNumber
	 */
	public OrdersVO getOrderNumber() {
		return ordersVO;
	}

	/**
	 * @return the productCode
	 */
	public ProductsVO getProductCode() {
		return productsVO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ordersVO == null) ? 0 : ordersVO.hashCode());
		result = prime * result + ((productsVO == null) ? 0 : productsVO.hashCode());
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
		if (ordersVO == null) {
			if (other.ordersVO != null)
				return false;
		} else if (!ordersVO.equals(other.ordersVO))
			return false;
		if (productsVO == null) {
			if (other.productsVO != null)
				return false;
		} else if (!productsVO.equals(other.productsVO))
			return false;
		return true;
	}

}
