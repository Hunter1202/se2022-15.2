package javaws;

public class Account extends MainController {
	
	//constructor
	public Account(String username, String password, String gender, String birthday, 
			String married, String country, String notes, StringBuilder hobbylist ) {
		super();
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.married = married;
        this.country = country;
        this.notes = notes;
        this.hobbylist = hobbylist;
    }
	
	public Account() {}
	
	//get set
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public StringBuilder getHobbylist() {
		return hobbylist;
	}

	public void setHobbylist(StringBuilder hobbylist) {
		this.hobbylist = hobbylist;
	}
}
