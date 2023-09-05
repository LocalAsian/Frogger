 import objectdraw.*;
  import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class Frog{
private VisibleImage frogImage; 

	public Frog(Image i, DrawingCanvas c)
	{
		frogImage = new VisibleImage(i, new
		Location(330,310), c);
	}
  public boolean overlaps(VisibleImage vehicleImage){
      return frogImage.overlaps(vehicleImage);
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
}
