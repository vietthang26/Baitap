package game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GameScreen extends JPanel {
	public static final int WIDTH = 450;
	public static final int HEIGHT = 550;
	Font font1;

	Keyboard keyb = new Keyboard();
	BufferedImage screen;

	private boolean running;
	private Game game;

	public GameScreen() {
		font1 = new Font("x12y16pxMaruMonica", Font.PLAIN, 40);
		addKeyListener(keyb);
		setFocusable(true);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
//		Util.loadAllIamge();
		game = new Game();
		running = false;
		try {
			screen = ImageIO.read(getClass().getResource("/images/startscreen-02-01.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		if (running) {
			return;
		}
		running = true;
		Thread thread = new Thread(new MainLoop());
		thread.start();
	}

	private void update() {
		game.update();

	}

	private void draw(Graphics2D g) {
		game.draw(g);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (keyb.isStartScreen == true) {
			drawStartScreen(g);
		} else {
			draw((Graphics2D) g);
		}
	}

	private void drawStartScreen(Graphics g) {
		// TODO Auto-generated method stub
		g.setFont(font1);
		g.drawImage(screen, 0, 0, 450, 550, null);
		g.setFont(g.getFont().deriveFont(Font.BOLD,36F));
		g.setColor(Color.WHITE);
		g.drawString("PRESS S TO START !!!", 100, 500);
	}

	private class MainLoop implements Runnable {

		@Override
		public void run() {
			while (keyb.isStartScreen) {
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			long desiredFrameRateTime = 1000 / 60;
			long currentTime = System.currentTimeMillis();
			long lastTime = currentTime - desiredFrameRateTime;
			long unprocessedTime = 1;
			boolean needsRender = false;
			while (running) {
				currentTime = System.currentTimeMillis();
				unprocessedTime += currentTime - lastTime;
				lastTime = currentTime;

				while (unprocessedTime >= desiredFrameRateTime) {
					unprocessedTime -= desiredFrameRateTime;
					update();
					needsRender = true;
				}

				if (needsRender) {
					repaint();
					needsRender = false;
				} else {
					try {
						Thread.sleep(1);
					} catch (InterruptedException ex) {
					}
				}
			}
		}

	}

}
