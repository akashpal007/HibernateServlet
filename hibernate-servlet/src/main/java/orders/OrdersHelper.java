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
	
	public List<OrdersVO> getFirstFiveOrders() throws Exception {
		try {
			OrdersDao dao = getOrdersDao();
			List<OrdersVO> orderDetails = dao.selectFirstFive();
			return orderDetails;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
