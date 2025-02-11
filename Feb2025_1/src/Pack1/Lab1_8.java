package Pack1;

public class Lab1_8 {

	private String firstName;
	private String lastName;
	private int Phone;
	Gender gender;
	
	public Lab1_8(String firstName, String lastName, Gender gender) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
	}
	
	public Lab1_8(int Phone) {
		this.Phone=Phone;
	}
	
	public enum Gender {
		M, F
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender=gender;
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
    
    public int getPhone() {
        return Phone;
    }
    
    public void setPhone(int Phone) {
    	this.Phone=Phone;
    }
	
}
