package pro2;

public class Hello {
	int a;//成员变量，自己赋值为0，从属于对象
	static int b;//静态变量，从属于类
public static void main(String[] args){
	{
		int age;//语句块，也是局部变量，从属于语句块
		age=100;
		System.out.println(age);
	}
	int salary=20;//局部变量,从属于方法
	System.out.println(salary);
	final String name="aaa";
	System.out.println(name);
	
	char d1='王';//只能写一个中文字符
	System.out.println(d1);
	char d2='1';//只能写一个字符，不管是英文还是数字
	System.out.println(d2);
	
	System.out.println(""+'a'+'b');
	System.out.println(""+'a'+'\n'+'b');
	System.out.println(""+'a'+'\t'+'b');
	System.out.println(""+'a'+'\''+'b');        //a'b
	System.out.println(""+'a'+'\\'+'\\'+'b');  //a\\b
	
	//String就是字符序列
    String  d3 = "abc"; 
    
    boolean man=true;//不可以写其它，只能写true或者false
    if(man) {
    	System.out.println("男性");
    }
	
    System.out.println(-7%-3);
    
    int f=1;
    System.out.println(+f);
    
}
}
