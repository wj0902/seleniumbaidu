package cn.test;
class Ja{
	private int age=2;
	void aaa() {
		Ba a=new Ba();
		a.bbb();
	}
class Ba{
	void bbb() {
		System.out.println(age);
	}
}
}
public class Xcta {
	public static void main(String[] args) {
		Ja a=new Ja();
		a.aaa();
		Ja.Ba b=new Ja().new Ba();
		b.bbb();
	}
}
