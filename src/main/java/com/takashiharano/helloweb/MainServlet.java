package com.takashiharano.helloweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainServlet", urlPatterns = ("/main"))
public class MainServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    long timestamp = System.currentTimeMillis();
    Date date = new Date(timestamp);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
    String datetime = sdf.format(date);
    String msg = "Hello, world!";
    String str = datetime + " (" + timestamp + ")\n" + msg;

    response.setContentType("text/plain");
    PrintWriter writer = response.getWriter();
    writer.write(str);
    writer.close();
  }

}
