package pro;

import java.util.Scanner;

public class Method2 {
public static void main(String[] args) {
	System.out.println(add(50,90));
	System.out.println(add(3,5.0));
	
	
}
/*	public static int add(int a,int b) {//static不能去掉，有了这个之后就不用去把类名定义 ，可以把static前面的public去掉
	int sum=a+b;
	return sum;
} */
public static double add(int a,double b) {  //是double返回类型，不是int类型
	double sum=a+b;
	return sum;
}

public static double add(int a,int b) {
double sum=a+b;
return sum;
}
}
