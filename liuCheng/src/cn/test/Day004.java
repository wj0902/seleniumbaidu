package cn.test;

public class Day004 {
	//人具有的属性
	int age;
	String name;
	//人具有的行为
	void speak() {
		System.out.println("我是"+name+"今年"+age);
	}
	public static void main(String[] args) {
		Cat p=new Cat(179,"魔力猫");
		p.nao();
	}
}
class Cat{
	int height;
	String name;
	Cat(int height,String name){
		super();
		this.height=height;
		this.name=name;
	}
	void nao() {
		System.out.println("我叫"+name+"身高"+height);
	}
}
