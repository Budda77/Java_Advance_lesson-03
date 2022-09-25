package ua.lviv.lgs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggeredFile {
	private static Logger LOG = Logger.getLogger(CustomLoggeredFile.class);
	
	public static void main(String[] args) {

		logWithBasicConfigurator(); 
		logWithDomConfigurator();
		
	}	
	
	
	
	public static void logWithBasicConfigurator() {
		BasicConfigurator.configure();
		
		LOG.debug("DEBUG logger message of progect");
		LOG.info("INFO logger message of progect");
		LOG.trace("TRACE logger message of progect");
		LOG.warn("WARN logger message of progect");
		LOG.error("ERROR logger message of progect");
		LOG.fatal("FATAL logger message of progect");
	}
	
	public static void logWithDomConfigurator() {
		DOMConfigurator.configure("loggerConfig.xml");
		
		LOG.debug("DEBUG logger message of progect");
		LOG.info("INFO logger message of progect");
		LOG.trace("TRACE logger message of progect");
		LOG.warn("WARN logger message of progect");
		LOG.error("ERROR logger message of progect");
		LOG.fatal("FATAL logger message of progect");
	}
}
