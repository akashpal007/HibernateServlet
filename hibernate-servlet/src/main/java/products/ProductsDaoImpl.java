package products;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import base.DbException;
import base.GetSessionFactory;

public class ProductsDaoImpl implements ProductsDao {
	private SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

	@Override
	public int insert(ProductsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ProductsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductsVO> selectAll() throws DbException {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();

			Query query = session.createQuery("from ProductsVO");
			List<ProductsVO> products = (List<ProductsVO>) query.getResultList();

			session.getTransaction().commit();
			session.close();
			return products;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB connection or in DB operation @Products");
		}
	}

	@Override
	public ProductsVO selectOne() throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(ProductsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

}
