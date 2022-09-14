//CruiseShip.java
//Laura Malcervelli
//5/20/22
public class CruiseShip extends Ship {
	final static int VOUCHERVALUE = 150;
	private int numPassengers;
	private char voucher;
	
	public CruiseShip(String shipName, int yearBuilt, String customerName, double cost, int numPassengers, char voucher)
	{
		super(shipName,yearBuilt,customerName,cost);
		this.numPassengers = numPassengers;
		this.voucher = voucher;
		
		if (numPassengers > 1)
		{
			double individualCost = getCost();
			setCost(numPassengers * individualCost);
		}
		
		if (voucher == 'Y' || voucher == 'y')
		{
			double preVoucherCost = getCost();
			double costWithVouture = preVoucherCost - VOUCHERVALUE;
			setCost(costWithVouture);
		}
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public char getVoucher() {
		return voucher;
	}

	public void setVoucher(char voucher) {
		this.voucher = voucher;
	}

	public static int getVouchervalue() {
		return VOUCHERVALUE;
	}
	@Override
	public void displayTransactionInfo()
	{
		super.displayTransactionInfo();
		System.out.printf("Number of Passengers : %d\n", numPassengers);	
		
		if (voucher == 'Y' || voucher == 'y')
		{
			System.out.printf("Total Cost           : $%,.2f\n", getCost());
			System.out.printf("VOUCHER APPLIED\n\n");
		}
		else
		{
			System.out.printf("Total Cost           : $%,.2f\n\n", getCost());
		}
	}
}
