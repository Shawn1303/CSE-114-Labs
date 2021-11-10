
public class RecipeBook {
	private String bookName;
	private CookingRecipe[] list2;
	
	public RecipeBook() {}
	public RecipeBook(String bookName) {
		this.bookName = bookName;
	}

	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
		for(int i = 0; i<list2.length; i++) {
			if (((CookingRecipe) list2[i]).getName() == name && ((CookingRecipe) list2[i]).getList() == ingredients) {
				return null;
			}
		}
		CookingRecipe[] temp = new CookingRecipe[list2.length + 1];
		for(int i = 0; i<list2.length; i++) {
			temp[i] = list2[i];
		}
		temp[list2.length] = new CookingRecipe(name, ingredients);
		CookingRecipe r = temp[list2.length];
		list2 = temp;
		return r;
	}
	
	public CookingRecipe removeRecipe(String name) {
		boolean remove = false;
		CookingRecipe r = null;
		for(int i = 0; i<list2.length; i++) {
			if (list2[i].getName() == name) {
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
		for(int i = 0; i<list2.length; i++) {
			if(list2[i].getList() == ingredients) {
				CookingRecipe[] temp = new CookingRecipe[list3.length + 1];
				for(int j = 0; j<list3.length; j++) {
					temp[j] = list3[j];
				}
				temp[list3.length] = list2[i];
				list3 = temp;
			}
		}
		if(list3.length == 0) { return null;}
		else { return list3;}
	}
	
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
		CookingRecipe[] list3 = new CookingRecipe[0];
		for(int i = 0; i<list2.length; i++) {
			if(list2[i].getList().length == numberOfIngredients) {
				CookingRecipe[] temp = new CookingRecipe[list3.length + 1];
				for(int j = 0; j<list3.length; j++) {
					temp[j] = list3[j];
				}
				temp[list3.length] = list2[i];
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
		for(int i = 0; i<list2.length; i++) {
			if(list2[i].calculateCalories() == min) {
				CookingRecipe[] temp = new CookingRecipe[list4.length + 1];
				for(int j = 0; j<list4.length; j++) {
					temp[j] = list4[j];
				}
				temp[list4.length] = list2[i];
				list4 = temp;
			}
		}
		if(list4.length == 0) { return null;}
		else { return list4;}
			}
	
	public String getName() {
		return this.bookName;
	}
}
