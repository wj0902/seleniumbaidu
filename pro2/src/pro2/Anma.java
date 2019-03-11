package pro2;

public class Anma {
	public static void main(String[] args) {
		Cat s=new Cat();
		s.height=169.5;	
		s.year=4;
		s.niLin("圣龙阿布","sq");
		s.jiQiao();
		s.fiXing();
	}
}
class Ani{
	double height;
	public void fiXing() {
		System.out.println("我会飞!");
	}
}
class Pig extends Ani{
	String name="波斯猫";
	String user="wj";
	public void jiQiao() {
		System.out.println("我会跑!");
	}
}
class Cat extends Pig{
	int year;
	public void niLin(String name,String user) {
		
		System.out.println("洛克王国历时征战"+year+"\n身长:"+height+
				"\n我的名字:"+name+"\n父类"+super.name+
				"\n父类名字"+super.user+"\n子类名字:"+user);
	}
	public void fiXing() {
		System.out.println("我是站在风口的猪，所以我能上天!");
	}
	public void jiQiao() {
		//System.out.println("我会瞎跑，嘿嘿!");
		super.jiQiao();
	}
}