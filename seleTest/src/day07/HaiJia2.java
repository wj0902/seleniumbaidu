package day07;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class HaiJia2 {
	@Test
	public void stppp1() throws IOException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/dragAndDrop2.html";
		driver.get(u);
		//WebElement f1=driver.findElement(By.xpath("/html/body/input"));
		WebElement f2=driver.findElement(By.xpath("//*[@id=\"drag\"]"));
		Actions f3=new Actions(driver);
		//f3.clickAndHold(f2).moveToElement(f1).release(f2).perform();
		f3.dragAndDropBy(f2,-200,-30).perform();*/
		//FileHandler.copy(new File("e:/data11"),new File("e:/data22"));
		//FileHandler.delete(new File("e:/data11"));
		String s=FileHandler.readAsString(new File("e:/data11/a.txt"));
		System.out.println(s);
	}
}
