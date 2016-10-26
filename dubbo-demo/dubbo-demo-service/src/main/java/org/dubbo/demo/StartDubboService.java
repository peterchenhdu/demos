package org.dubbo.demo;

import org.dubbo.demo.common.log.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartDubboService
{

    private static Logger logger = Logger.getLogger(StartDubboService.class);

    public static void main(String[] args)
    {
        try
        {
            @SuppressWarnings("resource")
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring.xml");
            context.start();
            logger.info("context start success.");
        }
        catch (Exception e)
        {
            logger.error("context start error.", e);
        }
        synchronized (StartDubboService.class)
        {
            while (true)
            {
                try
                {
                    StartDubboService.class.wait();
                }
                catch (InterruptedException e)
                {
                    logger.error("synchronized error.", e);
                }
            }
        }
    }

}