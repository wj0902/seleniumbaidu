package day02;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gmian {
	@Test
	public void opee() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u1="http://localhost:8080/mobile_mysql/index.jsp";		
		driver.get(u1);	
		WebElement user=driver.findElement(By.name("name"));
		user.sendKeys("lisi");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("123");
		driver.findElement(By.className("input1")).click();
		//driver.findElement(By.className("linkBlack")).click();
		//driver.findElement(By.cssSelector("selector"))
		Dimension a=new Dimension(900,500);
		driver.manage().window().setSize(a);
		
		/*
		String phoneBefore = driver.getWindowHandle();
		System.out.println(phoneBefore);
		for(String winHandle : driver.getWindowHandles()) {
		if (winHandle.equals(phoneBefore)) {
		continue;
		}
		driver.switchTo().window(winHandle);
		break; 
		}	
		driver.findElement(By.name("Submit")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().window(phoneBefore);
		
		
		
		
		driver.findElement(By.linkText("购物车")).click();
		driver.findElement(By.linkText("去收银台结账")).click();
		WebElement adre=driver.findElement(By.name("address"));
		adre.sendKeys("1");
		WebElement phone=driver.findElement(By.name("tel"));
		phone.sendKeys("1");
		WebElement fuk=driver.findElement(By.name("setMoney"));
		Select fuk2=new Select(fuk);
		fuk2.selectByIndex(1);
		WebElement fuk3=driver.findElement(By.name("post"));
		Select fuk4=new Select(fuk3);
		fuk4.selectByIndex(1);
		driver.findElement(By.name("Submit2")).click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		co2.accept();
		co2.accept();
		co2.dismiss();*/
	}
}




