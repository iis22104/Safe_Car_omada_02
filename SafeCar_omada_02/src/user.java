
public class user {
	private String name;
	private String lname;
	private String position;
	public user(String name, String lname, String position) {
		super();
		this.name = name;
		this.lname = lname;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
