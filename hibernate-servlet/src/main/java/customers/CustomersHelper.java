/**
 * 
 */
package customers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author akash
 *
 */
public class CustomersHelper {
	private CustomersDao getCustomerDao() {
		return new CustomersDaoImpl();
	}

	public int saveCustomer(CustomersVO customersVO) throws Exception {
		try {
			CustomersDao dao = getCustomerDao();
			return dao.insert(customersVO);
		}catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public ArrayList<CustomersVO> getAllCustomers() throws Exception {
		try {
			ArrayList<CustomersVO> customers = null;

			CustomersDao customersDao = getCustomerDao();
			customers = (ArrayList<CustomersVO>) customersDao.selectAll();

			return customers;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public List<CustomersVO> getFirstFiveCustomers() throws Exception {
		try {
			List<CustomersVO> customers = null;

			CustomersDao customersDao = getCustomerDao();
			customers = (List<CustomersVO>) customersDao.selectFirstFive();

			return customers;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
