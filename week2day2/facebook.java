package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	private static final Duration Duration = null;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver login=new ChromeDriver();
//Step 3: Load the URL https://en-gb.facebook.com
login.get("https://en-gb.facebook.com/");
//Step 4: Maximise the window
login.manage().window().maximize();
//Step 5: Add implicit wait
login.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Step 6: Click on Create New Account button
login.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();

//Step 7: Enter the first name
login.findElement(By.name("firstname")).sendKeys("Sathya");

//Step 8: Enter the last name
login.findElement(By.name("lastname")).sendKeys("KJ");


login.findElement(By.name("reg_email__")).sendKeys("Sathyaraghav@gmail.com");

login.findElement(By.name("reg_email_confirmation__")).sendKeys("Sathyaraghav@gmail.com");

login.findElement(By.id("password_step_input")).sendKeys("Welcome@2023");

//Step 11: Handle all the three drop downs
WebElement generalState=login.findElement(By.id("day"));

Select sec =new Select(generalState);
sec.selectByValue("31");

WebElement generalState1=login.findElement(By.id("month"));

Select sec1 =new Select(generalState1);
sec1.selectByVisibleText("Jul");

WebElement generalState2=login.findElement(By.id("year"));

Select sec2 =new Select(generalState2);
sec2.selectByValue("1989");
//Step 12: Select the radio button "Female" 
login.findElement(By.xpath("//label[text()='Female']")).click();


	
	}
	

}
