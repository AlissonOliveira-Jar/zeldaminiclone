package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {

	public static BufferedImage spritesheet;
	public static BufferedImage[] player_front;
	public static BufferedImage[] inimigo_front;
	public static BufferedImage tileWall;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		// Localize dentro da imagem o sprite e dá as dimensões que preciso
		player_front = new BufferedImage[2];
		inimigo_front = new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(1, 15, 16, 16);
		player_front[1] = Spritesheet.getSprite(19, 15, 16, 16);
		inimigo_front[0] = Spritesheet.getSprite(265, 245, 16, 16);
		inimigo_front[1] = Spritesheet.getSprite(282, 245, 16, 16);
		tileWall = Spritesheet.getSprite(310, 189, 16, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int widht, int height) {
		return spritesheet.getSubimage(x, y, widht, height);
	}
	
}
