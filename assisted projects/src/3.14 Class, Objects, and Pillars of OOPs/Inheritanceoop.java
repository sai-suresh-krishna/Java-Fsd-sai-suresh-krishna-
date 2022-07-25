package classandobj;

class Bike{
	    public int gear; 
	    public int speed; 
	    public Bike(int gear, int speed) 
	    { 
	        this.gear = gear; 
	        this.speed = speed; 
	    } 
	    public void applyBrake(int decrement) 
	    { 
	        speed -= decrement; 
	    } 
	    public void speedUp(int increment) 
	    { 
	        speed += increment; 
	    }  
	    public String toString()  
	    { 
	        return("No of gears are " + gear + "\n" + "speed of bicycle is " + speed); 
	    }  
	} 
	class RaceBike extends Bike 
	{ 
	    public int seatHeight; 
	    public RaceBike(int gear,int speed,int startHeight) 
	    {  
	        super(gear, speed); 
	        seatHeight = startHeight; 
	    }  
	    public void setHeight(int newValue) 
	    { 
	        seatHeight = newValue; 
	    } 
	   
	    public String toString() 
	    { 
	        return (super.toString()+ 
	                "\nseat height is "+seatHeight); 
	    } 
	}
	public class Inheritanceoop
	{ 
	    public static void main(String args[])  
	    { 
	        RaceBike mb = new RaceBike(6, 190, 25); 
	        System.out.println(mb.toString());
	    } 
	}



