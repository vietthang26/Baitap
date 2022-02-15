package character;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Background {
	BufferedImage mazeImages;
	int mazeNo = 0;

	public Background() {
		try {

				mazeImages = ImageIO.read(getClass().getResource("/images/00.png"));
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void draw(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 450, 550);
		g.drawImage(mazeImages, 0, 0, null);
	}
}
