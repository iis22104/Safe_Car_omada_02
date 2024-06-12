
public class contract {
	private int id;
	//private String sDate;
	//private String fDate;
	private String clientId;
	private String carId;
	private String insPacketId;
	private int cost;
	
	
	
	
	public contract(int id, String clientId, String carId, String insPacketId, int cost) {
		super();
		this.id = id;
		this.clientId = clientId;
		this.carId = carId;
		this.insPacketId = insPacketId;
		this.cost = cost;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getInsPacketId() {
		return insPacketId;
	}
	public void setInsPacketId(String insId) {
		this.insPacketId = insId;
	}
	public int getCost() {
		return cost;
	}
	
	
}
