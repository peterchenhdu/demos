package org.dubbo.demo.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ProjectConfigUtil
{
    public static final String CONFIG_FILE_RELATIVE_PATH = "./config.properties";

    public static Properties getConfig()
    {
        Properties p = getProperties(CONFIG_FILE_RELATIVE_PATH);
        return p;
    }

    public static String getProjectClassesPath()
    {
        URL fileUrl = ProjectConfigUtil.class.getClassLoader().getResource("");
        String path = fileUrl.getPath();
        return path;
    }

    public static Properties getProperties(String relativePath)
    {
        String filePath = null;
        if (relativePath.startsWith("./"))
            relativePath = relativePath.substring(2);
        else if (relativePath.startsWith("/") || relativePath.startsWith("."))
            relativePath = relativePath.substring(1);

        filePath = getProjectClassesPath() + relativePath;
        Properties properties = new Properties();
        FileInputStream in = null;
        try
        {
            in = new FileInputStream(filePath);
            properties.load(in);
            in.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException("couldn't load properties file '" + filePath + "'", e);
        }
        return properties;
    }
}
