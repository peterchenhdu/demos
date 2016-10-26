package org.dubbo.demo.listener;

import javax.servlet.ServletContextEvent;

import org.dubbo.demo.common.log.Logger;
import org.springframework.web.context.ContextLoaderListener;

public class InitialListener extends ContextLoaderListener
{
    private static Logger logger = Logger.getLogger(InitialListener.class);

    @Override
    public void contextDestroyed(ServletContextEvent event)
    {
        logger.info("start contextDestroyed.");
        super.contextDestroyed(event);

    }

    @Override
    public void contextInitialized(ServletContextEvent event)
    {
        logger.info("start contextInitialized.");

        super.contextInitialized(event);

    }

}
