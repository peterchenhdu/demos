package cn.edu.hdu.wsdemo.wsservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.hdu.wsdemo.model.User;
import cn.edu.hdu.wsdemo.service.user.IUserService;

@Path("/userwsservice/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserWSService
{

    @Autowired
    private IUserService userService;

    @GET
    @Path("/users/{id}/")
    public User getUser(@PathParam("id") String id)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id);
        List<User> userList = userService.query(param);

        return userList.size() > 0 ? userList.get(0) : null;
    }

    @POST
    @Path("/users/getall")
    public List<User> getAllUsers()
    {
        List<User> userList = userService.query(new HashMap<String, Object>());
        return userList;
    }

}