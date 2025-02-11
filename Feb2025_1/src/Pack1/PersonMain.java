package Pack1;

public class PersonMain {

public static void main(String[] args) {
		
		//Lab 6
		Lab1_6 person = new Lab1_6("Jane", "Doe", 'F', 1234567890);
		System.out.println("Person's Details");
		System.out.println("____________________");
		System.out.println("First Name: " + person.getFName());
		System.out.println("Last Name: " + person.getLName());
		System.out.println("Gender: " + person.getGender());
		System.out.println("\n");
	
		//Lab 7
		Lab1_7 person2 = new Lab1_7("Jane", "Doe", 'F');
		Lab1_7 personP = new Lab1_7(1234567890);
		System.out.println("Person's Details");
		System.out.println("____________________");
		System.out.println("First Name: " + person2.getFName());
		System.out.println("Last Name: " + person2.getLName());
		System.out.println("Gender: " + person2.getGender());
		System.out.println("Phone Number: " + personP.getPhone());
		System.out.println("\n");
	}
}
