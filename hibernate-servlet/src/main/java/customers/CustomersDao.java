package customers;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface CustomersDao extends BaseDao<CustomersVO> {

	List<CustomersVO> selectFirstFive() throws DbException;

}
