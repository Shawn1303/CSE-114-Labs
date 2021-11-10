
public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMeasuringUnit() {
		return this.measuringUnit;
	}
	
	public int getCaloriesPerUnit() {
		return this.caloriesPerUnit;
	}
	
	public boolean equals(Ingredient a) {
		if(this.name == a.getName() && this.measuringUnit == a.getMeasuringUnit() && this.caloriesPerUnit == a.getCaloriesPerUnit()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "Ingredient\n"+ 
				"name=" + name + "\n" + 
				"measuringUnit=" + measuringUnit + "\n" + 
				"caloriesPerUnit=" + caloriesPerUnit;
	}

}


