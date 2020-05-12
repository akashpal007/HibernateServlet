package payments;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class PaymentsDaoImpl implements PaymentsDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

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
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from PaymentsVO");
			List<PaymentsVO> payments = (List<PaymentsVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return payments;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @OrderDetails");
		}
	}

	@Override
	public PaymentsVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(PaymentsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
