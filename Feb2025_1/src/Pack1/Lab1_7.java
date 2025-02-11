package Pack1;

public class Lab1_7 {
	
	private String firstName;
	private String lastName;
	private char Gender;
	private int Phone;
	
	public Lab1_7(String firstName, String lastName, char Gender) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.Gender=Gender;
	}
	
	public Lab1_7(int Phone) {
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
    
    public int getPhone() {
        return Phone;
    }
    
    public void setPhone(int Phone) {
    	this.Phone=Phone;
    }
	
}
