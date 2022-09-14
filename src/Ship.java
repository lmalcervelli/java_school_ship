//Ship.java
//Laura Malcervelli
//5/20/22
public class Ship {
	private String shipName;
	private int yearBuilt;
	private String customerName;
	private double cost;
	
	public Ship(String shipName, int yearBuilt, String customerName, double cost)
	{
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
		this.customerName = customerName;
		this.cost = cost;
	}
	
	public void displayTransactionInfo()
	{
		System.out.printf("Ship Name            : %s\n", shipName);
		System.out.printf("Year Built           : %d\n", yearBuilt);
		System.out.printf("Customer Name        : %s\n", customerName);
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
