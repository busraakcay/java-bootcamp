package Users;

public class User{
	int id;
	String nationalId;
	String name;
	String surname;
	String birthDate;
	public User(int id, String nationalId, String name, String surname, String birthDate) {
		super();
		this.id = id;
		this.nationalId = nationalId;
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
