package employees;

import java.util.List;

public class EmployeesHelper {
	private EmployeesDao getEmployeesDao() {
		return new EmployeesDaoImpl();
	}

	public int saveEmployee(EmployeesVO employeesVO) throws Exception {
		try {
			EmployeesDao dao = getEmployeesDao();
			return dao.insert(employeesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

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

}
