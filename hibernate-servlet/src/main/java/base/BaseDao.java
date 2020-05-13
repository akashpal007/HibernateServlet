package base;

import java.util.List;

public interface BaseDao<T> {
	
	int insert(T t) throws DbException;
	
	int update(T t) throws DbException;
	
	List<T> selectAll() throws DbException;
	
	T selectOne(T t) throws DbException;
	
	int delete(T t) throws DbException;
	
}
