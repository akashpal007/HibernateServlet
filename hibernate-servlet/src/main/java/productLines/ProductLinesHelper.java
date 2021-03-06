package productLines;

import java.util.List;

public class ProductLinesHelper {
	private ProductLinesDao getProductLinesDao() {
		return new ProductLinesDaoImpl();
	}

	public int saveProductLine(ProductLinesVO productLinesVO) throws Exception {
		try {
			ProductLinesDao dao = getProductLinesDao();
			return dao.insert(productLinesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public List<ProductLinesVO> getAllProductLines() throws Exception {
		try {
			ProductLinesDao dao = getProductLinesDao();
			List<ProductLinesVO> productLines = dao.selectAll();
			return productLines;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public List<ProductLinesVO> getFirstFiveProductLines() throws Exception {
		try {
			ProductLinesDao dao = getProductLinesDao();
			List<ProductLinesVO> productLines = dao.selectFirstFive();
			return productLines;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
