package me.mrdj.noendermanpickup.utils;

import me.mrdj.noendermanpickup.core.NoEndermanPickup;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Caligos
 */
public class LogHelper 
{
	
	private static final Logger logger = LogManager.getLogger(NoEndermanPickup.MODID);
	
	public static void log(Level level, Object object) {
		logger.log(level, String.valueOf(object));
	}

	public static void log(Level level, Object object, Throwable throwable) {
		logger.log(level, String.valueOf(object), throwable);
	}
	
	public static void all(Object object)
	{
		log(Level.ALL, object);
	}
	
	public static void all(Object object, Throwable throwable)
	{
		log(Level.ALL, object, throwable);
	}
	
	public static void info(Object object)
	{
		log(Level.INFO, object);
	}
	
	public static void info(Object object, Throwable throwable)
	{
		log(Level.INFO, object, throwable);
	}
	
	public static void warn(Object object)
	{
		log(Level.WARN, object);
	}
	
	public static void warn(Object object, Throwable throwable)
	{
		log(Level.WARN, object, throwable);
	}
	
	public static void error(Object object)
	{
		log(Level.ERROR, object);
	}
	
	public static void error(Object object, Throwable throwable)
	{
		log(Level.ERROR, object, throwable);
	}
	
	public static void fatal(Object object)
	{
		log(Level.FATAL, object);
	}
	
	public static void fatal(Object object, Throwable throwable)
	{
		log(Level.FATAL, object, throwable);
	}
	
	public static void debug(Object object)
	{
		log(Level.DEBUG, object);
	}
	
	public static void debug(Object object, Throwable throwable)
	{
		log(Level.DEBUG, object, throwable);
	}
	
	public static void trace(Object object)
	{
		log(Level.TRACE, object);
	}
	
	public static void trace(Object object, Throwable throwable)
	{
		log(Level.TRACE, object, throwable);
	}
	
	public static void all(String format, Object... arguments)
	{
		log(Level.ALL, String.format(format, arguments));
	}
	
	public static void all(String format, Throwable throwable, Object... arguments)
	{
		log(Level.ALL, String.format(format, arguments), throwable);
	}
	
	public static void info(String format, Object... arguments)
	{
		log(Level.INFO, String.format(format, arguments));
	}
	
	public static void info(String format, Throwable throwable, Object... arguments)
	{
		log(Level.INFO, String.format(format, arguments), throwable);
	}
	
	public static void warn(String format, Object... arguments)
	{
		log(Level.WARN, String.format(format, arguments));
	}
	
	public static void warn(String format, Throwable throwable, Object... arguments)
	{
		log(Level.WARN, String.format(format, arguments), throwable);
	}
	
	public static void error(String format, Object... arguments)
	{
		log(Level.ERROR, String.format(format, arguments));
	}
	
	public static void error(String format, Throwable throwable, Object... arguments)
	{
		log(Level.ERROR, String.format(format, arguments), throwable);
	}
	
	public static void fatal(String format, Object... arguments)
	{
		log(Level.FATAL, String.format(format, arguments));
	}
	
	public static void fatal(String format, Throwable throwable, Object... arguments)
	{
		log(Level.FATAL, String.format(format, arguments), throwable);
	}
	
	public static void debug(String format, Object... arguments)
	{
		log(Level.DEBUG, String.format(format, arguments));
	}
	
	public static void debug(String format, Throwable throwable, Object... arguments)
	{
		log(Level.DEBUG, String.format(format, arguments), throwable);
	}
	
	public static void trace(String format, Object... arguments)
	{
		log(Level.TRACE, String.format(format, arguments));
	}
	
	public static void trace(String format, Throwable throwable, Object... arguments)
	{
		log(Level.TRACE, String.format(format, arguments), throwable);
	}

}
