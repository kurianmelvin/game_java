package com.tutorial.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler { 			// this class is going to maintain or update or render all of our objects in our room   
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	public void tick(){
		for (int i = 0; i < object.size(); i++){		//this is going to be looping through every single one of the game objects. if there is more than 1 object in the room
			GameObject tempObject = object.get(i);			//this gets i 
			tempObject.tick();
		}
	}
	public void render(Graphics g){
		for(int i = 0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			tempObject.render(g);
		}
	}
	public void addObject(GameObject object){
		this.object.add(object);
	}
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
}
