package modules;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	/**
	 * 
	 */
	@Test(groups = { "Sanity" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to group.");
    }
 
    @Test
    public void testMethodTwo() {
        System.out.println("Test method two not belonging to group.");
    }
    @Test(groups = { "Sanity" })
    public void testMethodThree() {
    	
        System.out.println("Test method three belonging to group.");
       Assert.assertEquals(true, false);
    }
    @Test(groups = { "Mobile" })
    public void testMethodFour() {
        System.out.println("Test method two not belonging to group.");
    }
    @Test
    public void testMethodFive() {
        System.out.println("Test method two not belonging to group.");
    }

    @Test
    public void testMethodSix() {
        System.out.println("Test method two not belonging to group.");
    }

    @Test
    public void testMethodSeven() {
        System.out.println("Test method two not belonging to group.");
    }
}
