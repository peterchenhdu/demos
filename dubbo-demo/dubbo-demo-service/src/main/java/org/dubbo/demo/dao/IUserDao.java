package org.dubbo.demo.dao;

import java.util.List;
import java.util.Map;

import org.dubbo.demo.common.model.User;

public interface IUserDao
{
    public List<User> queryAll(Map<String, Object> param);

    public void saveUser(Map<String, Object> param);

    public void deleteUser(Map<String, Object> param);
}
