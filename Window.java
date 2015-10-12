package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
 




public class Window extends Canvas{

	
	private static final long serialVersionUID = -240840600533728354L;
	public Window(int width, int height, String title, Game game){
		JFrame frame = new JFrame(title); 						//a JFrame is basically the frame of out window an inbuilt library within java
		frame.setPreferredSize(new Dimension(width,height));	//functions within jframe
		frame.setMaximumSize(new Dimension(width,height));		//functions within jframe
		frame.setMinimumSize(new Dimension(width,height));		//functions within jframe
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// this closed the window
		frame.setResizable(false);			//allows the users to resize the windows but it is set to false
		frame.setLocationRelativeTo(null); 	//by putting it to null the allows the window to start in the center (if not it would start in the top left corner ) 
		frame.add(game); 					// adding our game class into our frame (JFrame) 
		frame.setVisible(true);				// setting the frame to visible so we can actually see it.
		game.start();						// running the start method that's in the "Game" Class
		
	}
	
}
