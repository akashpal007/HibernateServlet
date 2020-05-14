package offices;

import java.util.ArrayList;
import java.util.List;

public class OfficesHelper {

	private OfficesDao getOfficesDao() {
		return new OfficesDaoImpl();
	}

	public ArrayList<OfficesVO> getAllCustomers() {
		ArrayList<OfficesVO> offices = null;
		try {
			OfficesDao officesDao = getOfficesDao();
			offices = (ArrayList<OfficesVO>) officesDao.selectAll();
		} catch (Exception e) {
			System.out.println(e);
		}
		return offices;
	}

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

}
