package model;

public class Employee {
	private int id;
	private String name;
	private Address adrAddress;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adrAddress=" + adrAddress + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdrAddress() {
		return adrAddress;
	}
	public void setAdrAddress(Address adrAddress) {
		this.adrAddress = adrAddress;
	}
	
}
