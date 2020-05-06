/**
 * 
 */
package offices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author akash
 *
 */
@Entity
@Table(name = "employees")
public class OfficesVO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "officeCode", columnDefinition = "varchar(50) NOT NULL")
	private String officeCode;
	
	@Column(name = "city", columnDefinition = "varchar(50) NOT NULL")
	private String city;
	
	@Column(name = "phone", columnDefinition = "varchar(50) NOT NULL")
	private String phone;
	
	@Column(name = "addressLine1", columnDefinition = "varchar(50) NOT NULL")
	private String addressLine1;
	
	@Column(name = "addressLine2", columnDefinition = "varchar(50) DEFAULT NULL")
	private String addressLine2;
	
	@Column(name = "state", columnDefinition = "varchar(50) DEFAULT NULL")
	private String state;
	
	@Column(name = "country", columnDefinition = "varchar(50) NOT NULL")
	private String country;
	
	@Column(name = "postalCode", columnDefinition = "varchar(15) NOT NULL")
	private String postalCode;
	
	@Column(name = "territory", columnDefinition = "varchar(10) NOT NULL")
	private String territory;


}
