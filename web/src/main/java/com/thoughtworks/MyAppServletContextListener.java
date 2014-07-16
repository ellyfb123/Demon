package com.thoughtworks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by fxie on 7/16/14.
 */
public class MyAppServletContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent contextEvent) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        contextEvent.getServletContext().setAttribute("name", applicationContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
