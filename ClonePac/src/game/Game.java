package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.ArrayList;

import character.Actor;
import character.Background;
import character.Ghost;
import character.Pacman;

public class Game {
	ArrayList<Actor> actors = new ArrayList<Actor>();
	Background background;
	Font font;
	int score = 0;
	int live = 3;
	public boolean set = false;
	int total;
	int count;
	int power;

	public Game() {
		font = new Font("x12y16pxMaruMonica", Font.PLAIN, 40);
		background = new Background();
		actors.add(new Pacman());
		actors.add(new Ghost("pinkGhost"));
		actors.add(new Ghost("redGhost"));
		actors.add(new Ghost("yellowGhost"));
		actors.add(new Ghost("cyanGhost"));
	}

	public boolean touching(Actor a, Actor b) {

		return Math.abs(a.getY() - b.getY()) + Math.abs(a.getX() - b.getX()) < 3;
	}

	public void setupPill() {
		Pacman pacman = (Pacman) actors.get(0);
		total = pacman.totalPill;
		if (pacman.cells[pacman.getY()][pacman.getX()] == '2') {
			pacman.cells[pacman.getY()][pacman.getX()] = '1';
			score += 5;
			pacman.countPill++;
		} else if (pacman.cells[pacman.getY()][pacman.getX()] == '3') {
			pacman.cells[pacman.getY()][pacman.getX()] = '1';
			score += 50;
			pacman.countPill++;
			pacman.move = 2;
			for (int i = 1; i <= 4; i++) {
				Ghost ghost = (Ghost) actors.get(i);
				ghost.edibleCountDown = 500;
			}
		}
		for (int i = 1; i <= 4; i++) {
			Ghost ghost = (Ghost) actors.get(i);
			if (ghost.edibleCountDown > 0) {
				if (touching(ghost, pacman)) {
					score += 100;
					ghost.setX(114);
					ghost.setY(98);
					ghost.edibleCountDown = 0;
				}
				ghost.edibleCountDown--;
			} else {
				if (touching(ghost, pacman)) {
					pacman.lives--;
					live = pacman.lives;
					if (pacman.lives == 0) {
						pacman.dead = true;
					}
					pacman.setX(114);
					pacman.setY(194);
					set = true;
				}
			}
			if (pacman.dead == true || pacman.countPill == pacman.totalPill)
				ghost.dead = true;
		}
		if (set == true && pacman.dead == false) {
			for (int i = 1; i <= 4; i++) {
				Ghost ghost = (Ghost) actors.get(i);
				ghost.setX(114);
				ghost.setY(98);
				set = false;
			}
		}
		count = pacman.countPill;
		if (pacman.countPill == pacman.totalPill)
			pacman.dead = true;
		if (pacman.move != 1) {
			power++;
			if (power > 160) {
				pacman.move = 1;
				power = 0;
			}
		}
	}

	public void update() {
		for (Actor actor : actors) {
			actor.update();
		}
		setupPill();
	}

	public void draw(Graphics2D g) {
		background.draw(g);
		for (Actor actor : actors) {
			actor.draw(g);
		}
		g.setFont(font);
		g.setColor(Color.white);
		g.setFont(g.getFont().deriveFont(Font.BOLD, 36F));
		g.drawString("Scores: " + score, 10, 540);
		g.drawString(live + ": Lives", 340, 540);
		if (live == 0 || count == total) {
			g.setColor(Color.WHITE);
			g.fillRect(120, 200, 210, 40);
			g.setColor(Color.BLACK);
			g.drawString("GAME OVER", 150, 235);

		}
	}

}
