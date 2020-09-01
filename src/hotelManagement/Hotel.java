package hotelManagement;

import java.util.List;

public class Hotel {
	// Variables
	private String hotelName;
	private List<Guest> guests;
	private List<Employee> employees;
	private static double totalMoneyEarned;
	private static double totalMoneySpent;
	private String apartment;
	private int apartmentsAvailable;
	
	// Constructor
	public Hotel(String hotelName, List<Employee> employees, List<Guest> guests ) {
		this.hotelName = hotelName;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
		apartmentsAvailable = 10;
		
		
	}
	
	// Getters and Setters
	public static double getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(double MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	public double getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static double updateTotalMoneySpent(double MoneySpent) {
		return totalMoneyEarned -= MoneySpent;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(String apartment) {
		this.apartment = apartment;
	}

	public int getApartmentsAvailable() {
		return apartmentsAvailable;
	}

	public void setApartmentsAvailable(int apartmentsAvailable) {
		this.apartmentsAvailable = apartmentsAvailable;
	}
	
	// Functions
	
	
	

	
	
	
	
	
}
