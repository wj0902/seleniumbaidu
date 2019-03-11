package pro;

public class DiGui {
public static void main(String[] args) {
	a();
}
static int count=0;
static void a(){
	
	System.out.println("a");
	count++;
	//a();  写了会占用内存空间，直到一直调用自己出现错误
	if(count<=3) {   //if为递归体
		a();
	}else {          //else为递归头
		return;//其中一个作用是结束
	}	
	
}
}