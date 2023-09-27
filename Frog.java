 import objectdraw.*;
  import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Color;
public class Frog{
private VisibleImage frogImage; 
private VisibleImage frogImage1; 
private VisibleImage frogImage2; 
private VisibleImage frogImage3; 
private boolean isDead;
private Image I;
private int score;
private int X;
private int Y;
private Image W;
  private double p;
private int lives=3;
	public Frog(Image i, DrawingCanvas c,int x,int y,Image death)
	{
    p=Math.random();
    X=x;
    Y=y;
    I=death;
    W=i;
		frogImage = new VisibleImage(i, new Location(x,y), c);
      isDead=false;
    frogImage.setSize(80.0+(p*120),50.0);
   
	}
  public void Lives(DrawingCanvas c){
    
    frogImage1 = new VisibleImage(W, new Location(1*80*1-50,310), c);
    frogImage2 = new VisibleImage(W, new Location(1*80*2-50,310), c);
    frogImage3 = new VisibleImage(W, new Location(1*80*3-50,310), c);
    
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
  public void live(){
    if(isDead&& lives>0){
      frogImage.moveTo((double)X,(double)Y);
      frogImage.setImage(W);
      
      frogImage.setSize(80.0+(p*120),50.0)
        ;p=Math.random();
      isDead=false;
      lives--;
      if(lives==2){
        frogImage3.setImage(I);
        frogImage3.setSize(50.0,50.0);
      }
      else if(lives==1){
        frogImage2.setImage(I);
        frogImage2.setSize(50.0,50.0);
      }
      else if(lives==0){
        frogImage1.setImage(I);
        frogImage1.setSize(50.0,50.0);
      }
    }
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
    return isDead;
  }
  public void addScore(){
    score++;
  }
  public VisibleImage getFrog(){
    return frogImage;
  }
}
