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
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
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
		 * ͨ����ַ����ȡ���
		 * 
		 */
		String u2="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=10";
		
		Set<String>w=driver.getWindowHandles();  //����w��һ�����ϣ���������ַ
		//��ȡ��ǰҳ�����о������Ϊ������ҳ�棬��������һ���ַ�������w�������������
		for(String handle:w) {  //�ڼ���w�������ȡһ�����ҳǩ
			driver.switchTo().window(handle);
			String title=driver.getCurrentUrl();//��ȡ�������жϻ�ȡ��ҳ���Ƿ�����Ҫ��
			
			if(u2.equals(title)) {
				driver.findElement(By.name("Submit")).click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
		driver.switchTo().window(p); 	
		driver.findElement(By.linkText("���ﳵ")).click();
		driver.findElement(By.linkText("ȥ����̨����")).click();
		
	}
}
