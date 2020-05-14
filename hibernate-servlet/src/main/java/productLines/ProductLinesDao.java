package productLines;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface ProductLinesDao extends BaseDao<ProductLinesVO> {

	List<ProductLinesVO> selectFirstFive() throws DbException;

}
