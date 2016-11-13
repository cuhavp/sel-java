package supports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Log {
	private static Logger logger = Logger.getLogger(Log.class.getName());    
    
    private Log () {
    }
    
    /**
     * Print warning message.
     * @param msg Message
     */
    public static void warn(String msg) {
    	System.out.println(msg);
        logger.warn(msg);
    }
    
    /**
     * Print info message.
     * @param msg Message
     */
    public static void info(String msg) {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	System.out.println(dateFormat.format(date)+":"+msg);
        logger.info(dateFormat.format(date)+":"+msg);
    }

    /**
     * Print error message.
     * @param msg Message
     */
    public static void error(String msg) {
    	System.err.println(msg);
        logger.error(msg);
    }
    
}