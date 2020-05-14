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

	/**
	 * @param customersVO
	 * @return int
	 * @throws Exception
	 */
	public int saveCustomer(CustomersVO customersVO) throws Exception {
		try {
			CustomersDao dao = getCustomerDao();
			return dao.insert(customersVO);
		}catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	/**
	 * @return ArrayList<CustomersVO>
	 * @throws Exception
	 */
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

	/**
	 * @return List<CustomersVO>
	 * @throws Exception
	 */
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
	
	/**
	 * @param customersVO
	 * @return int
	 * @throws Exception
	 */
	public int update(CustomersVO customersVO) throws Exception{
		try {
			CustomersDao dao = getCustomerDao();
			return dao.update(customersVO);
		}catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @param customersVO
	 * @return int
	 * @throws Exception
	 */
	public int delete(CustomersVO customersVO) throws Exception{
		try {
			CustomersDao dao = getCustomerDao();
			return dao.delete(customersVO);
		}catch (Exception e) {
			throw new Exception(e);
		}
	}
}
