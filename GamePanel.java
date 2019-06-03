import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer time;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState = MENU_STATE;
Font titleFont;
Font titleF;
Font tFont;
Mouse ME = new Mouse(250,700,50,50);
ObjectManager OManager = new ObjectManager(ME);
@Override
public void paintComponent(Graphics g) {
	if(currentState == MENU_STATE) {
		drawMenuState(g);
	}else if(currentState == GAME_STATE) {
		drawGameState(g);
	}else if (currentState == END_STATE) {
		drawEndState(g);
	}
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
	repaint();
	if(currentState == MENU_STATE) {
		updateMenuState();
	}else if(currentState == GAME_STATE) {
		updateGameState();
	}else if(currentState == END_STATE) {
		updateEndState();
	}
}
GamePanel() {
	time = new Timer(1000/6, this);
	titleFont = new Font("Arial", Font.ITALIC, 48);
	titleF = new Font("Arial", Font.ITALIC, 28);
	tFont = new Font("Arial", Font.ITALIC, 48);

}
void startGame() {
	time.start();
}

@Override
public void keyPressed(KeyEvent a) {
	// TODO Auto-generated method stub
	if(a.getKeyCode()== KeyEvent.VK_ENTER) {
		currentState++;
		if(currentState > END_STATE) {
			currentState = MENU_STATE;
		}
	}
	if(a.getKeyCode()== KeyEvent.VK_UP){
		ME.up = true;
	}
	if(a.getKeyCode() == KeyEvent.VK_DOWN){
		ME.down = true;
	}
	if(a.getKeyCode() == KeyEvent.VK_RIGHT){
		ME.right = true;
	}
	if(a.getKeyCode ()== KeyEvent.VK_LEFT){
		ME.left = true;
	}
}

@Override
public void keyReleased(KeyEvent a) {
	if(a.getKeyCode() == KeyEvent.VK_UP){
		ME.up = false;
	}
	if(a.getKeyCode()== KeyEvent.VK_DOWN){
		ME.down = false;
	}
	if (a.getKeyCode() == KeyEvent.VK_RIGHT){
		ME.right = false;
	}
	if (a.getKeyCode() == KeyEvent.VK_LEFT) {
		ME.left = false;
	}
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("to console");
}
void updateMenuState() {
	
}
void updateGameState() {
	OManager.update();
	OManager.manageEnemies();
}
void updateEndState() {
	
}
void drawMenuState(Graphics g) {
	g.setColor(Color.GRAY);
	g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
	g.setColor(Color.RED);
	g.setFont(titleFont);
	g.drawString("Mouse Maze", 120, 350);
	g.setColor(Color.RED);
	g.setFont(titleF);
	g.drawString("By:Kayla Wright",150, 450);
}
void drawGameState(Graphics g) {
	g.setColor(Color.GREEN);
	g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
	OManager.draw(g);
}
void drawEndState (Graphics g) {
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, Game.WIDTH, Game.HEIGHT);
	g.setColor(Color.RED);
	g.setFont(tFont);
	g.drawString("GAME OVER", 120, 400);
}
}
