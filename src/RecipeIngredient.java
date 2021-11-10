
public class RecipeIngredient extends Ingredient{
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public float getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	public boolean equals(RecipeIngredient b) {
		return super.equals(b) && this.quantity == b.getQuantity();
	}

	public String toString() {
		return "RecipeIngredient quantity= " + quantity +
				"\n" + super.toString();
	}
}
