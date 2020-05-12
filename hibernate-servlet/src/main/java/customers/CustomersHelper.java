/**
 * 
 */
package customers;

import java.util.ArrayList;

/**
 * @author akash
 *
 */
public class CustomersHelper {
	private CustomersDao getCustomerDao() {
		return new CustomersDaoImpl();
	}

	public ArrayList<CustomersVO> getAllCustomers() throws Exception {
		ArrayList<CustomersVO> customers = null;
		try {
			CustomersDao customersDao = getCustomerDao();
			customers = (ArrayList<CustomersVO>) customersDao.selectAll();
		}catch (Exception e) {
			throw new Exception(e);
		}
		return customers;
	}

}
