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
		System.out.println("����һֻ"+name);
	}
}
class Dog01 extends Ani01{
	public Dog01() {
		super("���͹�");
	}
}
class Monkey{
	public Monkey(String s) {	
	}
	public void speak() {
		System.out.println("����ѽѽ.....");
	}
}
class Peo extends Monkey{
//	public Peo() {
//		super("Ϊʲô�ᱨ��");
//	}
	public Peo(String name) {
		super("");  //����super(name)Ҳ����
	}
	public void speak() {
		System.out.println("С�����������˵���ˡ�");
	}
	public void think() {
		System.out.println("��˵��������˼����");
	}
}