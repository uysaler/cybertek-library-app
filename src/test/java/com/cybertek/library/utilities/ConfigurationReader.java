package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties=new Properties();
    static{
        //#2 get the path and open file
        try {
            FileInputStream file=new FileInputStream("configuration.properties");
            //#3 load the opened file
            properties.load(file);
            file.close();//close the file in jvm memory
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //#4 use the object to read from the configuration.properties file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }
}
