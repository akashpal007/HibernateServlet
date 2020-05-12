package productLines;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class ProductLinesDaoImpl implements ProductLinesDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(ProductLinesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ProductLinesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductLinesVO> selectAll() throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from ProductLinesVO");
			List<ProductLinesVO> productLines = (List<ProductLinesVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return productLines;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @ProductLines");
		}
	}

	@Override
	public ProductLinesVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(ProductLinesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
