package products;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class ProductsDaoImpl implements ProductsDao {

	@Override
	public int insert(ProductsVO productsVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(productsVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Products Insert");
		}
	}

	@Override
	public int update(ProductsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductsVO> selectAll() throws DbException {
		try {
			Session session = DbSession.sessionStart();
			session.beginTransaction();

			Query query = session.createQuery("from ProductsVO");
			List<ProductsVO> products = (List<ProductsVO>) query.getResultList();

			DbSession.sessionEnd();
			return products;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Products");
		}
	}

	@Override
	public ProductsVO selectOne(ProductsVO productsVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(ProductsVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductsVO> selectFirstFive() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from ProductsVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<ProductsVO> products = (List<ProductsVO>) query.getResultList();

			DbSession.sessionEnd();
			return products;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Products");
		}
	}

}
