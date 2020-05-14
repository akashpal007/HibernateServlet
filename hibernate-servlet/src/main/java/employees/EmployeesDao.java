package employees;

import java.util.List;

import base.BaseDao;
import base.DbException;

public interface EmployeesDao extends BaseDao<EmployeesVO> {

	List<EmployeesVO> selectFirstFive() throws DbException;

}
