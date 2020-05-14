package orderdetails;

import java.util.List;

public class OrderdetailsHelper {

	private OrderdetailsDao getOrderdetailsDao() {
		return new OrderdetailsDaoImpl();
	}

	public int saveOrderDetails(OrderDetailsVO orderDetailsVO) throws Exception {
		try {
			OrderdetailsDao dao = getOrderdetailsDao();
			return dao.insert(orderDetailsVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public List<OrderDetailsVO> getAllOrderdetails() throws Exception {
		try {
			OrderdetailsDao dao = getOrderdetailsDao();
			List<OrderDetailsVO> orderDetails = dao.selectAll();
			return orderDetails;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public List<OrderDetailsVO> getFirstFiveOrderdetails() throws Exception {
		try {
			OrderdetailsDao dao = getOrderdetailsDao();
			List<OrderDetailsVO> orderDetails = dao.selectFirstFive();
			return orderDetails;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
