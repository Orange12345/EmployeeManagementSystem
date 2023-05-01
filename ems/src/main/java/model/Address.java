/**
 * 
 */
package model;

/**
 * @author Admin
 *
 */
public class Address {
	private String streetName;
	private int areaCode;
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", areaCode=" + areaCode + "]";
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}
	
}
