package paintWizard;

public class Main {
	
	static CheapoMax cm = new CheapoMax("Red", 20, 19.99, 10);
	static AverageJoes aj = new AverageJoes("Red", 15, 17.99, 11);
	static DuluxourousPaints dp = new DuluxourousPaints("Red", 10, 25.00, 20);
	static int roomSize = 2347;
	

	public static void main(String[] args) {
		
		Paint.getPrice(cm, roomSize);
		Paint.getPrice(aj, roomSize);
		Paint.getPrice(dp, roomSize);

	}

}
