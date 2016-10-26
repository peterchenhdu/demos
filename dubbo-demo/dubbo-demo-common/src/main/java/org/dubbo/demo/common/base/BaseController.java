package org.dubbo.demo.common.base;

import org.dubbo.demo.common.log.Logger;

import com.google.gson.Gson;

public class BaseController
{
    public static final String FAILD = "faild";
    public static final String SUCCESS = "success";

    protected static final Gson gson = new Gson();

    protected Logger logger = Logger.getLogger(this.getClass());

}
