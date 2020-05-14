package employees;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class EmployeesDaoImpl implements EmployeesDao {

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
			Session dbSession = DbSession.sessionStart();

			Query query = dbSession.createQuery("from EmployeesVO");
			List<EmployeesVO> employees = (List<EmployeesVO>) query.getResultList();

			DbSession.sessionEnd();
			return employees;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Employees");
		}
	}

	@Override
	public EmployeesVO selectOne(EmployeesVO employeesVO) throws DbException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(EmployeesVO t) throws DbException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmployeesVO> selectFirstFive() throws DbException {
		try {
			Session dbSession = DbSession.sessionStart();

			Query query = dbSession.createQuery("from EmployeesVO");
			query.setFirstResult(0);
			query.setMaxResults(5);
			List<EmployeesVO> employees = (List<EmployeesVO>) query.getResultList();

			DbSession.sessionEnd();
			return employees;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Employees");
		}
	}

}
