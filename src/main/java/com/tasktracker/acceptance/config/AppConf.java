package com.tasktracker.acceptance.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by joan on 9/8/15.
 */
public class AppConf {
    public static Properties taskServiceConf;

    public AppConf(){
        taskServiceConf = new Properties();
        try(InputStream resourceStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("conf"+ File.separator+"ttf-acceptance.properties")) {
            taskServiceConf.load(resourceStream);
        } catch (IOException e) {

        }
    }
}
