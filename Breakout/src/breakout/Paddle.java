package breakout;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Paddle extends Sprite implements Commons	{
	
	private String paddle = "Breakout/Images/paddle1.png";
	private int dx;
	
	public Paddle()	{
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(paddle));
		image = ii.getImage();
		
		width = image.getWidth(null);
		height = image.getHeight(null);
		
		resetState();
		
	}
	
	public void move()	{
		x += dx;
		
		if(x <= 2)	{
			x = 2;
		}
		
		if(x > Commons.PADDLE_RIGHT)	{
			x = Commons.PADDLE_RIGHT;
		}
		
	}
	
	public void keyPressed(KeyEvent event)	{
		int key = event.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT)	{
			dx = -2;
		}
		
		if(key == KeyEvent.VK_RIGHT)	{
			dx = 2;
		}
	}
	
	public void keyReleased(KeyEvent event)	{
		int key = event.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT)	{
			dx = -0;
		}
		
		if(key == KeyEvent.VK_RIGHT)	{
			dx = 0;
		}
	}
	
	public void resetState()	{
		x = 200;
		y = 360;
	}
	
}
