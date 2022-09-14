//TestShip.java
//Laura Malcervelli
//5/20/22
public class TestShip {

	public static void main(String[] args) {
		CruiseShip cruiseOne = new CruiseShip("SevenSeas", 2017, "Delores James", 599.99, 3, 'y');
		CruiseShip cruiseTwo = new CruiseShip("Dreams of the Sea", 2021, "George Preston", 999.99, 1, 'Y');
		CruiseShip cruiseThree = new CruiseShip("Belle of the Pacific", 2020, "Phoebe Diaz", 499.99, 1, 'N');
		
		CargoShip cargoOne = new CargoShip("Evergreen Shipping", 2020, "Plastics Inc", 1250.00, 2500);
		CargoShip cargoTwo = new CargoShip("Golden Seas Shipping", 2020, "Paper Essentials", 2000.00, 4000);
		
		cruiseOne.displayTransactionInfo();
		cruiseTwo.displayTransactionInfo();
		cruiseThree.displayTransactionInfo();
		cargoOne.displayTransactionInfo();
		cargoTwo.displayTransactionInfo();
	}

}
