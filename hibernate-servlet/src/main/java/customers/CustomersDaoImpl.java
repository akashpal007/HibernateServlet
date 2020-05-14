package customers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class CustomersDaoImpl implements CustomersDao {

	@Override
	public int insert(CustomersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CustomersVO t) throws DbException {
		return 0;
	}

	@Override
	public List<CustomersVO> selectAll() throws DbException {
		try {
			List<CustomersVO> customers = null;
			Session dbSession = DbSession.sessionStart();
			Query query = dbSession.createQuery("from CustomersVO");
			customers = (List<CustomersVO>) query.getResultList();
			// Transaction -> commit() and closing the session
			DbSession.sessionEnd();
			return customers;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation");
		}
	}

	@Override
	public CustomersVO selectOne(CustomersVO customersVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(CustomersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CustomersVO> selectFirstFive() throws DbException {
		try {
			List<CustomersVO> customers = null;
			Session dbSession = DbSession.sessionStart();
			Query query = dbSession.createQuery("from CustomersVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			customers = (List<CustomersVO>) query.getResultList();
			// Transaction -> commit() and closing the session
			DbSession.sessionEnd();
			return customers;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation");
		}
	}

}
