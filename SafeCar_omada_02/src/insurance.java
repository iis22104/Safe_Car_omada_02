import java.util.ArrayList;

public class insurance{
	private int id;
	private String name;
	private ArrayList packet;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public insurance(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	
}