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

public class Payment {
	private int paymentID;
	private Rental rental;
	private double amount; // FIXME: Change to Money data type.
	private LocalDate paymentDate;
	
	// Constructor
	public Payment(int paymentID, Rental rental, double amount, LocalDate paymentDate){
		this.paymentID = paymentID;
		this.rental = rental;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	
	// Methods
	processPayment(){ // Placeholder payment logic
		System.out.println("Payment of " + amount + " for rental ID " + rental.getRentalId() + " processed on " + paymentDate);
	}
	
	getPaymentInfo() { // https://www.geeksforgeeks.org/java-string-format-method-with-examples/
		return String.format("Payment ID: %d, Rental ID: %d, Amount: %.2f, Date: %s",
            paymentId, rental.getRentalId(), amount, paymentDate.toString());
	}
}