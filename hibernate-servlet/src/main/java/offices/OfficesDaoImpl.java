package offices;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

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

		try {
			List<OfficesVO> offices = null;

			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OfficesVO");
			offices = (List<OfficesVO>) query.getResultList();

			DbSession.sessionEnd();
			return offices;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation");
		}
	}

	@Override
	public OfficesVO selectOne(OfficesVO officesVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(OfficesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OfficesVO> selectFirstFive() throws DbException {
		try {
			List<OfficesVO> offices = null;

			Session session = DbSession.sessionStart();

			Query query = session.createQuery("from OfficesVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			offices = (List<OfficesVO>) query.getResultList();

			DbSession.sessionEnd();
			return offices;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Offices");
		}
	}

}
