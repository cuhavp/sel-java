package modules;

import org.testng.annotations.Test;

public class IncludeTest {
	@Test(groups = { "include-group" })
    public void testMethodOne() {
        System.out.println("Test method one belonging to include group.");
    }
 
    @Test(groups = { "include-group" })
    public void testMethodTwo() {
        System.out.println("Test method two belonging to include group.");
    }
 
    @Test(groups = { "include-group", "exclude-group" })
    public void testMethodThree() {
        System.out.println("Test method three belonging to exclude/include groups.");
    }

}
