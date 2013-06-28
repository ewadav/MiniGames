package breakout;

import javax.swing.ImageIcon;

public class Brick extends Sprite{

	private String brick = "Breakout/Images/brick.png";
	private boolean destroyed;
	
	public Brick(int x, int y)	{
		this.x = x;
		this.y = y;
		
		ImageIcon ii = new ImageIcon(this.getClass().getResource(brick));
		image = ii.getImage();
		
		width = image.getWidth(null);
		height = image.getHeight(null);
		
		destroyed = false;
	}
	
	public boolean isDestroyed() {
      return destroyed;
    }

    public void setDestroyed(boolean destroyed)	{
      this.destroyed = destroyed;
    }
    
}
