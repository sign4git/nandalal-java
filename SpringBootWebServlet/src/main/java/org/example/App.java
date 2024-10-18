package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8100);
        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"MyServlet",new MyServlet());
        context.addServletMappingDecoded("/hello","MyServlet");
        tomcat.start();
        tomcat.getServer().await();

    }
}
