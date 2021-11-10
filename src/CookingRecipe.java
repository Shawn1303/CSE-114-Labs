
public class CookingRecipe {
	private String name;
	private RecipeIngredient[] list;

		
	public CookingRecipe(String name) {
		this.name = name;
		this.list = new RecipeIngredient[0];
	}
	
	public CookingRecipe(String name, RecipeIngredient[] list) {
		this.name = name;
		this.list = list;
	}
	

	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
		boolean add = true;
		for(int i = 0; i<list.length; i++) {
			if (((Ingredient) list[i]).equals(ingredient)) {
				list[i].setQuantity(list[i].getQuantity() + 1);
				add = false;
			}
		}
		if(add) {
			RecipeIngredient[] temp = new RecipeIngredient[list.length + 1];
			for(int i = 0; i<list.length; i++) {
				temp[i] = list[i];
			}
			temp[list.length] = (RecipeIngredient)ingredient;
			temp[list.length].setQuantity(1);
			list = temp;
		}
	}

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for(int i = 0; i<list.length; i++) {
			if (((Ingredient) list[i]).equals(ingredient)) {
				return list[i];
			}
		}
		return null;
	}


	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for(int i = 0; i<list.length; i++) {
			if (list[i].getName() == ingredientName) {
				return list[i];
			}
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		boolean remove = false;
		RecipeIngredient r = null;
		for(int i = 0; i<list.length; i++) {
			if (((Ingredient) list[i]).equals(ingredient)) {
				r = list[i];
				list[i] = null;
				remove = true;
			}
		}
		if(remove) {
			RecipeIngredient[] temp = new RecipeIngredient[list.length - 1];
			int s = 0;
			for(int i = 0; i<temp.length; i++) {
				if(list[i] == null) {
					s++;
				}
				temp[i] = list[i+s];
			}
			list = temp;
			return r;
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(String ingredientName) {
		boolean remove = false;
		RecipeIngredient r = null;
		for(int i = 0; i<list.length; i++) {
			if (list[i].getName() == ingredientName) {
				r = list[i];
				list[i] = null;
				remove = true;
			}
		}
		if(remove) {
			RecipeIngredient[] temp = new RecipeIngredient[list.length - 1];
			int s = 0;
			for(int i = 0; i<temp.length; i++) {
				if(list[i] == null) {
					s++;
				}
				temp[i] = list[i+s];
			}
			list = temp;
			return r;
		}
		return null;
	}

	public float calculateCalories() {
		int sum = 0;
		for(int i = 0; i<list.length; i++) {
			sum += list[i].getCaloriesPerUnit();
		}
		return sum;
	}

	public int getNumberOfIngredients() {
		return this.list.length;
	}
	
	public String getName() {
		return this.name;
	}

	public String toString() {
		String a = "Cooking Recipe name is " + name;
		for(RecipeIngredient ingredient: list) {
			a += "\n" + ingredient.toString();
		}
		return a;
	}
	
	public RecipeIngredient[] getList() {
		return this.list;
	}
	
	public boolean equals(CookingRecipe c) {
		if(this.toString() == c.toString()) {
			return true;
		} else {
			return false;
		}
	}
}

