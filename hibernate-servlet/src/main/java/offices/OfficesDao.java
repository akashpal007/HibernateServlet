package offices;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface OfficesDao extends BaseDao<OfficesVO> {

	List<OfficesVO> selectFirstFive() throws DbException;

}
