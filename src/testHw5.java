
public class testHw5 {

	public static void main(String[] args) {
		System.out.println("testing StepTracker");
		StepTracker tr = new StepTracker(10000);
		System.out.println(tr.activeDays());
		System.out.println(tr.averageSteps());
		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		System.out.println(tr.activeDays());
		System.out.println(tr.averageSteps());
		tr.addDailySteps(13000);
		System.out.println(tr.activeDays());
		System.out.println(tr.averageSteps());
		tr.addDailySteps(23000);
		tr.addDailySteps(1111);
		System.out.println(tr.activeDays());
		System.out.println(tr.averageSteps());
		
		
		System.out.println();
		System.out.println("testing Package");
		
		
		Package[] packages1 = {new Package("Monmouth", "Appleby", 144), 

		        new Package("Larkinge", "Ballachulish", 65), 

		        new Package("Malrton", "Auchtermuchty", 872), 

		        new Package("Monmouth", "Anghor Thom", 937)};

		int[] costSchedule1 = {10, 16, 37, 49};

		System.out.println(Package.shippingCost(packages1, costSchedule1));
		
		System.out.println();
		System.out.println("testing Time");
		
		Time time1 = new Time();
		Time time2 = new Time(3, 20, 31);
		time1.add(5493);
		time2.add(1239);
		time1.getTime();
		time2.getTime();
		
		System.out.println();
		System.out.println("testing Horse and HorseBarn");
		
		HorseBarn barn1 = new HorseBarn();
		barn1.add(new Horse("A", 140));
		barn1.add(new Horse("B", 120));
		barn1.add(new Horse("C", 200));
		System.out.println(barn1.findHorseSpace("B"));
		barn1.getSpaces();
		barn1.remove(new Horse("B", 120));
		barn1.consolidate();
		barn1.getSpaces();
	}

}
