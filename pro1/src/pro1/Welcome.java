package pro1;

import java.awt.*;
import javax.swing.*;

public class Welcome extends JFrame{
	Image bas=Toolkit.getDefaultToolkit().getImage("images/bas.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//С�������
	double y=100;//С��������
	boolean right=true;//�������ң������false������
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk,0,0,null);
		g.drawImage(bas,(int)x,(int)y,null);
		
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>856-40-30) {//856�Ǵ��ڿ�ȣ�40�����ӱ߿��ȣ�30��С���ֱ��
			right=false;
		}
		if(x<40) {//40�����ӱ߿���
			right=true;
		}
		
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(856,500);//��͸߶���300
		setLocation(50,50);//����λ��
		setVisible(true);
		
		//�ػ�����,ÿ�뻭25��
		while(true) {
			repaint();
			try {
				Thread.sleep(40); //40ms,1��=1000���룬��Լһ�뻭20�δ���
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
}
public static void main(String[] args) {
	System.out.println("���������Ϸ��Ϊ��׬���ǵ�Ǯ");
	Welcome game=new Welcome();
	game.launchFrame();
}
}