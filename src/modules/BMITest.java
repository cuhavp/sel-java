package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import libraries.BMI_functions;
import supports.CommonFunctions;

public class BMITest {
//	public static WebDriver driver;
//	@DataProvider(name = "testData")
//	public Object[][] testData() {
//	 return new Object[][] {
//	 new Object[] {"22","Female","150","80","BMI = 17.30 kg/m2   (Mild thinness)"},
//	 new Object[] {"25","Male","170","50","BMI = 17.30 kg/m2   (Mild thinness)"}
//	 };
//	 }
////	@Parameters({"browser", "url"})
//	@BeforeTest
//	public static void setUp(){
//		driver = CommonFunctions.selectBrowser("Firefox");
//		CommonFunctions.visit(driver, "http://www.calculator.net/bmi-calculator.html");
//	}
//	@Test(dataProvider = "testData")
//	public static void TC1(String age,String gender,String weight,String height,String BmiExpectedValue){
//		BMI bmiPage = new BMI(driver);
//		bmiPage.clickMetricTab();
//		bmiPage.calculateBMI(age, gender, height, weight);
//		Assert.assertEquals(bmiPage.getBmiResult(), BmiExpectedValue);
//	}
////	@Test
////	public static void TC2(){
////		BMI bmiPage = new BMI(driver);
////		bmiPage.clickMetricTab();
////		bmiPage.calculateBMI("25", "Female", "180", "100");
////		Assert.assertEquals(bmiPage.getBmiResult(), "BMI = 30.86 kg/m2   (Obese Class II)");
////	}
//	
//	@AfterTest
//	public static void tearDown(){
//		driver.quit();
//	}
//	public static void main(String[] args) {
//		
//		WebDriver driver = CommonFunctions.selectBrowser("firefox");
//		BMI_functions bmiPage = new BMI_functions(driver);
//		CommonFunctions.visit(driver, "http://www.calculator.net/bmi-calculator.html");
//		bmiPage.clickMetricTab();
//		bmiPage.calculateBMI("25", "Female", "180", "100");
//		System.out.println(bmiPage.getBmiResult());
//				
////		CommonFunctions.click(driver, "xpath", page.TAB_METRIC);
//////														".//a[text()='Metric Units']"
////		CommonFunctions.fillIn(driver, "id", "cage", "25");
////		CommonFunctions.fillIn(driver, "name", "cheightmeter", "180");
////		CommonFunctions.fillIn(driver, "name", "ckg", "80");
////		CommonFunctions.click(driver, "css", "input[value='Calculate']");
////		
////		String bmiValue = CommonFunctions.getText(driver, "css",".rightresult");
////		System.out.println(bmiValue);
//
//	}

}
