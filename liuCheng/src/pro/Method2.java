package pro;

import java.util.Scanner;

public class Method2 {
public static void main(String[] args) {
	System.out.println(add(50,90));
	System.out.println(add(3,5.0));
	
	
}
/*	public static int add(int a,int b) {//static����ȥ�����������֮��Ͳ���ȥ���������� �����԰�staticǰ���publicȥ��
	int sum=a+b;
	return sum;
} */
public static double add(int a,double b) {  //��double�������ͣ�����int����
	double sum=a+b;
	return sum;
}

public static double add(int a,int b) {
double sum=a+b;
return sum;
}
}
