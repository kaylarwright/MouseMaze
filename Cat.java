import java.awt.Color;
import java.awt.Graphics;

public class Cat extends GameObject{
Cat(int x, int y, int width, int height){
	super(x,y,width,height);
}
void update() {
	y++;
}
void draw(Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(x, y, width, height);
}
}
