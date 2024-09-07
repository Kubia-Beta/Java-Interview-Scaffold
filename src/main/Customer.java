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

public class Customer {
	private int customerID;
	private String name;
	private String license;
	private String phone;
	private String email;
	private List<Rental> rentalHistory;
	
	// Constructor
    public Customer(int id, String name, String license, String phone, String email) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phone = phone;
        this.email = email;
        this.rentalHistory = new ArrayList<>();
    }

    // Methods
    public void addRental(Rental rental) {
        rentalHistory.add(rental);
    }

    public List<Rental> getRentalInfo() {
        return rentalHistory;
    }
}