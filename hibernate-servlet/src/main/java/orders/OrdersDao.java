package orders;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface OrdersDao extends BaseDao<OrdersVO> {

	List<OrdersVO> selectFirstFive() throws DbException;

}
