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
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//���������ת������������ȥ
		a2.accept();     
		
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//���������ת������������ȥ
		/*co2.accept(); //�����Ľ�ȷ��
		Thread.sleep(1000);
		co2.accept(); //�����Ľ�ȷ��   */
		co2.dismiss();//����Ϊȡ��
		co2.accept(); //�����Ľ�ȷ��
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
		driver.findElement(By.className("open")).click();
		/**
		 * 1.��λ���µ�ҳ��
		 * 2.��ת���µ�ҳ��
		 */
		
		Set<String>w=driver.getWindowHandles();  //����w��һ�����ϣ���������ַ
		//��ȡ��ǰҳ�����о������Ϊ������ҳ�棬��������һ���ַ�������w�������������
		for(String handle:w) {  //�ڼ���w�������ȡһ�����ҳǩ
			//��ת���þ������ҳ��
			driver.switchTo().window(handle);
			String title=driver.getTitle();//��ȡ�������жϻ�ȡ��ҳ���Ƿ�����Ҫ��
			System.out.println(title);
			if("UIAutomation iFrame".equals(title)) {
				driver.findElement(By.id("user")).sendKeys("text");//ֱ������	
			}
		}
		driver.switchTo().window(p); //��ת����
		driver.findElement(By.id("user")).sendKeys("texting");//ֱ������	
		
	}
}
