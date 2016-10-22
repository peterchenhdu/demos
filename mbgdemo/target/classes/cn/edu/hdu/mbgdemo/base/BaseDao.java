package cn.edu.hdu.mbgdemo.base;

import java.util.List;

/**
 * 
 * @author cp_hdu@163.com
 * @version dmi V1.0.0, 2016年10月22日
 * @see
 * @since dmi V1.0.0
 */
public interface BaseDao<T extends BaseModel> {

	List<T> selectAll();

	int delete(String id);

	T select(String id);

	int insert(T record);

	int update(T record);
}
