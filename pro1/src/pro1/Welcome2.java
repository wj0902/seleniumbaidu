package pro1;

import java.awt.*;
import javax.swing.*;

public class Welcome2 extends JFrame{
	Image bas=Toolkit.getDefaultToolkit().getImage("images/bas.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//С�������
	double y=100;//С��������
	
	double degree=3.14/3;//���ȡ��˴�����60��
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ�Σ�");
		g.drawImage(desk,0,0,null);
		g.drawImage(bas,(int)x,(int)y,null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		//�������±߽�
		if(y>500-40-30||y<80) {//500�Ǵ��ڸ߶ȣ�40�����ӱ߿�30����ֱ�������һ��40�Ǳ������߶�
			degree=-degree;
		}
		
		//�������ұ߽�
		if(x<40||x>856-40-30) {
			degree=3.14-degree;
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
	Welcome2 game=new Welcome2();
	game.launchFrame();
}
}