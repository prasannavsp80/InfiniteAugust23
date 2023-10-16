package com.java.ejb;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.security.Security;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.NamingException;

public class RemoteEJBClient {

	public static void main(String[] args) {
		try {
			invokeStatelessBean();
			Thread.sleep(10000);
		} catch (NamingException e) {
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static Context createInitialContext() throws NamingException {
        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, 
          "org.jboss.naming.remote.client.InitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES, 
          "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL, 
           "http-remoting://localhost:8080");
        jndiProperties.put("jboss.naming.client.ejb.context", true);
        return new InitialContext(jndiProperties);
    }
	   private static CalculationRemote lookupRemoteStatelessCalculator() throws NamingException {
		   Context ctx = createInitialContext();
	        // The app name is the application name of the deployed EJBs. This is typically the ear name
	        // without the .ear suffix. However, the application name could be overridden in the application.xml of the
	        // EJB deployment on the server.
	        // Since we haven't deployed the application as a .ear, the app name for us will be an empty string
	    //    final String appName = "";
	        // This is the module name of the deployed EJBs on the server. This is typically the jar name of the
	        // EJB deployment, without the .jar suffix, but can be overridden via the ejb-jar.xml
	        // In this example, we have deployed the EJBs in a jboss-as-ejb-remote-app.jar, so the module name is
	        // jboss-as-ejb-remote-app
	      //  final String moduleName = "EJBModule";
	        // AS7 allows each deployment to have an (optional) distinct name. We haven't specified a distinct name for
	        // our EJB deployment, so this is an empty string
	        final String distinctName = "";
	        // The EJB name which by default is the simple class name of the bean implementation class
	        final String beanName = "Calculation";
	        System.out.println(beanName);
	        // the remote view fully qualified class name
	   //     System.out.println(RemoteCalculator.class.getName());
	        final String viewClassName = CalculationRemote.class.getName();
	        // let's do the lookup
	   //     String namespace="ejb:/HelloWorldEJB!com.ejb.HelloWorld";
	     //   return (RemoteCalculator) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
	        String appName = "";
            String moduleName = "EjbCalc";
          //  String distinctName = "";
           // String beanName = CalculatorBean.class.getSimpleName();
           // String viewClassName = RemoteCalculator.class.getName();
            return (CalculationRemote) ctx.lookup("ejb:" 
              + appName + "/" + moduleName 
              + "/" + distinctName + "/" + beanName + "!" + viewClassName);
	    }
	 private static void invokeStatelessBean() throws NamingException {
	        // Let's lookup the remote stateless calculator
	        final CalculationRemote statelessRemoteCalculator = lookupRemoteStatelessCalculator();
	        System.out.println("Obtained a remote stateless calculator for invocation");
	        // invoke on the remote calculator
	        int a = 204;
	        int b = 340;
	        System.out.println("Adding " + a + " and " + b + " via the remote stateless calculator deployed on the server");
	        int sum = statelessRemoteCalculator.sum(a, b);
	        System.out.println("Remote calculator returned sum = " + sum);
	        if (sum != a + b) {
	            throw new RuntimeException("Remote stateless calculator returned an incorrect sum " + sum + " ,expected sum was " + (a + b));
	        }
	        // try one more invocation, this time for subtraction
	        int num1 = 3434;
	        int num2 = 2332;
	        System.out.println("Subtracting " + num2 + " from " + num1 + " via the remote stateless calculator deployed on the server");
	        int difference = statelessRemoteCalculator.sub(num1, num2);
	        System.out.println("Remote calculator returned difference = " + difference);
	        if (difference != num1 - num2) {
	            throw new RuntimeException("Remote stateless calculator returned an incorrect difference " + difference + " ,expected difference was " + (num1 - num2));
	        }
	    }
}
