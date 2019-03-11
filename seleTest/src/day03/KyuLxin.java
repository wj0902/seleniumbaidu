package day03;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KyuLxin {
	@Test
	public void pp() throws IOException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		driver.get(u);	
		driver.switchTo().frame("frame");
		String a=driver.findElement(By.id("div1")).getText();
		System.out.println(a);
		driver.switchTo().parentFrame();
		String b=driver.findElement(By.id("id1")).getText();
		System.out.println(b);
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jietu, new File("D:\\te12.jpg")); 
		/*Actions s=new Actions(driver);
		s.contextClick().perform();*/  //右击
		/*Actions s=new Actions(driver);
	    s.doubleClick().perform();*/  //双击
		driver.switchTo().frame("frame");
		String bbb=driver.findElement(By.id("div1")).getText();
		System.out.println(bbb);
		/*WebElement aaa=driver.findElement(By.className("input1"));
		Actions sss=new Actions(driver);
		sss.moveToElement(aaa).perform();*/  //移动到一个位置要在
		//moveToElement()括号里面放参数
		
		
	}
}
