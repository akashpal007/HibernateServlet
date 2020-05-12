package payments;

import java.util.List;

public class PaymentsHelper {

	private PaymentsDao getPaymentsDao() {
		return new PaymentsDaoImpl();
	}

	public List<PaymentsVO> getAllPayments() throws Exception {
		try {
			PaymentsDao dao = getPaymentsDao();
			List<PaymentsVO> payments = dao.selectAll();
			return payments;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
