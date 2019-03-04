import java.awt.Dimension;

import javax.swing.JFrame;

public class Cheese {
	public final static int x = 800;
	public  final static int y = 800;
	JFrame jf = new JFrame();
	GamePanel gp;
public static void main(String[] args) {
	Cheese c = new Cheese();
	c.setup();
	
	
}
Cheese(){
	gp = new GamePanel();
}
void setup() {
	jf.add(gp);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.getContentPane().setPreferredSize(new Dimension (x,y) );
	jf.pack();
	jf.addKeyListener(gp);
	
}
	
}
