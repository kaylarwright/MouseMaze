import java.awt.Graphics;

public class ObjectManager {
Mouse OUSE;

ObjectManager(Mouse m){
	OUSE = m;
}
void update(){
	OUSE.update();
}
void draw(Graphics g){
	OUSE.draw(g);
}
}
