import objectdraw.*;
import java.awt.*;
import java.awt.Color;
public class Vehicle extends ActiveObject{
	private VisibleImage vehicleImage; 
	private double speed;
	private Frog fred;
	public Vehicle(Image i,int x,int y,DrawingCanvas c,double speed, Frog fred) {
		vehicleImage = new VisibleImage(i, new Location(800,45), c);
		vehicleImage.setSize(110.0,60.0);
		speed = -5.0;
		this.fred = fred;
		this.start();
	}

	public Vehicle(Image i,int x,int y,DrawingCanvas c)
	{
		vehicleImage = new VisibleImage(i, new Location(200,160), c);
		
		speed = 70.0;
	}
    
	public void run(){
    
		double currentTime = System.currentTimeMillis();
		pause(20.0);
		double actualPause = currentTime-50;
		double distance = actualPause*speed;
		while (vehicleImage.getX()>-100 && vehicleImage.getX()>1000) {
			vehicleImage.move(speed,0.0);
			pause(50.0);
			//dlete me later
			fred.overlaps(vehicleImage, true);
		}
		System.out.println("test worked");
		//kill(); -should detect if vehicle goes over frog-
   
  }
  
	}

}

