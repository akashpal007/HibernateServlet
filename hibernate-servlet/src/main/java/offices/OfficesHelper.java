package offices;

import java.util.ArrayList;
import java.util.List;

public class OfficesHelper {

	private OfficesDao getOfficesDao() {
		return new OfficesDaoImpl();
	}

	/**
	 * @param officesVO
	 * @return int
	 * @throws Exception
	 */
	public int saveOffice(OfficesVO officesVO) throws Exception {
		try {
			OfficesDao dao = getOfficesDao();
			return dao.insert(officesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @return ArrayList<OfficesVO>
	 * @throws Exception 
	 */
	public ArrayList<OfficesVO> getAllCustomers() throws Exception {
		ArrayList<OfficesVO> offices = null;
		try {
			OfficesDao officesDao = getOfficesDao();
			offices = (ArrayList<OfficesVO>) officesDao.selectAll();
		} catch (Exception e) {
			throw new Exception(e);
		}
		return offices;
	}

	/**
	 * @return List<OfficesVO>
	 * @throws Exception
	 */
	public List<OfficesVO> getFirstFiveCustomers() throws Exception {
		try {
			List<OfficesVO> offices = null;
			OfficesDao officesDao = getOfficesDao();
			offices = (List<OfficesVO>) officesDao.selectFirstFive();
			return offices;
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @param officesVO
	 * @return int
	 * @throws Exception
	 */
	public int update(OfficesVO officesVO) throws Exception {
		try {
			OfficesDao dao = getOfficesDao();
			return dao.update(officesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	/**
	 * @param officesVO
	 * @return int
	 * @throws Exception
	 */
	public int delete(OfficesVO officesVO) throws Exception {
		try {
			OfficesDao dao = getOfficesDao();
			return dao.delete(officesVO);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

}
