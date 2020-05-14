package offices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class OfficesDaoImpl implements OfficesDao {

	@Override
	public int insert(OfficesVO officesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(officesVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Offices Insert");
		}
	}

	@Override
	public int update(OfficesVO officesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			String sql = "update OfficesVO set" + "addressLine1 = :addressLine1" + "addressLine2 = :addressLine2"
					+ "phone = :phone" + "state = :state" + "city = :city" + "country = :postalCode"
					+ "postalCode = :country" + "territory = :territory" + "where officeCode = :officeCode";

			Query query = dbSession.createQuery(sql);

			query.setParameter("phone", officesVO.getPhone());
			query.setParameter("addressLine1", officesVO.getAddressLine1());
			query.setParameter("addressLine2", officesVO.getAddressLine2());
			query.setParameter("city", officesVO.getCity());
			query.setParameter("state", officesVO.getState());
			query.setParameter("country", officesVO.getCountry());
			query.setParameter("postalCode", officesVO.getPostalCode());
			query.setParameter("territory", officesVO.getTerritory());
			query.setParameter("officeCode", officesVO.getOfficeCode());

			success = query.executeUpdate();
			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Offices Update");
		}
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
		try {
			Session dbSession = DbSession.sessionStart();
			officesVO = dbSession.get(OfficesVO.class, officesVO.getOfficeCode());
			DbSession.sessionEnd();
			return officesVO;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Offices selectOne");
		}
	}

	@Override
	public int delete(OfficesVO officesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			Query query = dbSession.createQuery("Delete OfficesVO where officeCode = :oCode");
			query.setParameter("oCode", officesVO.getOfficeCode());
			success = query.executeUpdate();

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + "::#:: Problem in DB operation @Offices delete");
		}
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
