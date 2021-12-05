
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
		for (RecipeIngredient recipeIngredient : list) {
			if (recipeIngredient.equals(ingredient)) {
				recipeIngredient.setQuantity(recipeIngredient.getQuantity() + 1);
				add = false;
			}
		}
		if(add) {
			RecipeIngredient[] temp = new RecipeIngredient[list.length + 1];
			System.arraycopy(list, 0, temp, 0, list.length);
			temp[list.length] = new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity);
			list = temp;
		}
	}

	public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
		for (RecipeIngredient recipeIngredient : list) {
			if (recipeIngredient.equals(ingredient)) {
				return recipeIngredient;
			}
		}
		return null;
	}


	public RecipeIngredient getRecipeIngredient(String ingredientName) {
		for (RecipeIngredient recipeIngredient : list) {
			if (recipeIngredient.getName().equals(ingredientName)) {
				return recipeIngredient;
			}
		}
		return null;
	}

	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
		boolean remove = false;
		RecipeIngredient r = null;
		for(int i = 0; i<list.length; i++) {
			if (list[i].equals(ingredient)) {
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
			if (list[i].getName().equals(ingredientName)) {
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
		for (RecipeIngredient recipeIngredient : list) {
			sum += recipeIngredient.getCaloriesPerUnit()*recipeIngredient.getQuantity();
		}
		return sum;
	}

	public int getNumberOfIngredients() {
		int num = 0;
		for(RecipeIngredient r: list) {
			num += r.getQuantity();
		}
		return num;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {this.name = name;}

	public String toString() {
		StringBuilder a = new StringBuilder("Cooking Recipe name is " + name);
		for(RecipeIngredient ingredient: list) {
			a.append("\n").append(ingredient.toString());
		}
		return a.toString();
	}
	
	public RecipeIngredient[] getList() {
		return this.list;
	}
	
	public boolean equals(RecipeIngredient[] list) {
		if (this.list.length == list.length) {
			int same = 0;
			for(RecipeIngredient ingredientX: this.list) {
				for(RecipeIngredient ingredientY: list) {
					if(ingredientX.equals(ingredientY)) { same++;}
				}
			}
			return same == this.list.length;
		}
		return false;
	}
}

