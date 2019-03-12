package pro1;

import java.awt.*;
import javax.swing.*;

public class Welcome extends JFrame{
	Image bas=Toolkit.getDefaultToolkit().getImage("images/bas.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//小球横坐标
	double y=100;//小球纵坐标
	boolean right=true;//方向向右，如果是false是向左
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk,0,0,null);
		g.drawImage(bas,(int)x,(int)y,null);
		
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>856-40-30) {//856是窗口宽度，40是桌子边框宽度，30是小球的直径
			right=false;
		}
		if(x<40) {//40是桌子边框宽度
			right=true;
		}
		
	}
	
	//窗口加载
	void launchFrame(){
		setSize(856,500);//宽和高都是300
		setLocation(50,50);//坐标位置
		setVisible(true);
		
		//重画窗口,每秒画25次
		while(true) {
			repaint();
			try {
				Thread.sleep(40); //40ms,1秒=1000毫秒，大约一秒画20次窗口
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
}
public static void main(String[] args) {
	System.out.println("我做这个游戏是为了赚你们的钱");
	Welcome game=new Welcome();
	game.launchFrame();
}
}