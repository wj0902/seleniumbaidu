package cn.test;

public class Shopping {
	public static void main(String[] args) {
		//创建了商品的对象，给商品赋名字
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		p1.setProName("电视机");
		p2.setProName("电冰箱");
		p3.setProName("空调");
		p4.setProName("吹风机");
		p5.setProName("洗衣机");
		
		//创建超市对象，给超市赋名字，给仓库赋值
		Market m1= new Market();
		m1.setMarketName("天猫");
		m1.setProductArr(new Product[] {p1,p2,p3,p4,p5});
		
		//创建人对象，赋值人名
		Person r1=new Person();
		r1.setRname("蚊蚊");
		Product result=r1.shopping(m1, "电视机");
		
		if(result!=null) {
			System.out.println
			(r1.getRname()+"在"+m1.getMarketName()+
					"买到了"+result.getProName());
		}else {
			System.out.println(r1.getRname()+
					"在"+m1.getMarketName()+"白跑了一趟");
		}
		
	}
}
