package libraries;

import org.openqa.selenium.WebDriver;
import objects.BMIPage;
import supports.CommonFunctions;

public class BMI_functions extends BMIPage{
	
	public BMI_functions(WebDriver driver) {
		super(driver);
	}

	/**
	 * Description: This method use to calculate body mass index
	 * @param age[String]
	 * @param gender[String]
	 * @param height[String]
	 * @param weight[String]
	 * @return bmi_value[String]
	 */
	public String calculate_bmi(String age,String gender,String height,String weight){
		String bmi_value;		
		CommonFunctions.fillIn(txt_age, age);
		if(gender=="male"){
			rad_male.click();
		}else {
			rad_female.click();
		}		
		CommonFunctions.fillIn(txt_height,height);
		CommonFunctions.fillIn(txt_weight,weight);	
		btn_calculate.click();
		bmi_value=lbl_bmi_result.getText();
		return bmi_value;
	}
}
