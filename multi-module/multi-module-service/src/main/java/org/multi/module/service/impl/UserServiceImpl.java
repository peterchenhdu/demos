/*
 * File Name: UserServiceImpl.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月24日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月24日
 * Bugzilla Id: 
 * Modify Content: 
 */
package org.multi.module.service.impl;

import java.util.List;
import java.util.Map;

import org.multi.module.common.model.User;
import org.multi.module.dao.IDAOSupport;
import org.multi.module.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author    Pi Chen
 * @version   webbf V1.0.0, 2016年5月24日
 * @see       
 * @since     webbf V1.0.0
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IDAOSupport<User> daoSupport;
	/**
	 * 
	 * @see cn.edu.hdu.webbf.service.user.IUserService#queryAll()
	 * @return
	 * @throws Exception 
	 */
	@Override
	public List<User> queryAll(Map<String, Object> param) throws Exception {

		
		List<User> userList =  daoSupport.findForList("org.multi.module.dao.user.selectUsers", param);
		return userList;
	}
	/**
	 * 
	 * @see cn.edu.hdu.webbf.service.user.IUserService#saveUser(java.util.Map)
	 * @param param
	 * @throws Exception
	 */
	@Override
	public void saveUser(Map<String, Object> param) throws Exception {
		daoSupport.save("org.multi.module.dao.user.saveUser", param);
		/* test transaction */
//		User user = null;
//		@SuppressWarnings({ "unused", "null" })
//		String name = user.getName();
//		
//		param.put("name", "cp222");
//		param.put("address", "hz222");
//		daoSupport.save("org.multi.module.dao.user.saveUser", param);
		
	}
	/**
	 * 
	 * @see cn.edu.hdu.webbf.service.user.IUserService#deleteUser(java.util.Map)
	 * @param param
	 * @throws Exception
	 */
	@Override
	public void deleteUser(Map<String, Object> param) throws Exception {
		daoSupport.delete("org.multi.module.dao.user.deleteUser", param);
	}

}
