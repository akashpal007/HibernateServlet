/**
 * 
 */
package employees;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import offices.OfficesVO;

/**
 * @author akash
 *
 */
@Entity
@Table(name = "employees")
public class EmployeesVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employeeNumber", columnDefinition = "int(11) NOT NULL")
	private Integer employeeNumber;

	@Column(name = "lastName", columnDefinition = "varchar(50) NOT NULL")
	private String lastName;

	@Column(name = "firstName", columnDefinition = "varchar(50) NOT NULL")
	private String firstName;

	@Column(name = "extension", columnDefinition = "varchar(10) NOT NULL")
	private String extension;

	@Column(name = "email", columnDefinition = "varchar(100) NOT NULL")
	private String email;

	@ManyToOne
	@JoinColumn(name = "officeCode")
	private OfficesVO officesVO;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reportsTo")
	private EmployeesVO employeesVO;

	@Column(name = "jobTitle", columnDefinition = "varchar(50) NOT NULL")
	private String jobTitle;

	/**
	 * @return the employeeNumber
	 */
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	/**
	 * @param employeeNumber the employeeNumber to set
	 */
	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the extension
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * @param extension the extension to set
	 */
	public void setExtension(String extension) {
		this.extension = extension;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the officesVO
	 */
	public OfficesVO getOfficesVO() {
		return officesVO;
	}

	/**
	 * @param officesVO the officesVO to set
	 */
	public void setOfficesVO(OfficesVO officesVO) {
		this.officesVO = officesVO;
	}

	/**
	 * @return the employeesVO
	 */
	public EmployeesVO getEmployeesVO() {
		return employeesVO;
	}

	/**
	 * @param employeesVO the employeesVO to set
	 */
	public void setEmployeesVO(EmployeesVO employeesVO) {
		this.employeesVO = employeesVO;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
