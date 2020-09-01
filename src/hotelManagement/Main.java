package hotelManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employee john = new Employee("John", 300);
		Employee bob = new Employee("Bob", 250);
		
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(john);
		employeeList.add(bob);
		
		Guest vlada = new Guest("Vlada");
		Guest matt = new Guest("Matt");
		List<Guest> guestList = new ArrayList<>();
		guestList.add(vlada);
		guestList.add(matt);
		
        
		Hotel hotel = new Hotel("GH", employeeList, guestList);
		
		
		
		vlada.chooseApartment();
		vlada.payFees(50);
		vlada.updateRemaining();
		
		matt.chooseApartment();
		matt.payFees(40);
		matt.updateRemaining();
		
		
		
		
		
		System.out.println("********************* HOTEL **********************");
		System.out.println("Hotel has earned: $" + hotel.getTotalMoneyEarned());
		
		john.recieveSalary(john.getSalary());
		bob.recieveSalary(bob.getSalary());
		System.out.println("Hotel spent for salarys and now have: $" + hotel.getTotalMoneyEarned());

	}

}
