
public class accident {
	private int id;
	private String date;
	private boolean ypait;
	private String clientId;
	private String outsideDriverId;
	public accident(String date, boolean ypait, String clientId, String outsideDriverId) {
		super();
		this.date = date;
		this.ypait = ypait;
		this.clientId = clientId;
		this.outsideDriverId = outsideDriverId;
	}
	public int getId() {
		return id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isYpait() {
		return ypait;
	}
	public void setYpait(boolean ypait) {
		this.ypait = ypait;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	
}
