package org.dubbo.demo.controller.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dubbo.demo.api.service.IUserService;
import org.dubbo.demo.common.base.BaseController;
import org.dubbo.demo.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/user")
public class UserController extends BaseController
{
    @Reference
    private IUserService userService;

    @RequestMapping(value = "/getUserList", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getUserList(int pageNo, int pageSize)
    {
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<String, Object>();
        try
        {
            Map<String, Object> param = new HashMap<String, Object>();

            param.put("pageNo", pageNo);
            param.put("pageSize", pageSize);
            List<User> userList = userService.queryAll(param);
            map.put("userList", userList);
            return gson.toJson(map);
        }
        catch (Exception e)
        {
            logger.error(e.toString(), e);
        }
        return gson.toJson("faild");
    }

    @RequestMapping(value = "/deleteUser", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String deleteUser(int userId)
    {
        Gson gson = new Gson();
        try
        {
            Map<String, Object> param = new HashMap<String, Object>();

            param.put("userId", userId);
            userService.deleteUser(param);
            return gson.toJson("success");
        }
        catch (Exception e)
        {
            logger.error(e.toString(), e);
        }
        return gson.toJson("faild");
    }

    @RequestMapping(value = "/saveUserTest", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String saveUserTest(String userName, String address)
    {
        Gson gson = new Gson();

        try
        {
            Map<String, Object> param = new HashMap<String, Object>();

            param.put("name", userName);
            param.put("address", address);
            userService.saveUser(param);

        }
        catch (Exception e)
        {
            logger.error(e.toString(), e);
            return gson.toJson("fail");
        }
        return gson.toJson("success");
    }
}
