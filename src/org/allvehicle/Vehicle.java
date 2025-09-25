package org.allvehicle;

import org.fourWheeler.FourWheeler;
import org.threeWheeler.ThreeWheeler;
import org.twoWheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessery() {
		// TODO Auto-generated method stub
System.out.println("Atleast One Vehicle of Necessery for Human People");
	}  
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.vehicleNecessery();
		
		TwoWheeler r=new TwoWheeler();
		r.bike();
		
		ThreeWheeler d=new ThreeWheeler();
		d.auto();
		
		FourWheeler c=new FourWheeler();
		c.car();
		c.bus();
		c.lorry();
		
		
	}
	

}
