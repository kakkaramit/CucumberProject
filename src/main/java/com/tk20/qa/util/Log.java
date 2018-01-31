package com.tk20.qa.util;


import java.util.logging.Logger;


public class Log 
{

	private static Logger Log = Logger.getLogger(Log.class.getSimpleName());
	
	
	public static void info(String message)
	{
		Log.info(message);
		
	}
	
	public static void warn(String message)
	{
		Log.warning(message);
		
	}
}
