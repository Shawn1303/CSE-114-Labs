
public class Package {
	private String sender;
	private String recipient;
	private int cost = 0;
	private int distance;

	public Package(String sender, String recipient, int distance) {
		this.sender = sender;
		this.recipient = recipient;
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public static int shippingCost(Package[] packages, int[] costSchedule) {
		int totalCost = 0;
		for(int i = 0; i < packages.length; i++) {
			int distance = packages[i].getDistance();
			if(distance < 100) {
				totalCost += costSchedule[0];
				packages[i].setCost(costSchedule[0]);
			}
			else if(distance >= 100 && distance < 300) {
				totalCost += costSchedule[1];
				packages[i].setCost(costSchedule[1]);
			}
			else if(distance >= 300 && distance < 500) {
				totalCost += costSchedule[2];
				packages[i].setCost(costSchedule[2]);
			}
			else {
				totalCost += costSchedule[3];
				packages[i].setCost(costSchedule[3]);
			}
		}
		return totalCost;
	}
}
