import java.applet.*;
import java.awt.*;
public class testapp1 extends Applet
{
	Color C;
	Font F1;
	public void init()
	{
		C=new Color(0,255,0);
		F1=new Font("Arial", Font.BOLD, 25);
		setBackground(Color.red);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		 g.setFont(F1);
		 g.drawString("Sushant IT College", 20,50);
		 g.setColor(C);
		 g.drawString("Naini", 35, 80);
		 
	}
}
/*
<applet code="testapp1" width="300" height="300">
</applet>
*/