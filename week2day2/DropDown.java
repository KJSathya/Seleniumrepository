package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver DropDown=  new ChromeDriver();

DropDown.get("https://www.leafground.com/select.xhtml");

//maximize the window
DropDown.manage().window().maximize();

DropDown.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement drop= DropDown.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
Select sel =new Select(drop);
sel.selectByVisibleText("Selenium");

//WebElement drop1= DropDown.findElement(By.xpath("//div[contains(@class,'ui-selectonemenu-trigger ui-state-default ui-corner-right')]"));
//Select sel1 =new Select(drop1);
//sel1.selectByVisibleText("Germany");

DropDown.findElement(By.xpath("//label[contains(text(),'Select Country')]")).click();
DropDown.findElement(By.xpath("//li[contains(text(),'Germany')]")).click();



DropDown.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/following::button")).click();
DropDown.findElement(By.xpath("//li[contains(text(),'Selenium WebDriver')]")).click();

DropDown.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
DropDown.findElement(By.xpath("//li[contains(text(),'English')]")).click();


WebElement drop1= DropDown.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
drop1.click();
//Select sel1 =new Select(drop1);
//sel1.selectByValue("One");
//DropDown.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
//DropDown.findElement(By.xpath("//li[contains(text(),'One')]")).click();


//DropDown.findElement(By.id("Select City")).click();
//DropDown.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();

 //DropDown.findElement(By.xpath("//span[@class='ui-button-text']")).click();
//Select sel3 =new Select(down);
//sel3.selectByVisibleText("Selenium WebDriver");



	}

}
