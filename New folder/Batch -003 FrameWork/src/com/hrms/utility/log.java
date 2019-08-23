package com.hrms.utility;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;

public class log {

private static Logger log=Logger.getLogger(Log.class.getName());
public static void info(String message)
{
	log.info(message);
}	
}
