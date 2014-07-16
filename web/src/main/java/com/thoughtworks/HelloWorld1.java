
package com.thoughtworks;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=GBK");

        String add1 = request.getParameter("add1"); //获得加数1
        String add2 = request.getParameter("add2");   //获得加数2

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        ApplicationContext context = (ApplicationContext)getServletContext().getAttribute("name");
        CalculatorClient obj = (CalculatorClient) context.getBean("ApplicationBean");
        String result = obj.add(add1,add2);

        request.setAttribute("result",result);
       request.getRequestDispatcher("index.jsp").include(request, response);
        out.println("</body>");
        out.println("</html>");
    }
    public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
    {
           doGet(req,res);
    }
}
