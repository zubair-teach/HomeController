package org.example;
import java.util.ArrayList;
import java.util.Iterator;
  public class HomeControlLauncher{
ArrayList<HomeDevice> Things = new ArrayList <HomeDevice>();
  
	public void goToSleep () {
				
	}
			

		
    }
	public void wakeup () {
				
	}
	
	public void add (HomeDevice thing) {
	
	}
  
  
  public static void main (String [] args) {
	  HomeControlLauncher hc = new HomeControlLauncher(); 
	  
	  hc.add (new RoomLight("bedroom"));
	  hc.add (new EmergencyLight("hallway"));
	  hc.add (new CDPlayer ("bedroom"));
	  hc.add (new TV ("sitting room"));
	  
	  hc.goToSleep ();
	  hc.wakeup ();
   }
   }


