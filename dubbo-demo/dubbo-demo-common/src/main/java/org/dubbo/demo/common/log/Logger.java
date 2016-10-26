package org.dubbo.demo.common.log;

import org.slf4j.LoggerFactory;
import org.slf4j.helpers.MessageFormatter;

public class Logger
{
    private org.slf4j.Logger logger;

    public Logger(Class<?> clazz)
    {
        this.logger = LoggerFactory.getLogger(clazz);
    }

    public Logger(String name)
    {
        this.logger = LoggerFactory.getLogger(name);
    }

    // static methods
    // -------------------------------------------------------------------------------------------------

    public static Logger getLogger(Class<?> clazz)
    {
        return new Logger(clazz);
    }

    public static Logger getLogger(String name)
    {
        return new Logger(name);
    }

    // public methods
    // -------------------------------------------------------------------------------------------------

    public String getName()
    {
        return this.logger.getName();
    }

    public boolean isTraceEnabled()
    {
        return this.logger.isTraceEnabled();
    }

    public void trace(String message)
    {
        this.logger.trace(message);
    }

    public void trace(String message, Object parameter)
    {
        this.logger.trace(message, parameter);
    }

    public void trace(String message, Object... parameters)
    {
        // This is where magic happens and syntax sugar is offered...
        // The interface overrides an Object[] and offers Object... instead!
        // Awesome, ain't it? No. It should come as standard in SLF4J.
        this.logger.trace(message, parameters);
    }

    public void trace(String message, Throwable throwable)
    {
        this.logger.trace(message, throwable);
    }

    public void trace(String message, Throwable throwable, Object... parameters)
    {
        if (this.logger.isTraceEnabled())
        {
            this.logger.trace(MessageFormatter.arrayFormat(message, parameters).getMessage(),
                throwable);
        }
    }

    public boolean isDebugEnabled()
    {
        return this.logger.isDebugEnabled();
    }

    public void debug(String message)
    {
        this.logger.debug(message);
    }

    public void debug(String message, Object parameter)
    {
        this.logger.debug(message, parameter);
    }

    public void debug(String message, Object... parameters)
    {
        this.logger.debug(message, parameters);
    }

    public void debug(String message, Throwable throwable)
    {
        this.logger.debug(message, throwable);
    }

    public void debug(String message, Throwable throwable, Object... parameters)
    {
        if (this.logger.isDebugEnabled())
        {
            this.logger.debug(MessageFormatter.arrayFormat(message, parameters).getMessage(),
                throwable);
        }
    }

    public boolean isInfoEnabled()
    {
        return this.logger.isInfoEnabled();
    }

    public void info(String message)
    {
        this.logger.info(message);
    }

    public void info(String message, Object parameter)
    {
        this.logger.info(message, parameter);
    }

    public void info(String message, Object... parameters)
    {
        this.logger.info(message, parameters);
    }

    public void info(String message, Throwable throwable)
    {
        this.logger.info(message, throwable);
    }

    public void info(String message, Throwable throwable, Object... parameters)
    {
        if (this.logger.isInfoEnabled())
        {
            this.logger.info(MessageFormatter.arrayFormat(message, parameters).getMessage(),
                throwable);
        }
    }

    public boolean isWarnEnabled()
    {
        return this.logger.isWarnEnabled();
    }

    public void warn(String message)
    {
        this.logger.warn(message);
    }

    public void warn(String message, Object parameter)
    {
        this.logger.warn(message, parameter);
    }

    public void warn(String message, Object... parameters)
    {
        this.logger.warn(message, parameters);
    }

    public void warn(String message, Throwable throwable)
    {
        this.logger.warn(message, throwable);
    }

    public void warn(String message, Throwable throwable, Object... parameters)
    {
        if (this.logger.isWarnEnabled())
        {
            this.logger.warn(MessageFormatter.arrayFormat(message, parameters).getMessage(),
                throwable);
        }
    }

    public boolean isErrorEnabled()
    {
        return this.logger.isErrorEnabled();
    }

    public void error(String message)
    {
        this.logger.error(message);
    }

    public void error(String message, Object parameter)
    {
        this.logger.error(message, parameter);
    }

    public void error(String message, Object... parameters)
    {
        this.logger.error(message, parameters);
    }

    public void error(String message, Throwable throwable)
    {
        this.logger.error(message, throwable);
    }

    public void error(String message, Throwable throwable, Object... parameters)
    {
        if (this.logger.isErrorEnabled())
        {
            this.logger.error(MessageFormatter.arrayFormat(message, parameters).getMessage(),
                throwable);
        }
    }
}
