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
	public void processPayment(){ // Placeholder payment logic
		System.out.println("Payment of " + amount + " for rental ID " + rental.getRentalId() + " processed on " + paymentDate);
	}
	
	public String getPaymentInfo() { // https://www.geeksforgeeks.org/java-string-format-method-with-examples/
		return String.format("Payment ID: %d, Rental ID: %d, Amount: %.2f, Date: %s",
            paymentId, rental.getRentalId(), amount, paymentDate.toString());
	}
}

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
	
	public void returnRental(){
		car.setAvailable();
		this.totalPrice = evaluateFinalPrice();
	}
	
	public String getRentalInfo(){
		return String.format("Rental ID: %d, Customer: %s, Car: %s, Rental Date:%s, Return Date: %s, Total Price: %.2f",
            rentalId, customer.getName(), car.getInfo(), rentalDate.toString(), returnDate.toString(), totalPrice);
    }
}

public class RentalService {
	private List<Car> availableCars;
	private list<Customer> customers;
	private List<Rental> rentals;

	addCar(car){
		
	}
	
	addCustomer(customer){
		
	}
	
	getCarByID(ID){
		
	}
	
	getCustomerbyID(ID){
		
	}
	
	newRental(customer ID, car ID, startDate, returnDate){
		
	}
	
	endRental(rental ID){
		
	}
}

public class Car {
	private id: int
	private make: str
	private model: str
	private year: date
	private license: str
	private category: str
	private price: money
	private available: bool

	setRented(ID){
		
	}
	
	setAvailable(ID){
		
	}
	
	getCarInfo(ID){
		
	}
}