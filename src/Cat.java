import java.awt.Color;
import java.awt.Graphics;

public class Cat extends GameObject{
Cat(int x, int y, int width, int height){
	super(x,y,width,height);
}
void update() {
	super.update();
	y++;
}
void draw(Graphics g) {
	g.drawImage(GamePanel.CatImg,x,y,width,height,null);
}
}
