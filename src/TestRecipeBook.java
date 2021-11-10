
public class TestRecipeBook {

	public static void main(String[] args) {
		Ingredient egg = new Ingredient("egg", "cup", 78);
		RecipeIngredient egg12 = new RecipeIngredient("egg", "cup", 78, 12);
		Ingredient ham = new Ingredient("ham", "oz", 120);
		CookingRecipe friedEgg = new CookingRecipe("friedEgg");
		friedEgg.addOrUpdateRecipeIngredient(egg, 12);
		System.out.println(friedEgg.getRecipeIngredient(new Ingredient("egg", "cup", 78)));
		System.out.println();
		System.out.println(friedEgg.getRecipeIngredient(new Ingredient("ham", "oz", 120)));
		System.out.println();
		System.out.println(friedEgg.getRecipeIngredient("egg"));
		System.out.println();
		System.out.println(friedEgg.getRecipeIngredient("ham"));
		System.out.println();
		System.out.println(friedEgg.removeRecipeIngredient(new Ingredient("egg", "cup", 78)));
		System.out.println();
		friedEgg.addOrUpdateRecipeIngredient(egg, 12);
		System.out.println();
		System.out.println(friedEgg.removeRecipeIngredient(new Ingredient("ham", "oz", 120)));
		System.out.println();
		System.out.println(friedEgg.removeRecipeIngredient("egg"));
		System.out.println();
		friedEgg.addOrUpdateRecipeIngredient(egg, 2);
		System.out.println();
		System.out.println(friedEgg.removeRecipeIngredient("ham"));
		System.out.println();
		friedEgg.addOrUpdateRecipeIngredient(ham, 3);
		System.out.println();
		System.out.println(friedEgg.calculateCalories());
		System.out.println();
		System.out.println(friedEgg.getNumberOfIngredients());
		System.out.println();
		System.out.println(friedEgg.toString());
		System.out.println();
		RecipeBook s = new RecipeBook("Cooking");
		System.out.println(s.addRecipe("friedEgg", friedEgg.getList()));
		System.out.println();
		System.out.println(s.removeRecipe("friedEgg"));
		System.out.println();
		System.out.println(s.removeRecipe("fried"));
		System.out.println();
		System.out.println(s.addRecipe("friedEgg", friedEgg.getList()));
		System.out.println();
		System.out.println(s.findRecipes(friedEgg.getList()));
		System.out.println();
		System.out.println(s.findRecipesWithFewIngredients(6));
		System.out.println();
		System.out.println(s.findRecipesLowCalories());

	}

}
