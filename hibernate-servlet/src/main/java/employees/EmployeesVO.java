/**
 * 
 */
package employees;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import officers.OfficesVO;

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
	private OfficesVO officeCode;
	
	@ManyToOne
	@JoinColumn(name = "reportsTo")
	@Column(nullable = true)
	private EmployeesVO reportsTo;
	
	@Column(name = "jobTitle", columnDefinition = "")
	private String jobTitle;
}
