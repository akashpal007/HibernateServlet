package orderdetails;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class OrderdetailsDaoImpl implements OrderdetailsDao {

	@Override
	public int insert(OrderDetailsVO orderDetailsVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(orderDetailsVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @OrderDetails Insert");
		}
	}

	@Override
	public int update(OrderDetailsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderDetailsVO> selectAll() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OrderDetailsVO");
			List<OrderDetailsVO> orderDetails = (List<OrderDetailsVO>) query.getResultList();

			DbSession.sessionEnd();
			return orderDetails;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @OrderDetails");
		}
	}

	@Override
	public OrderDetailsVO selectOne(OrderDetailsVO orderDetailsVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OrderDetailsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderDetailsVO> selectFirstFive() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OrderDetailsVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<OrderDetailsVO> orderDetails = (List<OrderDetailsVO>) query.getResultList();
			DbSession.sessionEnd();
			return orderDetails;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @OrderDetails");
		}
	}

}
