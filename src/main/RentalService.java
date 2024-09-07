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
			if (car.getID() == carID){
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