package orderdetails;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class OrderdetailsDaoImpl implements OrderdetailsDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(OrderDetailsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrderDetailsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderDetailsVO> selectAll() throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from OrderDetailsVO");
			List<OrderDetailsVO> orderDetails = (List<OrderDetailsVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return orderDetails;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @OrderDetails");
		}
	}

	@Override
	public OrderDetailsVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OrderDetailsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
