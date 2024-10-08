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
		return daysElapsed * car.price(); // FIXME: Change the function return to Money from Double
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
	
	// Cosntructor
	public RentalService() {
		this.availableCars = new ArrayList<>();
		this.customers = new ArrayList<>();
		this.rentals = new ArrayList<>();
	}

	// Methods
	public void addCar(Car car){
		availableCars.add(car);
	}
	
	public void addCustomer(customer){
		customers.add(customer);
	}
	
	public Car getCarByID(int carID){
		for (Car car : availableCars){
			if (car.id() == carID){
				return car;
			}
		}
		return null; // Not found
	}
	
	public Customer getCustomerbyID(int customerID){
		for (Customer customer : customers){
			if (customer.customerID == customerID){
				return customer;
			}
		}
		return null; // Not found
	}
	
	public void newRental(int customerID, int carID, LocalDate startDate, LocalDate returnDate){
		Car car = findCarByID(carID);
		Customer customer = getCustomerbyID(customerID);
		if (car != null && car.available == true){
			rentals.add(rental);
			car.setRented();
			customer.addRental(rental);
		}
	}
	
	public void endRental(int rentalID){
		for (Rental rental : rentals){
			if (rental.getRentalID() == rentalID){
				rental.returnCar();
				return;
			}
		}
	}
}

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