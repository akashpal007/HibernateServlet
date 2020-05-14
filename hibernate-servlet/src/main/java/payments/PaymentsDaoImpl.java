package payments;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class PaymentsDaoImpl implements PaymentsDao {

	@Override
	public int insert(PaymentsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(PaymentsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PaymentsVO> selectAll() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from PaymentsVO");
			List<PaymentsVO> payments = (List<PaymentsVO>) query.getResultList();

			DbSession.sessionEnd();
			return payments;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @OrderDetails");
		}
	}

	@Override
	public PaymentsVO selectOne(PaymentsVO paymentsVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(PaymentsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<PaymentsVO> selectFirstFive() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from PaymentsVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<PaymentsVO> payments = (List<PaymentsVO>) query.getResultList();

			DbSession.sessionEnd();
			return payments;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @OrderDetails");
		}
	}

}
