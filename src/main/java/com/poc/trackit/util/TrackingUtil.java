package com.poc.trackit.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
/**
 * Utility class for handling properties file.
 * @author RA013GU
 *
 */
public class TrackingUtil {
	private static Properties properties = null;
	private static final String RESOURCE_TRACKIT_PROPERTIES = "resource/trackit.properties";
	private static Logger logger = Logger.getLogger(TrackingUtil.class);
	
	static {
		loadProperties();
	}
	
	public static void loadProperties(){
		InputStream inputStream = null;
		try {
			logger.info("Loading properties file: "+ RESOURCE_TRACKIT_PROPERTIES);
			inputStream = new FileInputStream(RESOURCE_TRACKIT_PROPERTIES);
		}	
		catch (Exception e) {
			try{
				inputStream = ClassLoader.getSystemResourceAsStream("trackit.properties");
			}catch (Exception e1){
				logger.error("Exception while loading properties file: "+ RESOURCE_TRACKIT_PROPERTIES);
			}
		}
		try{
			properties = new Properties();
			properties.load(inputStream);
			inputStream.close();
		}  catch (IOException e) {
			logger.error("IOException while loading properties file: "+ RESOURCE_TRACKIT_PROPERTIES);
		}
	}
	

	public static Properties getProperties() {
		if(properties!=null)
			return properties;
		return null;
	}
	
	public static void main(String[] args) {
		TrackingUtil trackingUtil = new TrackingUtil();
	}
	
}
