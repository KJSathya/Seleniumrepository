package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver text=new ChromeDriver();


text.get("https://www.leafground.com/input.xhtml");
//Text 1
text.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Sathya");

//text 2

//text.findElement(By.xpath("(//input[@class='col-12']/input)[2]")).sendKeys(", Madurai");
//WebElement Display =text.findElement(By.xpath("//input[@class='col-12']"));
//if(Display.isEnabled())
	
//{
	//System.out.println("the text box is enabled");
//}
	//else {
		System.out.println("the text box not enabled");
//	}

text.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).clear();

text.findElement(By.id("j_idt88:j_idt97")).getText();

System.out.println("the text box is disabled");

text.findElement(By.id("j_idt88:j_idt99")).sendKeys("Sathya@gmail.com");

text.findElement(By.name("j_idt88:j_idt101")).sendKeys("Welcome to test leaf");

//text.findElement(By.id("j_idt88:j_idt103_input")).sendKeys("no comments");

text.findElement(By.id("j_idt106:thisform:age")).sendKeys("");

text.findElement(By.id("j_idt106:float-input")).sendKeys("Sathya");

text.findElement(By.id("j_idt106:slider")).sendKeys("2000");

Point location = text.findElement(By.xpath("//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input")).getLocation();
System.out.println(location);
	}

}
