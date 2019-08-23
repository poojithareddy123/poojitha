package com.hrms.Testscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
public class TC_101 {
	@Test
public static void login() throws Exception
{
		DOMConfigurator.configure("log4j.xml");
	General obj= new General();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeApplication();
}
}
