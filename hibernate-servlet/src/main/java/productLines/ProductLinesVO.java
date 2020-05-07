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
	@Column(name = "productLine", columnDefinition = "varchar(50) NOT NULL")
	private String productLine;

	@Column(name = "textDescription", columnDefinition = "varchar(4000) DEFAULT NULL")
	private String textDescription;

	@Column(name = "htmlDescription", columnDefinition = "mediumtext")
	private String htmlDescription;

	@Column(name = "image", columnDefinition = "mediumblob")
	private Blob image;

	/**
	 * @return the productLine
	 */
	public String getProductLine() {
		return productLine;
	}

	/**
	 * @param productLine the productLine to set
	 */
	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	/**
	 * @return the textDescription
	 */
	public String getTextDescription() {
		return textDescription;
	}

	/**
	 * @param textDescription the textDescription to set
	 */
	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	/**
	 * @return the htmlDescription
	 */
	public String getHtmlDescription() {
		return htmlDescription;
	}

	/**
	 * @param htmlDescription the htmlDescription to set
	 */
	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	/**
	 * @return the image
	 */
	public Blob getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Blob image) {
		this.image = image;
	}

}
