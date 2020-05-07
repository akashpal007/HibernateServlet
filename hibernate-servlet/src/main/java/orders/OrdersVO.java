/**
 * 
 */
package orders;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import customers.CustomersVO;

/**
 * @author akash
 *
 */
@Entity
@Table(name = "orders")
public class OrdersVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "orderNumber", columnDefinition = "int(11) NOT NULL")
	private Integer orderNumber;
	
	@Column(name = "orderDate", columnDefinition = "date NOT NULL")
	private Date orderDate;
	
	@Column(name = "requiredDate", columnDefinition = "date NOT NULL")
	private Date requiredDate;
	
	@Column(name = "shippedDate", columnDefinition = "date DEFAULT NULL")
	private Date shippedDate;
	
	@Column(name = "status", columnDefinition = "varchar(15) NOT NULL")
	private String status;
	
	@Column(name = "comments", columnDefinition = "text")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "customerNumber")
	private CustomersVO customersVO;

	/**
	 * @return the orderNumber
	 */
	public Integer getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the requiredDate
	 */
	public Date getRequiredDate() {
		return requiredDate;
	}

	/**
	 * @param requiredDate the requiredDate to set
	 */
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	/**
	 * @return the shippedDate
	 */
	public Date getShippedDate() {
		return shippedDate;
	}

	/**
	 * @param shippedDate the shippedDate to set
	 */
	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the customersVO
	 */
	public CustomersVO getCustomersVO() {
		return customersVO;
	}

	/**
	 * @param customersVO the customersVO to set
	 */
	public void setCustomersVO(CustomersVO customersVO) {
		this.customersVO = customersVO;
	}
}
