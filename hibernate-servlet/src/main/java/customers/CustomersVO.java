/**
 * 
 */
package customers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import employees.EmployeesVO;

/**
 * @author Akash
 *
 */
@Entity
@Table(name = "customers")
public class CustomersVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "customerNumber", columnDefinition = "int(11) NOT NULL")
	private Integer customerNumber;

	@Column(name = "customerName", columnDefinition = "varchar(50) NOT NULL")
	private String customerName;

	@Column(name = "contactLastName", columnDefinition = "varchar(50) NOT NULL")
	private String contactLastName;

	@Column(name = "contactFirstName", columnDefinition = "varchar(50) NOT NULL")
	private String contactFirstName;

	@Column(name = "phone", columnDefinition = "varchar(50) NOT NULL")
	private String phone;

	@Column(name = "addressLine1", columnDefinition = "varchar(50) NOT NULL")
	private String addressLine1;

	@Column(name = "addressLine2", columnDefinition = "varchar(50) DEFAULT NULL")
	private String addressLine2;

	@Column(name = "city", columnDefinition = "varchar(50) NOT NULL")
	private String city;

	@Column(name = "state", columnDefinition = "varchar(50) DEFAULT NULL")
	private String state;

	@Column(name = "postalCode", columnDefinition = "varchar(15) DEFAULT NULL")
	private String postalCode;

	@Column(name = "country", columnDefinition = "varchar(50) NOT NULL")
	private String country;

	@ManyToOne
	@JoinColumn(name = "salesRepEmployeeNumber")
	private EmployeesVO employeesVO;

	@Column(name = "creditLimit", columnDefinition = "decimal(10,2) DEFAULT NULL")
	private Double creditLimit;

	/**
	 * @return the customerNumber
	 */
	public Integer getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the contactLastName
	 */
	public String getContactLastName() {
		return contactLastName;
	}

	/**
	 * @return the contactFirstName
	 */
	public String getContactFirstName() {
		return contactFirstName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the employeesVO
	 */
	public EmployeesVO getEmployeesVO() {
		return employeesVO;
	}

	/**
	 * @return the creditLimit
	 */
	public Double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @param contactLastName the contactLastName to set
	 */
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	/**
	 * @param contactFirstName the contactFirstName to set
	 */
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param employeesVO the employeesVO to set
	 */
	public void setEmployeesVO(EmployeesVO employeesVO) {
		this.employeesVO = employeesVO;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	
}
