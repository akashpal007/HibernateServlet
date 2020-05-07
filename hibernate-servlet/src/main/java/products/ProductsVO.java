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
	@Column(name = "productCode", columnDefinition = "varchar(15) NOT NULL")
	private String productCode;
	
	@Column(name = "productName", columnDefinition = "varchar(70) NOT NULL")
	private String productName;
	
	@ManyToOne
	@JoinColumn(name = "productLine")
	private ProductLinesVO productLinesVO;
	
	@Column(name = "productScale", columnDefinition = "varchar(10) NOT NULL")
	private String productScale;
	
	@Column(name = "productVendor", columnDefinition = "varchar(50) NOT NULL")
	private String productVendor;
	
	@Column(name = "productDescription", columnDefinition = "text NOT NULL")
	private String productDescription;
	
	@Column(name = "quantityInStock", columnDefinition = "smallint(6) NOT NULL")
	private int quantityInStock;
	
	@Column(name = "buyPrice", columnDefinition = "varchar(15) NOT NULL")
	private double buyPrice;
	
	@Column(name = "MSRP", columnDefinition = "decimal(10,2) NOT NULL")
	private double mspr;

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productLinesVO
	 */
	public ProductLinesVO getProductLinesVO() {
		return productLinesVO;
	}

	/**
	 * @param productLinesVO the productLinesVO to set
	 */
	public void setProductLinesVO(ProductLinesVO productLinesVO) {
		this.productLinesVO = productLinesVO;
	}

	/**
	 * @return the productScale
	 */
	public String getProductScale() {
		return productScale;
	}

	/**
	 * @param productScale the productScale to set
	 */
	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	/**
	 * @return the productVendor
	 */
	public String getProductVendor() {
		return productVendor;
	}

	/**
	 * @param productVendor the productVendor to set
	 */
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the quantityInStock
	 */
	public int getQuantityInStock() {
		return quantityInStock;
	}

	/**
	 * @param quantityInStock the quantityInStock to set
	 */
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	/**
	 * @return the buyPrice
	 */
	public double getBuyPrice() {
		return buyPrice;
	}

	/**
	 * @param buyPrice the buyPrice to set
	 */
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}

	/**
	 * @return the mspr
	 */
	public double getMspr() {
		return mspr;
	}

	/**
	 * @param mspr the mspr to set
	 */
	public void setMspr(double mspr) {
		this.mspr = mspr;
	}
	
	
}
