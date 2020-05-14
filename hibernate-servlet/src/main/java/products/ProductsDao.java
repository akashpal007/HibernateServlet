package products;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface ProductsDao extends BaseDao<ProductsVO> {

	List<ProductsVO> selectFirstFive() throws DbException;

}
