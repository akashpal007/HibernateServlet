package productLines;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Akash
 *
 */
@Entity
@Table(name = "productlines")
public class ProductLinesVO {
	@Id
	@Column(name = "customerNumber", columnDefinition = "varchar(50) NOT NULL")
	private String productLine;

	@Column(name = "textDescription", columnDefinition = "varchar(4000) DEFAULT NULL")
	private String textDescription;

	@Column(name = "htmlDescription", columnDefinition = "mediumtext")
	private String htmlDescription;

	@Column(name = "htmlDescription", columnDefinition = "mediumblob")
	private Blob image;
}
