package customers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class CustomersDaoImpl implements CustomersDao {

	@Override
	public int insert(CustomersVO customersVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(customersVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Customers Insert");
		}
	}

	@Override
	public int update(CustomersVO customersVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			String sql = "update CustomersVO set" + "customerName = :cName" + "contactFirstName = :cFirstName"
					+ "contactLastName =:cLastName " + "phone = :phone" + "addressLine1 = :addressLine1"
					+ "addressLine2 = :addressLine2" + "city = :city" + "state = :state" + "postalCode = :postalCode"
					+ "country = :country" + "employeesVO = :employeesVO" + "where customerNumber = :cNumber";

			Query query = dbSession.createQuery(sql);

			query.setParameter("cName", customersVO.getCustomerName());
			query.setParameter("cFirstName", customersVO.getContactFirstName());
			query.setParameter("cLastName", customersVO.getContactLastName());
			query.setParameter("phone", customersVO.getPhone());
			query.setParameter("addressLine1", customersVO.getAddressLine1());
			query.setParameter("addressLine2", customersVO.getAddressLine2());
			query.setParameter("city", customersVO.getCity());
			query.setParameter("state", customersVO.getState());
			query.setParameter("postalCode", customersVO.getPostalCode());
			query.setParameter("country", customersVO.getCountry());
			query.setParameter("employeesVO", customersVO.getEmployeesVO());
			query.setParameter("cNumber", customersVO.getCustomerNumber());

			success = query.executeUpdate();
			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Customers Update");
		}
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
		try {
			Session dbSession = DbSession.sessionStart();
			customersVO = dbSession.get(CustomersVO.class, customersVO.getCustomerNumber());
			DbSession.sessionEnd();
			return customersVO;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Customers selectOne");
		}
	}

	@Override
	public int delete(CustomersVO customersVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();
			
			Query query = dbSession.createQuery("Delete CustomersVO where customerNumber = :cNumber");
			query.setParameter("cNumber", customersVO.getCustomerNumber());
			success = query.executeUpdate();
			
			DbSession.sessionEnd();
			return success;
		}catch (Exception e) {
			throw new DbException(e + "::#:: Problem in DB operation @Customers delete");
		}
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
