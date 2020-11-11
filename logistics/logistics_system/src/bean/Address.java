package bean;

public class Address {
	private String province;
	private String city;
	private String district;
	private String road;
	private String details;
	
	public Address(String province, String city, String district, String road,
			String details) {
		super();
		this.province = province;
		this.city = city;
		this.district = district;
		this.road = road;
		this.details = details;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
