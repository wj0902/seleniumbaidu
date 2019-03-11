package day05;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fuxin {
	@Test
	public void pw() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		String u="http://localhost:8080/mobile_mysql/index.jsp";
		driver.get(u);
		String p=driver.getWindowHandle();//获取当前窗口句柄
		WebElement user=driver.findElement(By.name("name"));
		user.sendKeys("lisi");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("123");
		driver.findElement(By.className("input1")).click();
		driver.findElement(By.className("linkBlack")).click();
		
	/*	String phoneBefore = driver.getWindowHandle();
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
		driver.switchTo().window(phoneBefore);*/
		/**
		 * 通过网址来获取句柄
		 * 
		 */
		String u2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=10";
		
		Set<String>w=driver.getWindowHandles();  //变量w是一个集合，有两个网址
		//获取当前页面所有句柄，因为有两个页面，所有用了一个字符串集合w来接收两个句柄
		for(String handle:w) {  //在集合w里面随机取一个句柄页签
			driver.switchTo().window(handle);
			String title=driver.getCurrentUrl();//获取标题来判断获取的页面是否是需要的
			
			if(u2.equals(title)) {
				driver.findElement(By.name("Submit")).click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
		driver.switchTo().window(p); 	
		driver.findElement(By.linkText("购物车")).click();
		driver.findElement(By.linkText("去收银台结账")).click();
		
	}
}
