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
    if(direction=="w"){
      frogImage.move(0.0,50.0);
    }
    else if(direction=="d"){
      frogImage.move(50.0,0.0);
    }
    else if(direction=="a"){
      frogImage.move(-50.0,0.0);
    }
    else if(direction=="s"){
      frogImage.move(0.0,-50.0);
    }
  }
}
