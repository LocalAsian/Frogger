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
}
