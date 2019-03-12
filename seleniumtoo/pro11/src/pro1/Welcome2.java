package pro1;

import java.awt.*;
import javax.swing.*;

public class Welcome2 extends JFrame{
	Image bas=Toolkit.getDefaultToolkit().getImage("images/bas.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	
	double x=100;//小球横坐标
	double y=100;//小球纵坐标
	
	double degree=3.14/3;//弧度。此处就是60度
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次！");
		g.drawImage(desk,0,0,null);
		g.drawImage(bas,(int)x,(int)y,null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		//碰到上下边界
		if(y>500-40-30||y<80) {//500是窗口高度；40是桌子边框；30是球直径；最后一个40是标题栏高度
			degree=-degree;
		}
		
		//碰到左右边界
		if(x<40||x>856-40-30) {
			degree=3.14-degree;
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
	Welcome2 game=new Welcome2();
	game.launchFrame();
}
}