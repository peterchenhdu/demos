/*
 * File Name: MyException.java
 * Copyright: Copyright 2016-2016 CHENPI All Rights Reserved.

 * Description:
 * Author: Pi Chen
 * Create Date: 2016年11月30日

 * Modifier: Pi Chen
 * Modify Date: 2016年11月30日
 * Bugzilla Id:
 * Modify Content:
 */
package cn.edu.hdu.wsdemo.core.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.edu.hdu.wsdemo.common.base.BaseController;

/**
 * @author Pi Chen
 * @version wsdemo V1.0.0, 2016年11月30日
 * @see
 * @since wsdemo V1.0.0
 */
@ControllerAdvice
public class SysExceptionHandler extends BaseController
{

    /**
     * 处理controller抛出的异常
     *
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String handleException(HttpServletRequest request, Exception e)
    {
        logger.error("Request FAILD, URL = {} ", request.getRequestURI());
        logger.error(e.toString(), e);
        return gson.toJson(BaseController.FAILD);
    }

}
