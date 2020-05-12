package employees;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;
import customers.CustomersVO;

public class EmployeesDaoImpl implements EmployeesDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(EmployeesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EmployeesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmployeesVO> selectAll() throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from EmployeesVO");
			List<EmployeesVO> employees = (List<EmployeesVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return employees;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @Employees");
		}
	}

	@Override
	public EmployeesVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(EmployeesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
