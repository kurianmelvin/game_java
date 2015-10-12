package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;
@SuppressWarnings("unused")

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;
	
	
	
	public Player(int x, int y, ID id, Handler handler){
		super(x,y,id);
		this.handler = handler;
		
	}
	public Rectangle getBounds(){
		return new Rectangle(x,y,32,32);
		
	}
	
	
	public void tick() {
		x += velX;
		y += velY;
		
		
		x = Game.clamp(x, 0,Game.WIDTH - 37);
		y = Game.clamp(y, 0,Game.HEIGHT - 60);
		
		collision();
		
		
		
//		if(y <= 0 || y >= Game.HEIGHT-32) 
//			velY *= -1;
//		if(x <= 0 || x >= Game.WIDTH -32) 
//			velX *= -1;	
	}
	
	private void collision(){
		for (int i = 0; i < handler.object.size(); i++ ){ // running through all the objects in the game
			
			GameObject tempObject = handler.object.get(i); // creating a temporary object also getting each instance of our for loop 
			
			if(tempObject.getId()== ID.BasicEnemy){		//the getBounds returns a rectangle intersects with our tempObject then health gets reduced by 2    	//collision code
				if(getBounds().intersects(tempObject.getBounds())){
				HUD.HEALTH-=2;	
				}
			} 
		}
		
	}

	public void render(Graphics g) {
	/*	Graphics2D g2d = (Graphics2D) g;
		g.setColor(Color.GREEN);
		g2d.draw(getBounds());
		*/
		
		g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
		
		
		
		
	}
	
	
	
	
}
