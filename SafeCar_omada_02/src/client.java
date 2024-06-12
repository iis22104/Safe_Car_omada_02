
public class client {
	private String name;
	private String lName;
	private String birth;
	private String address;
	private String licence;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLicence() {
		return licence;
	}
	public void setLicence(String licence) {
		this.licence = licence;
	}
	public client(String name, String lName, String phone, String email, String licence) {
		super();
		this.name = name;
		this.lName = lName;
		this.phone = phone;
		this.email = email;
		this.licence = licence;
	}
	
	
}
