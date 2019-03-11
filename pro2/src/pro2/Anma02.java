package pro2;
public class Anma02 {
	public static void main(String[] args) {
		Dog01 s=new Dog01();
		Peo p1=new Peo("");
		Monkey p2=new Monkey("");
		p2.speak();
		p1.speak();
		p1.think();
	}
}
class Ani01{
	public Ani01(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog01 extends Ani01{
	public Dog01() {
		super("哈巴狗");
	}
}
class Monkey{
	public Monkey(String s) {	
	}
	public void speak() {
		System.out.println("咿咿呀呀.....");
	}
}
class Peo extends Monkey{
//	public Peo() {
//		super("为什么会报错？");
//	}
	public Peo(String name) {
		super("");  //或者super(name)也可以
	}
	public void speak() {
		System.out.println("小样，不错嘛，会说话了。");
	}
	public void think() {
		System.out.println("别说话，认真思考！");
	}
}