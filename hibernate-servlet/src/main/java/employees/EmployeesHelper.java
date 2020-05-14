package employees;

import java.util.List;

public class EmployeesHelper {
	private EmployeesDao getEmployeesDao() {
		return new EmployeesDaoImpl();
	}

	/**
	 * @param employeesVO
	 * @return int
	 * @throws Exception
	 */
	public int saveEmployee(EmployeesVO employeesVO) throws Exception {
		try {
			EmployeesDao dao = getEmployeesDao();
			return dao.insert(employeesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @return List<EmployeesVO>
	 * @throws Exception
	 */
	public List<EmployeesVO> getAllEmployees() throws Exception {
		List<EmployeesVO> employees = null;
		try {
			EmployeesDao dao = getEmployeesDao();
			employees = dao.selectAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return employees;
	}

	/**
	 * @return List<EmployeesVO>
	 * @throws Exception
	 */
	public List<EmployeesVO> getFirstFiveEmployees() throws Exception {
		try {
			List<EmployeesVO> employees = null;
			EmployeesDao dao = getEmployeesDao();
			employees = dao.selectFirstFive();
			return employees;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @param employeesVO
	 * @return int
	 * @throws Exception
	 */
	public int update(EmployeesVO employeesVO) throws Exception {
		try {
			EmployeesDao dao = getEmployeesDao();
			return dao.update(employeesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @param employeesVO
	 * @return int
	 * @throws Exception
	 */
	public int delete(EmployeesVO employeesVO) throws Exception {
		try {
			EmployeesDao dao = getEmployeesDao();
			return dao.delete(employeesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
