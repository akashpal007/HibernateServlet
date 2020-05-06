package products;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import productLines.ProductLinesVO;
/**
 * @author Akash
 *
 */
@Entity
@Table(name = "products")
public class ProductsVO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderNumber", columnDefinition = "varchar(15) NOT NULL")
	private String productCode;
	
	@Column(name = "orderNumber", columnDefinition = "varchar(70) NOT NULL")
	private String productName;
	
	@ManyToOne
	@JoinColumn(name = "productLine")
	private ProductLinesVO productLine;
	
	@Column(name = "orderNumber", columnDefinition = "varchar(10) NOT NULL")
	private String productScale;
	
	@Column(name = "orderNumber", columnDefinition = "varchar(50) NOT NULL")
	private String productVendor;
	
	@Column(name = "orderNumber", columnDefinition = "text NOT NULL")
	private String productDescription;
	
	@Column(name = "orderNumber", columnDefinition = "smallint(6) NOT NULL")
	private int quantityInStock;
	
	@Column(name = "buyPrice", columnDefinition = "varchar(15) NOT NULL")
	private double buyPrice;
	
	@Column(name = "MSRP", columnDefinition = "decimal(10,2) NOT NULL")
	private double mspr;
}
