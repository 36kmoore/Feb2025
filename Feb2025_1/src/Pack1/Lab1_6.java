package Pack1;

public class Lab1_6 {
		
	private String firstName;
	private String lastName;
	private char Gender;
	private int Phone;
	
	public Lab1_6(String firstName, String lastName, char Gender, int Phone) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.Gender=Gender;
		this.Phone=Phone;
	}
	
    public String getFName() {
        return firstName;
    }
    
    public void setFName(String firstName) {
    	this.firstName = firstName;
    }
    
    public String getLName() {
    	return lastName;
    }
    
    public void setLName(String lastName) {
    	this.lastName = lastName;
    }
    
    public char getGender() {
    	return Gender;
    }
    
    public void setGender(char Gender) {
    	this.Gender = Gender;
    }

}
