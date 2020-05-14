package orderdetails;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface OrderdetailsDao extends BaseDao<OrderDetailsVO> {

	List<OrderDetailsVO> selectFirstFive() throws DbException;

}
