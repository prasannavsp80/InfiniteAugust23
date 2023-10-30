package com.java.ejb;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class StateFullClient {

	   private static HelloBeanRemote lookupRemoteStateFullHello() throws NamingException {
		   final Hashtable jndiProperties = new Hashtable();
		   
	        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  "org.wildfly.naming.client.WildFlyInitialContextFactory");
	                jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8080");
	        final Context context = new InitialContext(jndiProperties);
	        // The app name is the application name of the deployed EJBs. This is typically the ear name
	        // without the .ear suffix. However, the application name could be overridden in the application.xml of the
	        // EJB deployment on the server.
	        // Since we haven't deployed the application as a .ear, the app name for us will be an empty string
	        final String appName = "";
	        // This is the module name of the deployed EJBs on the server. This is typically the jar name of the
	        // EJB deployment, without the .jar suffix, but can be overridden via the ejb-jar.xml
	        // In this example, we have deployed the EJBs in a jboss-as-ejb-remote-app.jar, so the module name is
	        // jboss-as-ejb-remote-app
	        final String moduleName = "EjbStateFull";
	        // AS7 allows each deployment to have an (optional) distinct name. We haven't specified a distinct name for
	        // our EJB deployment, so this is an empty string
	        final String distinctName = "";
	        // The EJB name which by default is the simple class name of the bean implementation class
	        final String beanName = "HelloBean";
	        // the remote view fully qualified class name
	        final String viewClassName = HelloBeanRemote.class.getName();
	        // let's do the lookup
	        return (HelloBeanRemote) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName + "?stateful");
	    }
	public static void main(String[] args) {
	    try {
			final HelloBeanRemote stateFullHello = lookupRemoteStateFullHello();
			System.out.println(stateFullHello);
			System.out.println(stateFullHello.sayHello());
			System.out.println(stateFullHello.company());
			Thread.sleep(15000);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // invoke on the remote calculator
 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
