package modules;

import org.testng.annotations.Test;

public class DependentTestExamples {

    @Test(dependsOnMethods = { "testTwo" },priority=1)
//	@Test
    public void testOne() {
        System.out.println("Test method one");
    }
    @Test
    public void testThree() {
        System.out.println("Test method three");
    }
    @Test(priority=2)
    public void testTwo() {
        System.out.println("Test method two");
    }

}
