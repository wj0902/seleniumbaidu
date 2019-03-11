package liuCheng;

import java.util.Scanner;

public class Demo {
	public static void bbb(int width,int height) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println();
	}
	static double area=0;
	public static int add(int width,int height) {
		
		area=width*height;
		return (int)area;
	}
	public static double add(double width,double height) {
		area=width*height;
		return area;
	}
	public static int add(int a,int b,int c) {
		area=a*b*c;
		return (int)area;
	}
	static int sum=1;
	public static int jc(int q) {
		
		for(int i=1;i<=q;i++) {
			sum=sum*i;
		}
		return sum;
	}
	public static int chu(int a,int b) {
		while(b==0) {
			Scanner s=new Scanner(System.in);
			System.out.println("该数字错误，请重新输入b：");
			b=s.nextInt();
		}
		return sum=a/b;
	}
	public static void main(String[] args) {   
	//bbb(10,2);
	//bbb(12,3);		
	System.out.println(add(12,12));
	System.out.println(add(10.1,10.5));
	System.out.println(add(10,1,5));
	System.out.println(jc(0));   //0的阶乘也是1	
	System.out.println(chu(10,0));
	}
}