package orders;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class OrdersDaoImpl implements OrdersDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(OrdersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OrdersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrdersVO> selectAll() throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from OrdersVO");
			List<OrdersVO> orders = (List<OrdersVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return orders;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @Orders");
		}
	}

	@Override
	public OrdersVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OrdersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
