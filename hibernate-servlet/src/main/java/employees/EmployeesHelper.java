package employees;

import java.util.ArrayList;
import java.util.List;

import customers.CustomersVO;

public class EmployeesHelper {
	private EmployeesDao getEmployeesDao() {
		return new EmployeesDaoImpl();
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

}
