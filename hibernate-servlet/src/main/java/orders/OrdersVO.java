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
	
	@Column(name = "orderDate", columnDefinition = "")
	private Date orderDate;
	
	@Column(name = "requiredDate", columnDefinition = "")
	private Date requiredDate;
	
	@Column(name = "shippedDate", columnDefinition = "")
	private Date shippedDate;
	
	@Column(name = "status", columnDefinition = "")
	private String status;
	
	@Column(name = "comments", columnDefinition = "")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "customerNumber")
	private CustomersVO customerNumber;
	
}
