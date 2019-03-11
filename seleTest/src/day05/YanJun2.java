package day05;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class YanJun2 {
	@Test
	public void opp() throws InterruptedException, IOException, AWTException {
		//打开火狐浏览器
		//System.setProperty("webdriver.Firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //driver浏览器变量名
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		//String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
		//driver.get(u);
		/**
		 * 拖动方块
		 */
	   //WebElement f1=driver.findElement(By.id("drag"));
	   //Actions f3=new Actions(driver);
	  /* WebElement f2=driver.findElement(By.xpath("/html/body/h1"));
	   Actions f3=new Actions(driver);
	   f3.clickAndHold(f1).moveToElement(f2).release(f1).perform();*/
	  // f3.dragAndDropBy(f1,-200,-30).perform();
		/**
		 * 1.创建目录
		 * 2.复制目录 3种
		 * 3.删除目录
		 * 4.读取目录
		 * 
		 */
		FileHandler.createDir(new File("d:\\data1"));
		FileHandler.copy(new File("d:\\data"),new File("d:\\data1"), ".jpg");
		FileHandler.copy(new File("D:\\data"),new File("e:\\data"));
		FileHandler.delete(new File("d:\\data"));
		FileHandler.delete(new File("d:\\data\\te.jpg"));
		String file=FileHandler.readAsString(new File("d:\\data\\a.txt"));
		System.out.println(file);
		
	}
}
