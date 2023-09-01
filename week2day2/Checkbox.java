package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver check=new ChromeDriver();
		check.get("https://www.leafground.com/checkbox.xhtml");
		check.manage().window().maximize();
		check.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		check.findElement(By.xpath("//span[text()='Basic']")).click();
		check.findElement(By.xpath("//span[text()='Ajax']")).click();;
		Thread.sleep(100);
		check.findElement(By.xpath("//label[text()='Java']")).click();
		check.findElement(By.xpath("//label[text()='Others']")).click();

	
	check.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
	boolean enabled = check.findElement(By.id("j_idt87:j_idt102")).isEnabled();
	System.out.println(enabled);
	}

}
