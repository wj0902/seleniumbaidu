package day01;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open3 {
	@Test
	public void open2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u1="http://www.V2EX.com";		
		driver.get(u1);	
		//driver.manage().window().maximize();
		//driver.findElement(By.partialLinkText(linkText))
 	    //driver.findElement(By.linkText("新闻")).click(); 
 	    //driver.findElement(By.xpath("//*[@id=\"baijia\"]/div[2]/div/div[1]/div/a[1]")).click();
 	   // driver.findElement(By.cssSelector("#imgView")).click();
 
 	    
 	    
 //		int a=driver.findElements(By.tagName("a")).size();  //查找a标签
//		System.out.println(a); 
 	    
 	   //int b =driver.findElements(By.tagName("button")).size();
       //System.out.println(b);  //打印出button的个数
 
		
		/*WebElement iput=driver.findElement(By.className("s_ipt"));
	    iput.sendKeys("先锋"); //用className定位
	    WebElement buton=driver.findElement(By.id("su"));
	    buton.click();*/
	    
	    
		/* driver.findElement(By.linkText("hao123")).click();
		Thread.sleep(2500);
		int a=driver.findElements(By.tagName("a")).size();
		System.out.println(a);  */
		
	}
}
