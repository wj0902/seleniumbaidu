package cn.test;

class Stat02{
	static String schoolname;
	int age;
	public static void speak() {
		System.out.println("Hello word!");
	}
}
class Ank{
	int height;
	static int width;
}
class stude{
	private int num=4;
	void speak() {
		inner a=new inner();
		a.show();
	}
	class inner{
		void show() {
			System.out.println(num);
		}
	}
}
class Kmn{
	static{
		System.out.println("word");  //只会运行一次
	}
}
public class Stat01 {
	public static void main(String[] args) {
		stude a=new stude();
		a.speak();
		stude.inner b=new stude().new inner();
		b.show();
		
		Stat02 stu1=new Stat02();
		Stat02 stu2=new Stat02();
		Stat02.speak();
		stu1.speak();
//		Stat02.schoolname="先锋";  //公有
//		stu1.age=1;  //所有
//		System.out.println(stu1.schoolname);
//		System.out.println(stu2.schoolname);
//		System.out.println(stu1.age);
//		System.out.println(stu2.age);
		
		Ank p0=new Ank();
		Ank p1=new Ank();
		Ank.width=20;
		System.out.println(p0.width);
		System.out.println(p1.width);
		p0.height=50;
		System.out.println(p0.height);
		System.out.println(p1.height);	
		Kmn s1=new Kmn();
		Kmn s2=new Kmn();  //两个只会执行一次，并且只会执行一次		
	}
	
}
