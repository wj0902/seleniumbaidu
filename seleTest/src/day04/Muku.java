package day04;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class Muku {
	@Test
	public void dd() throws IOException {
		/**
		 * 1.创建目录
		 */
		//FileHandler.createDir(new File("d:\\data1"));
		/**
		 * 1.复制目录
		 * 三种方法
		 */
		//第一种
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"));//把d:\\data里面的文件复制到d:\\data1目录中
		
		//第二种
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"),"te.jpg");//用后缀名".jpg"方式复制过去,也可以用名字"te.jpg"指定
		
		//第三种
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"),".jpg");
		/**
		 * 1.删除目录
		 */
		//FileHandler.delete(new File("d:\\data"));
		//删除文件
		//FileHandler.delete(new File("d:\\data\\te.jpg"));
		/**
		 * 1.读取目录
		 */
		//String file = FileHandler.readAsString(new File("d:\\data\\a.txt"));
		//虽然图片也可以读取，但是乱码
		//System.out.println(file);
	}
}
