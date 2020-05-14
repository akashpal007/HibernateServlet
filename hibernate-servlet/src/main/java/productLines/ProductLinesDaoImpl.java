package productLines;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class ProductLinesDaoImpl implements ProductLinesDao {

	@Override
	public int insert(ProductLinesVO productLinesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(productLinesVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @ProductLines Insert");
		}
	}

	@Override
	public int update(ProductLinesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductLinesVO> selectAll() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from ProductLinesVO");
			List<ProductLinesVO> productLines = (List<ProductLinesVO>) query.getResultList();

			DbSession.sessionEnd();
			return productLines;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @ProductLines");
		}
	}

	@Override
	public ProductLinesVO selectOne(ProductLinesVO productLinesVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(ProductLinesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ProductLinesVO> selectFirstFive() throws DbException {
		try {
			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from ProductLinesVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<ProductLinesVO> productLines = (List<ProductLinesVO>) query.getResultList();

			DbSession.sessionEnd();
			return productLines;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @ProductLines");
		}
	}

}
