package pro2;

import java.math.BigDecimal;

public class Sqa {
public static void main(String[] args) {
	float a=6.28f;
	double b=6.28;
	double c=9.28D;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c); 
	System.out.println(a==b); 
	//浮点数是不精确的，一定不要用于比较，还比如：
	float d1=1232456f;
    float d2=d1+1;
if(d1==d2) {
	System.out.println(d1==d2);
}else {
	System.out.println(d1!=d2);
}

	//使用精确的浮点数比较。使用BigDecimal
	BigDecimal bd=BigDecimal.valueOf(1.0);
	bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    bd = bd.subtract(BigDecimal.valueOf(0.1));
    System.out.println(bd);//0.5
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);//0.5000000000000001
    
    BigDecimal bd2=BigDecimal.valueOf(0.1);
    BigDecimal bd3=BigDecimal.valueOf(1.0/10);
    System.out.println(bd2.equals(bd3));
}
}
