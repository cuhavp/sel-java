package modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import supports.Log;

public class ParametersTest {
	/**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at suite level.
     */
    @Parameters({ "suite-param" })
    @Test
    public void prameterTestOne(String param) {
    	
       Log.info("Test one suite param is: " + param);
    }
 
    /**
     * Following method takes one parameter as input. Value of the
     * said parameter is defined at test level.
     */
    @Parameters({ "test-two-param" })
    @Test
    public void prameterTestTwo(String param) {
    	Log.info("Test two param is: " + param);
    }
 
    /**
     * Following method takes two parameters as input. Value of the
     * test parameter is defined at test level. The suite level
     * parameter is overridden at the test level.
     */
    @Parameters({ "suite-param", "test-three-param" })
    @Test
    public void prameterTestThree(String param, String paramTwo) {
    	Log.info("Test three suite param is: " + param);
    	Log.info("Test three param is: " + paramTwo);
    }

}
