package payments;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import customers.CustomersVO;

/**
 * @author Akash
 *
 */
@Entity
@Table(name = "payments")
@IdClass(PaymentsPKConst.class)
public class PaymentsVO {
	@Id
	@ManyToOne
	@JoinColumn(name = "customerNumber")
	@Column(name = "customerNumber", columnDefinition = "int(11) NOT NULL")
	private CustomersVO customerNumber;

	@Id
	@Column(name = "checkNumber", columnDefinition = "varchar(50) NOT NULL")
	private String checkNumber;

	@Column(name = "paymentDate", columnDefinition = "date NOT NULL")
	private Date paymentDate;

	@Column(name = "amount", columnDefinition = "decimal(10,2) NOT NULL")
	private double amount;

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

	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(CustomersVO customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @param checkNumber the checkNumber to set
	 */
	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
}