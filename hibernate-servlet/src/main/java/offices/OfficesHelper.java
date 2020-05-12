package offices;

import java.util.ArrayList;

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

}
