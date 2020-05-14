package payments;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface PaymentsDao extends BaseDao<PaymentsVO> {

	List<PaymentsVO> selectFirstFive() throws DbException;

}
