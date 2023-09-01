package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver radio=new ChromeDriver();
				radio.get("https://www.leafground.com/radio.xhtml");
				radio.manage().window().maximize();
				radio.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				radio.findElement(By.xpath("//label[contains(text(),'Firefox')]")).click();
				radio.findElement(By.xpath("//label[contains(text(),'Hyderabad')]")).click();
				Thread.sleep(100);
				
			//@SuppressWarnings("unused")
			Boolean selected = radio.findElement(By.xpath("//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c']")).isSelected();
			
			if (selected==true) {
				System.out.println("selected");
				
			}
			
			
			boolean selectedAge = radio.findElement(By.xpath("(//input[contains(@name,'j_idt87:age')])[2]")).isSelected();
			
			if (selectedAge == true)			
				System.out.println("21-40 Years is already selected");
			
	}

}
