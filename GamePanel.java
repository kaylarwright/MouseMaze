import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
Timer time;
@Override
public void paintComponent(Graphics g) {
	g.fillRect(10, 10, 100, 100);
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	repaint();
}
GamePanel() {
	time = new Timer(1000/6, this); 
}
void startGame() {
	time.start();
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("a");
}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("Message to");
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("to console");
}
}
