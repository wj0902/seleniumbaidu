package day01;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {
	@Test
	public void open2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u1="http://localhost:8080/mobile_mysql/index.jsp";		
		driver.get(u1);	
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement(By.linkText("×¢²á")).click();
		WebElement p1=driver.findElement(By.name("name"));
		p1.sendKeys("dawajun");
		WebElement p2=driver.findElement(By.name("password"));
		p2.sendKeys("123456");
		WebElement p3=driver.findElement(By.name("passwordOne"));
		p3.sendKeys("123456");
		WebElement p4=driver.findElement(By.name("reallyName"));
		p4.sendKeys("1");
		WebElement p5=driver.findElement(By.name("age"));
		p5.sendKeys("1");
		WebElement p6=driver.findElement(By.name("profession"));
		p6.sendKeys("1");	
		WebElement p7=driver.findElement(By.name("email"));
		p7.sendKeys("183@139.com");
		WebElement p8=driver.findElement(By.name("question"));
		p8.sendKeys("1");
		WebElement p9=driver.findElement(By.name("result"));
		p9.sendKeys("1");
		driver.findElement(By.className("input1")).click();
		driver.findElement(By.linkText("Ê×Ò³")).click();
		WebElement p10=driver.findElement(By.name("name"));
		p10.sendKeys("dawajun");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("123456");
		driver.findElement(By.className("input1")).click();
		
		
	}
}
