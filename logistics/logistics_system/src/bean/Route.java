package bean;

public class Route {
	private int rtid;
	private String firstStation;
	private String secondStation;
	private String thirdStation;
	private String fourthStation;
	private String endStation;
	
	
	
	public Route(int rtid, String firstStation) {
		super();
		this.rtid = rtid;
		this.firstStation = firstStation;
	}
	
	public Route(int rtid, String firstStation, String secondStation) {
		super();
		this.rtid = rtid;
		this.firstStation = firstStation;
		this.secondStation = secondStation;
	}

	public Route(int rtid, String firstStation, String secondStation,
			String thirdStation) {
		super();
		this.rtid = rtid;
		this.firstStation = firstStation;
		this.secondStation = secondStation;
		this.thirdStation = thirdStation;
	}

	public Route(int rtid, String firstStation, String secondStation,
			String thirdStation, String fourthStation) {
		super();
		this.rtid = rtid;
		this.firstStation = firstStation;
		this.secondStation = secondStation;
		this.thirdStation = thirdStation;
		this.fourthStation = fourthStation;
	}

	public Route(int rtid, String firstStation, String secondStation,
			String thirdStation, String fourthStation, String endStation) {
		super();
		this.rtid = rtid;
		this.firstStation = firstStation;
		this.secondStation = secondStation;
		this.thirdStation = thirdStation;
		this.fourthStation = fourthStation;
		this.endStation = endStation;
	}
	
	public int getRtid() {
		return rtid;
	}
	public void setRtid(int rtid) {
		this.rtid = rtid;
	}
	public String getFirstStation() {
		return firstStation;
	}
	public void setFirstStation(String firstStation) {
		this.firstStation = firstStation;
	}
	public String getSecondStation() {
		return secondStation;
	}
	public void setSecondStation(String secondStation) {
		this.secondStation = secondStation;
	}
	public String getThirdStation() {
		return thirdStation;
	}
	public void setThirdStation(String thirdStation) {
		this.thirdStation = thirdStation;
	}
	public String getFourthStation() {
		return fourthStation;
	}
	public void setFourthStation(String fourthStation) {
		this.fourthStation = fourthStation;
	}
	public String getEndStation() {
		return endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	
}
