package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by dell on 2018/5/4.
 */
public class ListenerTest implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("监听器初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
