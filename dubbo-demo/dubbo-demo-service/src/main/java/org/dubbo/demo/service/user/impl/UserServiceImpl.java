package org.dubbo.demo.service.user.impl;

import java.util.List;
import java.util.Map;

import org.dubbo.demo.api.service.IUserService;
import org.dubbo.demo.common.model.User;
import org.dubbo.demo.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService
{

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> queryAll(Map<String, Object> param) throws Exception
    {
        return userDao.queryAll(param);
    }

    @Override
    public void saveUser(Map<String, Object> param) throws Exception
    {
        userDao.saveUser(param);

    }

    @Override
    public void deleteUser(Map<String, Object> param) throws Exception
    {
        userDao.deleteUser(param);
    }

}
