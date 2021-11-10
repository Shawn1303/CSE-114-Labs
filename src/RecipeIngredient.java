
public class RecipeIngredient extends Ingredient{
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
		super(name, name, caloriesPerUnit);
		this.quantity = quantity;
	}
	
	public float getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(float num) {
		this.quantity = num;
	}
	
	public boolean equals(RecipeIngredient b) {
		return this.quantity == b.getQuantity();
	}
	
	public String toString() {
		return "RecipeIngredient quantity= " + quantity +
				"\n" + super.toString();
	}
}
