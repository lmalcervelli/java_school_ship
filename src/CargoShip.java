//CargoShip.java
//Laura Malcervelli
//5/20/22
public class CargoShip extends Ship {
	final static int LBCAPACITYPERCUSTOMER = 3000;
	final static double OVERLIMITPERCENTAGE = 0.065;
	private int tonnage;
	
	public CargoShip(String shipName, int yearBuilt, String customerName, double cost,int tonnage)
	{
		super(shipName, yearBuilt, customerName, cost);
		this.tonnage = tonnage;
		
		if (tonnage > LBCAPACITYPERCUSTOMER)
		{
			int lbOverage = tonnage - LBCAPACITYPERCUSTOMER;
			double cargoCost = getCost();
			cargoCost += lbOverage * OVERLIMITPERCENTAGE;
			setCost(cargoCost);
		}
		
	}
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public static int getLbcapacitypercustomer() {
		return LBCAPACITYPERCUSTOMER;
	}
	public static double getOverlimitpercentage() {
		return OVERLIMITPERCENTAGE;
	}
	
	@Override
	public void displayTransactionInfo()
	{
		super.displayTransactionInfo();
		System.out.printf("Tonnage              : %,d pounds\n", tonnage);
		
		if (tonnage > LBCAPACITYPERCUSTOMER)
		{
			System.out.printf("Total Cost           : $%,.2f\n", getCost());
			System.out.printf("OVER LIMIT SURCHAGE APPLIED\n\n");
		}
		else
		{
			System.out.printf("Total Cost           : $%,.2f\n\n", getCost());
		}
	}
}
