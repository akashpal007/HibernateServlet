package products;

import java.util.List;

public class ProductsHelper {
	private ProductsDao getProductsDao() {
		return new ProductsDaoImpl();
	}

	public List<ProductsVO> getAllProducts() throws Exception {
		try {
			ProductsDao dao = getProductsDao();
			List<ProductsVO> products = dao.selectAll();
			return products;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<ProductsVO> getFirstFiveProducts() throws Exception {
		try {
			ProductsDao dao = getProductsDao();
			List<ProductsVO> products = dao.selectFirstFive();
			return products;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
