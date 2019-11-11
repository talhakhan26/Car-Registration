import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CarReg {
	
	static Car car = new Car();
	private static Map<String,Car> carMap = new HashMap<>();
	
	public static void main(String args[]) {
		
		System.out.println("=== Car Registration ===");
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("====Options====");
			System.out.println("Press 'A' for Add a Car");
			System.out.println("Press 'S' for Search a Car");
			System.out.println("Press 'D' for Delete a Car");
			System.out.print("Enter your choice: ");
			String option = input.nextLine();
			if(option.trim().equalsIgnoreCase("a")) {
				System.out.println("You have selected to Add a Car");
				addCar();
				
			}else if(option.trim().equalsIgnoreCase("s")) {
				
				System.out.println("You have selected to Search a Car");
				System.out.print("Insert License Number: ");
				String lcNum = input.nextLine();
                searchCar(lcNum.trim());
				
			}else if(option.trim().equalsIgnoreCase("d")) {
				System.out.println("You have selected to Delete a Car");
				System.out.print("Insert License Number: ");
				String lcNum = input.nextLine();
				
                deleteCar(lcNum);
  
			}else{
                System.out.print("\nYou have selected '" + option + "' which is not a valid choice, Please try again");
                break;
			}
		}
				
		
	}
	
	public static void addCar() {
			
		String lcNum,engineCapacity, make,model;
		int year;
		Car car = new Car();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insert License Num: ");
		lcNum = input.nextLine();
		car.setLcNum(lcNum);
		
		System.out.print("Insert Engine Capacity: ");
		engineCapacity = input.nextLine();
		car.setEngineCapacity(engineCapacity);
		
		System.out.print("Insert Car Make: ");
		make = input.nextLine();
		car.setMake(make);
		
		System.out.print("Insert Car Model: ");
		model = input.nextLine();
		car.setModel(model);
		
		System.out.print("Insert Car Year: ");
		year = input.nextInt();
		if (year >= 1900 && year <= 2019) {
		car.setYear(year);
		
		System.out.println("===Your car has been added successfully with following information\r\n" + 
				"license number: "+lcNum+"\nEngine Capacity: "+engineCapacity+ "\nMake: "+make+ "\nModel: " +model+ "\nYear: "+year);
		
		if(carMap.containsKey(lcNum)) {
			System.out.println("Car found with this license number.. You can't add another with this license number!");
		}else {
			
		carMap.put(car.getLcNum(),car);
		System.out.print("Map Size: "+carMap.size()+"\n");
		}
		
		}else {
			System.out.println("Car registration failed..!"+"\nInput year  between 1900 to 2019");
		}
		
		
		
	}
	
	public static void searchCar(String lcNum) {

		Car getLN = carMap.get(lcNum);
		if(getLN != null) {
				System.out.println("License Num: "+carMap.get(lcNum).getLcNum());
				System.out.println("Engine Capacity "+carMap.get(lcNum).getEngineCapacity());
				System.out.println("Car Maker: "+carMap.get(lcNum).getMake());
				System.out.println("Car Model: "+carMap.get(lcNum).getModel());
				System.out.println("Car Year: "+carMap.get(lcNum).getYear());
				} else {
					System.out.println("License Number did not match");
				}
			}
			
	public static void deleteCar(String lcNum) {

		Car getLN = carMap.get(lcNum);
		if(getLN != null){
			carMap.remove(lcNum).getLcNum();
			System.out.println("You have successfully deleted the car with license No: "+ lcNum);
			System.out.print("Map Size: "+carMap.size()+"\n");
			}else{
			System.out.println("Car not found with this license number to be deleted!");
			System.out.print("Map Size: "+carMap.size()+"\n");
			}
	}
}