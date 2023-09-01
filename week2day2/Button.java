package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver button=new ChromeDriver();

button.get("https://www.leafground.com/button.xhtml");
button.manage().window().maximize();
button.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

button.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();

button.navigate().back();

//2. Confirm if the button is disabled

boolean enabled = button.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
System.out.println(enabled);
//3. Find the position of the Submit button
 Point location=button.findElement(By.id("Submit")).getLocation();
 System.out.println(location);
 
 //button.navigate().back();
 
 //button.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
 //button.navigate().back();
// button.findElement(By.xpath("//span[@text()='Submit']")).click();



	}

}
