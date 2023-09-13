import objectdraw.*;
import java.awt.*;
import java.awt.Color;
public class Vehicle extends ActiveObject{
	private VisibleImage vehicleImage; 
	private double speed;
	public Vehicle(Image i,int x,int y,DrawingCanvas c)
	{
		vehicleImage = new VisibleImage(i, new Location(200,160), c);
		
		speed = 70.0;
	}
    
	public void run(){
    
		double currentTime = System.currentTimeMillis();
		pause(50.0);
		double actualPause = currentTime-50;
		double distance = actualPause*speed;
		//kill(); -should detect if vehicle goes over frog-
   
  }
  
	}
	
	
