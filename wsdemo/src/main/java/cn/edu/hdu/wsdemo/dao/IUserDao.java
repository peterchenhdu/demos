package cn.edu.hdu.wsdemo.dao;

import java.util.List;
import java.util.Map;

import cn.edu.hdu.wsdemo.model.User;

/**
 * @author Pi Chen
 * @version wsdemo V1.0.0, 2016年8月12日
 * @see
 * @since wsdemo V1.0.0
 */

public interface IUserDao
{
    public List<User> query(Map<String, Object> param);

    public void saveUser(Map<String, Object> param);

    public void deleteUser(Map<String, Object> param);
}
