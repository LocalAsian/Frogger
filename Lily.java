import objectdraw.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.util.ArrayList;
public class Lily{
  private ArrayList<VisibleImage> lily;
  private VisibleImage lil;
  private Frog beef;
public Lily(Image i,int x,int y, DrawingCanvas c, Frog BEEF)
	{
    beef=BEEF;
    ArrayList<VisibleImage> lily= new ArrayList<VisibleImage>();
    for(int ii=0;ii<80;ii+=13){
      lily.add( lil= new VisibleImage(i, new Location(x*ii+20,y), c));
      lily.get(ii/13).setSize(60.0,45.0);
    }
   
      lily.add(lil = new VisibleImage(i, new Location(x+335,y+310), c));   
      lily.get(7).setSize(60.0,45.0);
  }
   public void overlaps(int i){
      if(beef.getFrog().overlaps(lily.get(i)))
      {
      beef.addScore();
      }}
  
}