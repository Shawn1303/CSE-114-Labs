
public class RecipeBook {
	private String bookName;
	private CookingRecipe[] list2;
	
	public RecipeBook() {}
	public RecipeBook(String bookName) {
		this.bookName = bookName;
		this.list2 = new CookingRecipe[0];
	}

	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for (CookingRecipe cookingRecipe : list2) {
			if (cookingRecipe.getName().equals(name)) {
				return null;
			}
		}
		CookingRecipe[] temp = new CookingRecipe[list2.length + 1];
		System.arraycopy(list2, 0, temp, 0, list2.length);
		temp[list2.length] = new CookingRecipe(name, ingredients);
		CookingRecipe r = temp[list2.length];
		list2 = temp;
		return r;
	}
	
	public CookingRecipe removeRecipe(String name) {
		boolean remove = false;
		CookingRecipe r = null;
		for(int i = 0; i<list2.length; i++) {
			if (list2[i].getName().equals(name)) {
				r = list2[i];
				list2[i] = null;
				remove = true;
			}
		}
		if(remove) {
			CookingRecipe[] temp = new CookingRecipe[list2.length - 1];
			int s = 0;
			for(int i = 0; i<temp.length; i++) {
				if(list2[i] == null) {
					s++;
				}
				temp[i] = list2[i+s];
			}
			list2 = temp;
			return r;
		}
		return null;
	}
	
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
		CookingRecipe[] list3 = new CookingRecipe[0];
		for (CookingRecipe cookingRecipe : list2) {
			if (cookingRecipe.equals(ingredients)) {
				CookingRecipe[] temp = new CookingRecipe[list3.length + 1];
				System.arraycopy(list3, 0, temp, 0, list3.length);
				temp[list3.length] = cookingRecipe;
				list3 = temp;
			}
		}
		if(list3.length == 0) { return null;}
		else { return list3;}
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		CookingRecipe[] list3 = new CookingRecipe[0];
		for (CookingRecipe cookingRecipe : list2) {
			if (cookingRecipe.getNumberOfIngredients() <= numberOfIngredients) {
				CookingRecipe[] temp = new CookingRecipe[list3.length + 1];
				System.arraycopy(list3, 0, temp, 0, list3.length);
				temp[list3.length] = cookingRecipe;
				list3 = temp;
			}
		}
		if(list3.length == 0) { return null;}
		else { return list3;}
	}
	
	public CookingRecipe[] findRecipesLowCalories() {
		float min = list2[0].calculateCalories();
		for(int i = 0; i<list2.length - 1; i++) {
			if(list2[i].calculateCalories() > list2[i+1].calculateCalories()) {
				min = list2[i+1].calculateCalories();
			}
		}
		CookingRecipe[] list4 = new CookingRecipe[0];
		for (CookingRecipe cookingRecipe : list2) {
			if (cookingRecipe.calculateCalories() == min) {
				CookingRecipe[] temp = new CookingRecipe[list4.length + 1];
				System.arraycopy(list4, 0, temp, 0, list4.length);
				temp[list4.length] = cookingRecipe;
				list4 = temp;
			}
		}
		if(list4.length == 0) { return null;}
		else { return list4;}
			}
	
	public String getName() {
		return this.bookName;
	}

	public CookingRecipe[] getList() {return list2;}


	public String toString() {
		StringBuilder a = new StringBuilder("Cooking Recipe name is " + bookName);
		for(CookingRecipe cookingrecipe: list2) {
			a.append("\n").append(cookingrecipe.toString());
		}
		return a.toString();
	}

}
