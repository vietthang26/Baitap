package game;

import javax.swing.JFrame;

public class Main{	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setTitle("Pacman");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameScreen game = new GameScreen();
		window.getContentPane().add(game);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		if (game.keyb.isStartScreen==true) {
			game.start();
		}
	}
}
