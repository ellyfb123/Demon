
package com.thoughtworks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.attribute.standard.Severity;
import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        ApplicationContext context = (ApplicationContext)getServletContext().getAttribute("name");
        CalculatorClient obj = (CalculatorClient) context.getBean("ApplicationBean");
        out.println(obj.add("12","23")) ;
        out.println("</body>");
        out.println("</html>");
    }
}
