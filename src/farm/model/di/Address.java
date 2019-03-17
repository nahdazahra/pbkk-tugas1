package farm.model.di;

public class Address {
	String village;
	String city;
	int homeNo;
	
	public Address() {
		
	}
	
	public Address(String village, String city, int homeNo) {
		this.village = village;
		this.city = city;
		this.homeNo = homeNo;
		
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getHomeNo() {
		return homeNo;
	}

	public void setHomeNo(int homeNo) {
		this.homeNo = homeNo;
	}

	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + ", homeNo=" + homeNo + "]";
	}
	
}
