
public class insPackets {
	private String id;
	private String packetName;
	private String insId;
	private String duration;
	public insPackets(String id, String packetName, String duration) {
		super();
		this.id = id;
		this.packetName = packetName;
		this.duration = duration;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPacketName() {
		return packetName;
	}
	public void setPacketName(String packetName) {
		this.packetName = packetName;
	}
	public String getInsId() {
		return insId;
	}
	public void setInsId(String insId) {
		this.insId = insId;
	}
	
	
}
