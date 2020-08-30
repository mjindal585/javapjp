package bean;

import java.util.List;

public class Country {
private List<String> countryId;
private List<String> countryName;
public Country() {
	super();
	// TODO Auto-generated constructor stub
}
public Country(List<String> countryId, List<String> countryName) {
	super();
	this.countryId = countryId;
	this.countryName = countryName;
}
public List<String> getCountryId() {
	return countryId;
}
public void setCountryId(List<String> countryId) {
	this.countryId = countryId;
}
public List<String> getCountryName() {
	return countryName;
}
public void setCountryName(List<String> countryName) {
	this.countryName = countryName;
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryName=" + countryName + "]";
}

}
