package com.java.jsf;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import java.sql.SQLException;
import java.util.List;
import com.java.ejb.EmployCrudBeanRemote;

public class EmployDaoImplNew {

	public List<com.java.ejb.Employ> showEmploy() {
		try {
			EmployCrudBeanRemote remote = lookupRemoteStatelessEmploy();
			System.out.println("Connected to Lookup...");
			int count = remote.showEmployBean().size();
			System.out.println("Total Records" +count);
			return remote.showEmployBean();
		} catch (NamingException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return null;
		
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
	   private static EmployCrudBeanRemote lookupRemoteStatelessEmploy() throws NamingException {
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
	        final String beanName = "EmployCrudBean";
	        System.out.println(beanName);
	        // the remote view fully qualified class name
	   //     System.out.println(RemoteCalculator.class.getName());
	        final String viewClassName = EmployCrudBeanRemote.class.getName();
	        // let's do the lookup
	   //     String namespace="ejb:/HelloWorldEJB!com.ejb.HelloWorld";
	     //   return (RemoteCalculator) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
	        String appName = "";
            String moduleName = "EjbEmployCrud";
          //  String distinctName = "";
           // String beanName = CalculatorBean.class.getSimpleName();
           // String viewClassName = RemoteCalculator.class.getName();
            return (EmployCrudBeanRemote) ctx.lookup("ejb:" 
              + appName + "/" + moduleName 
              + "/" + distinctName + "/" + beanName + "!" + viewClassName);
	    }

}
