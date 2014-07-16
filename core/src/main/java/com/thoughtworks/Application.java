package com.thoughtworks;

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by fxie on 7/15/14.
 */
public class Application {
    public static void main(String[] args){
    ApplicationContext context = new ClassPathXmlApplicationContext(
                        "SpringBeans.xml");

        CalculatorClient obj = (CalculatorClient) context.getBean("ApplicationBean");
               System.out.println(obj.add("12","23")) ;

            }
        }