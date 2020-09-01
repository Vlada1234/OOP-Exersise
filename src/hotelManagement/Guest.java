package hotelManagement;

import java.util.List;
import java.util.Scanner;

public class Guest {
	// Variables
	private String guestName;
	private double totalFees;
	private double feesPaid;
	private int choice;
	private List<Guest> guests;

	// Constructor
	public Guest(String guestName) {
		this.guestName = guestName;
		this.feesPaid = 0;
		this.totalFees = 0;
	}

	// Getters and Setters
	public double getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}

	public double getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}

	// Functions
	public void chooseApartment() {

		do {
			System.out.print("Choose your apartment: " + "\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("1. Standard Apartment");
			System.out.println("2. Luxury Apartment");
			System.out.println("3. Exit");

			choice = sc.nextInt();

			if (choice == 1) {
				totalFees = 100;
				System.out.println("Your choice is standard apartment: " + "Price is: $" + totalFees);
				break;
			} else if (choice == 2) {
				totalFees = 1000;
				System.out.println("Your choice is luxury apartment: " + "Price is: $" + totalFees);
				break;
			} else if (choice == 3) {
				System.out.println("Bye");
				break;
			} else {
				System.out.println("Invalid choice");
			}
		} while (1 != 0);

	}

	public double payFees(double amount) {
		feesPaid += amount;
		Hotel.updateTotalMoneyEarned(feesPaid);
		if (feesPaid == totalFees) {
			System.out.println("You paid: $" + feesPaid);
			System.out.println("You paid your fees");
		} else if (feesPaid < totalFees) {
			System.out.println("You paid: $" + feesPaid);
			System.out.println("You didn't paid your fees");
		}

		return feesPaid;
	}

	public double updateRemaining() {
		System.out.println("Your reamining is: " + (totalFees - feesPaid));
		return totalFees - feesPaid;

	}

}
