package zeldaminiclone;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Blocks extends Rectangle{
	
	public Blocks(int x, int y) {
		super(x, y, 32, 32);
	}

	public void render(Graphics g) {
		
		g.drawImage(Spritesheet.tileWall, x, y, 32, 32, null);
		
		/*
		 Parede lateral vermelha
			g.setColor(Color.MAGENTA);
			g.fillRect(x, y, width, height);
			g.setColor(Color.red);
			g.fillRect(x, y, width, height);
			g.drawRect(x, y, width, height);
		
		*/
	}
}
