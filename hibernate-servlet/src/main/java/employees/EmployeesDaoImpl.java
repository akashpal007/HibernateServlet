package employees;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import base.DbException;
import base.DbSession;

public class EmployeesDaoImpl implements EmployeesDao {

	@Override
	public int insert(EmployeesVO employeesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			success = (int) dbSession.save(employeesVO);

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Employees Insert");
		}
	}

	@Override
	public int update(EmployeesVO employeesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			String sql = "update EmployeesVO set" + "lastName = :lastName" + "firstName = :firstName"
					+ "extension = :extension" + "email = :email" + "officesVO = :officesVO"
					+ "employeesVO = :employeesVO" + "jobTitle = :jobTitle" + "where employeeNumber = :employeeNumber";

			Query query = dbSession.createQuery(sql);

			query.setParameter("lastName", employeesVO.getLastName());
			query.setParameter("firstName", employeesVO.getFirstName());
			query.setParameter("extension", employeesVO.getExtension());
			query.setParameter("email", employeesVO.getEmail());
			query.setParameter("officesVO", employeesVO.getOfficesVO());
			query.setParameter("employeesVO", employeesVO.getEmployeesVO());
			query.setParameter("jobTitle", employeesVO.getJobTitle());
			query.setParameter("employeeNumber", employeesVO.getEmployeeNumber());

			success = query.executeUpdate();
			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Employees Update");
		}
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
		try {
			Session dbSession = DbSession.sessionStart();
			employeesVO = dbSession.get(EmployeesVO.class, employeesVO.getEmployeeNumber());
			DbSession.sessionEnd();
			return employeesVO;
		} catch (Exception e) {
			throw new DbException(e + " ::#:: Problem in DB operation @Employees selectOne");
		}
	}

	@Override
	public int delete(EmployeesVO employeesVO) throws DbException {
		try {
			int success = -1;
			Session dbSession = DbSession.sessionStart();

			Query query = dbSession.createQuery("Delete EmployeesVO where employeeNumber = :eNumber");
			query.setParameter("eNumber", employeesVO.getEmployeeNumber());
			success = query.executeUpdate();

			DbSession.sessionEnd();
			return success;
		} catch (Exception e) {
			throw new DbException(e + "::#:: Problem in DB operation @Offices delete");
		}
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
