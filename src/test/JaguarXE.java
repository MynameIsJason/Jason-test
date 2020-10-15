package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import jlrInterface.VehicleInterface;

public class JaguarXE implements VehicleInterface {
	String name = "XE";
	String model = "J350";
	int price = 30;

	@Override
	public void vehicleName() {
		System.out.println("The vehicle name is: " + name);

	}

	@Override
	public void vehicleModel() {
		System.out.println("The vehicle model is: " + model);
	}

	@Override
	public void vehiclePrice() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(formatter.format(date) + "The vehicle price is: " + price);
	}

}
