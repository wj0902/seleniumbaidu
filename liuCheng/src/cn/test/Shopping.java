package cn.test;

public class Shopping {
	public static void main(String[] args) {
		//��������Ʒ�Ķ��󣬸���Ʒ������
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		Product p5=new Product();
		p1.setProName("���ӻ�");
		p2.setProName("�����");
		p3.setProName("�յ�");
		p4.setProName("�����");
		p5.setProName("ϴ�»�");
		
		//�������ж��󣬸����и����֣����ֿ⸳ֵ
		Market m1= new Market();
		m1.setMarketName("��è");
		m1.setProductArr(new Product[] {p1,p2,p3,p4,p5});
		
		//�����˶��󣬸�ֵ����
		Person r1=new Person();
		r1.setRname("����");
		Product result=r1.shopping(m1, "���ӻ�");
		
		if(result!=null) {
			System.out.println
			(r1.getRname()+"��"+m1.getMarketName()+
					"����"+result.getProName());
		}else {
			System.out.println(r1.getRname()+
					"��"+m1.getMarketName()+"������һ��");
		}
		
	}
}
