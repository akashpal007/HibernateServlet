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
	private EmployeesVO salesRepEmployeeNumber;
	
	@Column(name = "creditLimit", columnDefinition = "decimal(10,2) DEFAULT NULL")
	private Double creditLimit;

	/**
	 * @return the customerNumber
	 */
	public final Integer getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * @param customerNumber the customerNumber to set
	 */
	public final void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * @return the customerName
	 */
	public final String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the contactLastName
	 */
	public final String getContactLastName() {
		return contactLastName;
	}

	/**
	 * @param contactLastName the contactLastName to set
	 */
	public final void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	/**
	 * @return the contactFirstName
	 */
	public final String getContactFirstName() {
		return contactFirstName;
	}

	/**
	 * @param contactFirstName the contactFirstName to set
	 */
	public final void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	/**
	 * @return the phone
	 */
	public final String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public final void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the addressLine1
	 */
	public final String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public final void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public final String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public final void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */
	public final String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public final void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the postalCode
	 */
	public final String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public final void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the country
	 */
	public final String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public final void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the creditLimit
	 */
	public final Double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * @param creditLimit the creditLimit to set
	 */
	public final void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the salesRepEmployeeNumber
	 */
	public final EmployeesVO getSalesRepEmployeeNumber() {
		return salesRepEmployeeNumber;
	}

	/**
	 * @param salesRepEmployeeNumber the salesRepEmployeeNumber to set
	 */
	public final void setSalesRepEmployeeNumber(EmployeesVO salesRepEmployeeNumber) {
		this.salesRepEmployeeNumber = salesRepEmployeeNumber;
	}
}
