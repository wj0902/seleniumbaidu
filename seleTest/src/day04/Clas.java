package day04;

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
import org.openqa.selenium.interactions.Actions;

public class Clas {
	@Test
	public void opp() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="https://www.baidu.com";
		driver.get(u);
		WebElement s1=driver.findElement(By.name("wd"));
		Actions s2=new Actions(driver);
		s2.contextClick(s1).perform();
		Thread.sleep(3000);
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jietu, new File("D:\\test1.jpg")); 
		WebElement p1=driver.findElement(By.name("tj_briicon"));
		Actions p2=new Actions(driver);
		p2.moveToElement(p1).perform();
		driver.findElement(By.name("tj_nuomi")).click();
		
	}
}
