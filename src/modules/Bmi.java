package modules;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import libraries.BMI_functions;
import supports.CommonFunctions;

public class Bmi {
	public static WebDriver driver;
	public static BMI_functions page;
	
	
	@DataProvider(name = "bmidata")
	public Object[][] testData() {
	  return new Object[][] {
			 new Object[] {"25","female","160","53","BMI = 20.70 kg/m2   (Normal)"},
			 new Object[] {"25","male","180","73","BMI = 22.53 kg/m2   (Normal)"},
			 new Object[] {"31","female","150","80","BMI = 35.56 kg/m2   (Obese Class II)"}
	 		};
	 }
	
	@Parameters({ "browser","url" })
	@BeforeMethod
	public static void setup(String browser,String url ) throws MalformedURLException{
		driver = CommonFunctions.selectBrowser(browser);
		page = new BMI_functions(driver);
		CommonFunctions.visit(driver, url);
	}
	
	@Test(dataProvider = "bmidata")
	public static void TC1(String age,String gender,String height,String weight,String bmi_expected) {
		page.tab_metric.click();
		String bmi_result=page.calculate_bmi(age,gender, height,weight);
		AssertJUnit.assertEquals(bmi_expected, bmi_result);
	}

	@AfterMethod
	public static void tearDown(){
		driver.quit();
	}
	

}
