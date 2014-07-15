
package com.thoughtworks;
import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        SayHello sayHello = new SayHello();
        out.println(sayHello.say());
        out.println("</body>");
        out.println("</html>");
    }
}
