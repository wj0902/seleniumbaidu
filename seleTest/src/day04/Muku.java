package day04;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.io.FileHandler;

public class Muku {
	@Test
	public void dd() throws IOException {
		/**
		 * 1.����Ŀ¼
		 */
		//FileHandler.createDir(new File("d:\\data1"));
		/**
		 * 1.����Ŀ¼
		 * ���ַ���
		 */
		//��һ��
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"));//��d:\\data������ļ����Ƶ�d:\\data1Ŀ¼��
		
		//�ڶ���
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"),"te.jpg");//�ú�׺��".jpg"��ʽ���ƹ�ȥ,Ҳ����������"te.jpg"ָ��
		
		//������
		//FileHandler.copy(new File("d:\\data"),new File("d:\\data1"),".jpg");
		/**
		 * 1.ɾ��Ŀ¼
		 */
		//FileHandler.delete(new File("d:\\data"));
		//ɾ���ļ�
		//FileHandler.delete(new File("d:\\data\\te.jpg"));
		/**
		 * 1.��ȡĿ¼
		 */
		//String file = FileHandler.readAsString(new File("d:\\data\\a.txt"));
		//��ȻͼƬҲ���Զ�ȡ����������
		//System.out.println(file);
	}
}
