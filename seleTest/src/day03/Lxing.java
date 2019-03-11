package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class Lxing {
	@Test
	public void op1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u);
		String p=driver.getWindowHandle();//获取当前窗口句柄
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		a2.accept();     
		
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//从浏览器跳转到弹出框上面去
		/*co2.accept(); //这样的叫确定
		Thread.sleep(1000);
		co2.accept(); //这样的叫确定   */
		co2.dismiss();//这样为取消
		co2.accept(); //这样的叫确定
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
		driver.findElement(By.className("open")).click();
		/**
		 * 1.定位到新的页面
		 * 2.跳转到新的页面
		 */
		
		Set<String>w=driver.getWindowHandles();  //变量w是一个集合，有两个网址
		//获取当前页面所有句柄，因为有两个页面，所以用了一个字符串集合w来接收两个句柄
		for(String handle:w) {  //在集合w里面随机取一个句柄页签
			//跳转到该句柄的网页中
			driver.switchTo().window(handle);
			String title=driver.getTitle();//获取标题来判断获取的页面是否是需要的
			System.out.println(title);
			if("UIAutomation iFrame".equals(title)) {
				driver.findElement(By.id("user")).sendKeys("text");//直接输入	
			}
		}
		driver.switchTo().window(p); //跳转回来
		driver.findElement(By.id("user")).sendKeys("texting");//直接输入	
		
	}
}
