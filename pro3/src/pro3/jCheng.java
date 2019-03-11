package pro3;

public class jCheng {
	
	
	
	   public static void main(String[] args) {
		 B c=new B();
		 c.bbb();
	   }
}

class A{
	static int a=5;
	public void aaa() {
		System.out.println("123");
	}
}
class B extends A{
	public void bbb() {
		if(a<3) {
		System.out.print(a);
		}else if(a<6){
			System.out.println(a+a);
		}
		else {
			System.out.println(a+a+a);
		}
	}
}
class C{
	int id=10;
	public C() {
		System.out.println("aaaaaaa");
	}
	public C(int aa) {
		this.id=aa;
		System.out.println("ssss");
	}
}












