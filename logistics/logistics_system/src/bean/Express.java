package bean;

public class Express {
	private int id;
	private int status;
	private String sendman;
	private String receiveName;
	private String receivePhone;
	private String receiveAddress;
	private String estimate;
	private int rid;
	private int station;
	
	
	public Express(int status, String sendman, String receiveName,
			String receivePhone, String receiveAddress){
		this.status = status;
		this.sendman = sendman;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.receiveAddress = receiveAddress;
	}
	
	public Express(int status, String sendman, String receiveName,
			String receivePhone, String receiveAddress,int rid){
		this.status = status;
		this.sendman = sendman;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.receiveAddress = receiveAddress;
		this.rid=rid;
	}
	
	
	
	public Express(int id, int status, String sendman, String receiveName,
			String receivePhone, String receiveAddress,String estimate) {
		super();
		this.id = id;
		this.status = status;
		this.sendman = sendman;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.receiveAddress = receiveAddress;
		this.estimate = estimate;
	}

	public Express(int id, int status, String sendman, String receiveName,
			String receivePhone, String receiveAddress, String estimate,int rid) {
		this.id = id;
		this.status = status;
		this.sendman = sendman;
		this.receiveName = receiveName;
		this.receivePhone = receivePhone;
		this.receiveAddress = receiveAddress;
		this.estimate = estimate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSendman() {
		return sendman;
	}

	public void setSendman(String sendman) {
		this.sendman = sendman;
	}

	public String getReceiveName() {
		return receiveName;
	}

	public void setReceiveName(String receiveName) {
		this.receiveName = receiveName;
	}

	public String getReceivePhone() {
		return receivePhone;
	}

	public void setReceivePhone(String receivePhone) {
		this.receivePhone = receivePhone;
	}

	public String getReceiveAddress() {
		return receiveAddress;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public String getEstimate() {
		return estimate;
	}

	public void setEstimate(String estimate) {
		this.estimate = estimate;
	}
	
	

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getStation() {
		return station;
	}

	public void setStation(int station) {
		this.station = station;
	}

	/*快递物流信息*/
	public void expressLogistics(){
		
	}
}
