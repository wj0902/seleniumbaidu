package pro;

public class BreakContinue {
public static void main(String[] args) {
	
	int j=0;
	while(true) {
		j++;
		int i=(int)(100*Math.random()+1);
		System.out.println(i);
		if(i==88) {
			break;  //作用中断循环，跳出循环
			        //如果是continue，如果在continue下面还有语句，也不会执行，它会直接返回到while开始循环，终止本次循环
		}
		
	}
	System.out.println("执行了:"+j+"次!");
}
}
