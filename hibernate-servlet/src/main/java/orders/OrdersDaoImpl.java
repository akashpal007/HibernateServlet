package orders;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class OrdersDaoImpl implements OrdersDao {
	@Override
	public int insert(OrdersVO ordersVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(ordersVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Orders Insert");
		}
	}

	@Override
	public int update(OrdersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrdersVO> selectAll() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OrdersVO");
			List<OrdersVO> orders = (List<OrdersVO>) query.getResultList();

			DbSession.sessionEnd();
			return orders;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Orders");
		}
	}

	@Override
	public OrdersVO selectOne(OrdersVO ordersVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OrdersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrdersVO> selectFirstFive() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OrdersVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<OrdersVO> orders = (List<OrdersVO>) query.getResultList();

			DbSession.sessionEnd();
			return orders;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Orders");
		}
	}

}
