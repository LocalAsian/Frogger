 import objectdraw.*;
  import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class Frog{
private VisibleImage frogImage; 
private boolean isDead;
private Image I;
	public Frog(Image i, DrawingCanvas c,int x,int y,Image death)
	{
    I=death;
		frogImage = new VisibleImage(i, new Location(x,y), c);
      isDead=false;
   
	}
  public void overlaps(VisibleImage vehicleImage, boolean isvehicle){
      if(frogImage.overlaps(vehicleImage) && isvehicle)
      {
        kill();
      }
  }
  public void kill(){    
      frogImage.setImage(I);
      frogImage.setSize(50.0,50.0);
      isDead=true;    
  }
  public void hops(String direction){
    if(direction.equals("w" ) || direction.equals("W" )){
      frogImage.move(0.0,-65.0);
    }
    else if(direction.equals("d")|| direction.equals("D" )){
      frogImage.move(65.0,0.0);
    }
    else if(direction.equals("a")|| direction.equals("A" )){
      frogImage.move(-65.0,0.0);
    }
    else if(direction.equals("s")|| direction.equals("S" )){
      frogImage.move(0.0,65.0);
    }
  }
  public boolean getLive(){   
    System.out.println(isDead);
    return isDead;
  }
}
