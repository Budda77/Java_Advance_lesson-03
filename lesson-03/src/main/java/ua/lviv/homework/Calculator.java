/*
 * LOGOS It Academy home work 02
 * 
 *  * @author Oleksandr
 * */

package ua.lviv.homework;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Calculator {
	
	private static Logger LOG = Logger.getLogger(Calculator.class);
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		try {
			calculator.substract(15, 38);
		}catch(IllegalArgumentException ex){			
			calculator.logWithBasicConfigurator();
		}
		
		try {
			calculator.devide(10, 0);
		}catch(IllegalArgumentException ex){
			calculator.ErrorLog();
		}
		
		LOG.info("Please enter only natural numbers.");
		calculator.add(124, 136);
		
		LOG.warn("Please enter only positive numbers.");
		calculator.multiply(65, 34);		
	}
	
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int substract(int a, int b) {
		if(a<b)
			throw new IllegalArgumentException("a must be greter then b");	              
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}

	public int devide(int a, int b) {
		if(b == 0)
			throw new IllegalArgumentException("b must be equl to zero");	
		return a/b;
	}
	
	// First option to log
    public static void info (String message) {
        LOG.info(message);
    }
    public static void warn (String message) {
        LOG.warn(message);
    }
	
    
	// Second option to log
	private void logWithBasicConfigurator() {
		BasicConfigurator.configure();
		
		LOG.debug("DEBUG something wrong!");
		LOG.info("INFO something wrong!");
		LOG.warn("WARN something wrong!");	
	}
	
	public void ErrorLog() {
		DOMConfigurator.configure("calculatorLog.xml");	
		LOG.error("Sorry, something wrong!");
	}
	

}
