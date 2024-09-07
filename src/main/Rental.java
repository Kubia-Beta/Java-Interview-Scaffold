////////////////////////////
// By:                   //
// Connor Sculthorpe    //
// 06 August 2024      //
// TO: 06 August 2024 //
///////////////////////

/**
 * This file is a scaffold to build a car rental application from.
 * The designs here are not final, and should be changed.
 */

public class Rental {
	private int rentalID;
	private Customer customer;
	private Car car;
	private LocalDate startDate;
	private LocalDate returnDate;
	private LocalDate endDate;
	private double finalPrice; // FIXME: Change to Money data type.
	
	// Constructor
    public Rental(int rentalID, Customer customer, Car car, LocalDate startDate,
		LocalDate returnDate, LocalDate endDate) {
        this.rentalID = rentalID;
        this.customer = customer;
        this.car = car;
        this.rentalDate = rentalDate; // When the customer begins rental
        this.returnDate = returnDate; // When the unit is returned
		this.endDate = endDate; // When the customer returns the unit
        this.totalPrice = evaluateFinalPrice();
    }
	
	// Methods
	public double evaluateFinalPrice(){ // https://stackoverflow.com/questions/33530011/java-easiest-way-to-subtract-dates
		long daysElapsed = java.time.temporal.ChronoUnit.DAYS.between(rentalDate, endDate);
		return daysElapsed * car.getPrice(); // FIXME: Change the function return to Money from Double
	}
	
	returnRental(){
		car.setAvailable();
		this.totalPrice = evaluateFinalPrice();
	}
	
	getRentalInfo(){
		return String.format("Rental ID: %d, Customer: %s, Car: %s, Rental Date:%s, Return Date: %s, Total Price: %.2f",
            rentalId, customer.getName(), car.getInfo(), rentalDate.toString(), returnDate.toString(), totalPrice);
    }
}