package day03;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csdf {
	@Test
	public void opp() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		/**
		 * 
		 */
		driver.get(u);
		//selenium截图功能
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(jietu, new File("D:\\testi.jpg"));  //第一个文件参数和第二个文件存放地址
		
		//第一种获取内容
		WebElement aa=driver.findElement(By.xpath("//*[@id=\"id1\"]"));
		String t=aa.getText();
		System.out.println(t);
		
		driver.switchTo().frame("frame");
		//第二种获取内容
		String bb=driver.findElement(By.xpath("//*[@id=\"div1\"]")).getText();
		System.out.println(bb);
		
		driver.findElement(By.id("input1")).sendKeys("江西先锋");
	}
}
