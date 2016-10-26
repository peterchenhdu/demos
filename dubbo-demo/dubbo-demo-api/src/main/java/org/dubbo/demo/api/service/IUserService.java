package org.dubbo.demo.api.service;

import java.util.List;
import java.util.Map;

import org.dubbo.demo.common.model.User;

public interface IUserService
{
    public List<User> queryAll(Map<String, Object> param) throws Exception;

    public void saveUser(Map<String, Object> param) throws Exception;

    public void deleteUser(Map<String, Object> param) throws Exception;
}
