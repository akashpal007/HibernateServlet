package payments;

import java.util.List;

public class PaymentsHelper {

	private PaymentsDao getPaymentsDao() {
		return new PaymentsDaoImpl();
	}

	public int savePayment(PaymentsVO paymentsVO) throws Exception {
		try {
			PaymentsDao dao = getPaymentsDao();
			return dao.insert(paymentsVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
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

	public List<PaymentsVO> getFirstFivePayments() throws Exception {
		try {
			PaymentsDao dao = getPaymentsDao();
			List<PaymentsVO> payments = dao.selectFirstFive();
			return payments;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
