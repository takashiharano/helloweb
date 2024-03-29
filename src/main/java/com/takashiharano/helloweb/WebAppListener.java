package com.takashiharano.helloweb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class WebAppListener implements ServletContextListener {

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    Log.i("[helloweb] Start");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    Log.i("[helloweb] Stop");
  }

}
