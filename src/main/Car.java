////////////////////////////
// By:					 //
// Connor Sculthorpe	//
// 06 August 2024	   //
// TO: 06 August 2024 //
///////////////////////

/**
 * This file is a scaffold to build a car rental application from.
 * The designs here are not final, and should be changed.
 */

public class Car {
	private int id;
	private String make;
	private String model;
	private int year;
	private String licensePlate;
	private String category;
	private double price; // FIXME: Change to Money data type
	private boolean available;
	
	public Car(int id, String make, String model, int year, String licensePlate, String category, double price) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.year = year;
		this.licensePlate = licensePlate;
		this.category = category;
		this.price = price;
		this.available = true; // Initially available
	}

	public void setRented(int ID){
		this.available == false;
	}
	
	public void setAvailable(ID){
		this.available == true;
	}
	
	public String getCarInfo(ID){
		return String.format("Car: %s %s (%d) - License: %s, Category: %s, Price: %.2f", 
			make, model, year, licensePlate, category, price);
	}
}