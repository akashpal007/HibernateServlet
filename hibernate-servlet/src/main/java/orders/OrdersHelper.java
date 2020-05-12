package orders;

import java.util.List;

public class OrdersHelper {
	private OrdersDao getOrdersDao() {
		return new OrdersDaoImpl();
	}

	public List<OrdersVO> getAllOrders() throws Exception {
		try {
			OrdersDao dao = getOrdersDao();
			List<OrdersVO> orderDetails = dao.selectAll();
			return orderDetails;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
