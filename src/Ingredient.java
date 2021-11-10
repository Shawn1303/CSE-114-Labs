
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

	public void setName(String name) { this.name = name;}

	public void setMeasuringUnit(String measuringUnit) { this.measuringUnit = measuringUnit;}

	public void setCaloriesPerUnit(int caloriesPerUnit) { this.caloriesPerUnit = caloriesPerUnit;}
	
	public boolean equals(Ingredient a) {
		return this.name.equals(a.getName()) && this.measuringUnit.equals(a.getMeasuringUnit()) && this.caloriesPerUnit == a.getCaloriesPerUnit();
	}
	
	public String toString() {
		return "Ingredient\n"+ 
				"name=" + name + "\n" + 
				"measuringUnit=" + measuringUnit + "\n" + 
				"caloriesPerUnit=" + caloriesPerUnit;
	}

}


