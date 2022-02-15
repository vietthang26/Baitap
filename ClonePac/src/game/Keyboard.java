package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
	public static boolean keys[] = new boolean[256];
	public boolean isStartScreen = true;
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key >= 37 && key <= 40)
			keys[e.getKeyCode()] = true;
			if (key == KeyEvent.VK_S) {
				isStartScreen = false;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() >= 37 && e.getKeyCode() <= 40)
			keys[e.getKeyCode()] = false;
	}
}
