package paintWizard;

public class Paint {

	String colour;
	int coverage;
	int size;
	double price;

	public Paint(String colour, int size, double price, int coverage) {
		this.colour = colour;
		this.size = size;
		this.price = price;
		this.coverage = coverage;

	}

	public static void getPrice(Paint pnt, int roomSize) {

		String paintName = pnt.getClass().getSimpleName();
		int requiredPaint = roomSize / pnt.coverage;
		int requiredTins = requiredPaint / pnt.size;
		double cost = requiredTins * pnt.price;
		cost = cost * 100;
		cost = Math.round(cost);
		cost = cost / 100;
		int wastedPaint = requiredPaint % pnt.size;

		System.out.println("The cost of painting a " + roomSize + " m² room with " + paintName + " is £" + cost + ".");
		if (requiredTins == 1) {
			System.out.println("This will require " + requiredTins + " tin of paint, wasting " + wastedPaint
					+ " litres of paint.");
		} else {
			System.out.println("This will require " + requiredTins + " tins of paint, wasting " + wastedPaint
					+ " litres of paint.");
			System.out.println();
		}
	}
}
