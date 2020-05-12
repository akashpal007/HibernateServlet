package customers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class CustomersDaoImpl implements CustomersDao {
    private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(CustomersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CustomersVO t) throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			Query query = session.createQuery("from CustomersVO");
			
			session.getTransaction().commit();
			session.close();
			}catch (Exception e) {
				throw new DbException(e + " Problem in DB Connection or in DB Operation");
			}
		return 0;
	}

	@Override
	public List<CustomersVO> selectAll() throws DbException {
		List<CustomersVO> customers =null;
		try {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from CustomersVO");
		customers = (List<CustomersVO>) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		}catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation");
		}
		return customers;
	}

	@Override
	public CustomersVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(CustomersVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
