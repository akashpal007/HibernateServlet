package offices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;
import customers.CustomersVO;

public class OfficesDaoImpl implements OfficesDao {

	@Override
	public int insert(OfficesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(OfficesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OfficesVO> selectAll() throws DbException {
		List<OfficesVO> offices =null;
		try {
		Session session = GetSessionFactory.getSessionFactory().openSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from OfficesVO");
		offices = (List<OfficesVO>) query.getResultList();
		
		session.getTransaction().commit();
		session.close();
		}catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation");
		}
		return offices;
	}

	@Override
	public OfficesVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OfficesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
