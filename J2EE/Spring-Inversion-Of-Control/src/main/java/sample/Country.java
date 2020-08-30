package sample;

public class Country {
	private String cname;

	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
