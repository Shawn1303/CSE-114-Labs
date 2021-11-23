public class LiquidFood extends Food{
    private int viscosity;

    public LiquidFood(String description, int cps, int viscosity) {
        super(description, cps);
        this.viscosity = viscosity;
    }

    public int getViscosity() { return viscosity;}
    public void setViscosity(int viscosity) { this.viscosity = viscosity;}

    public int totalCalories(int servings) {
        return servings * super.getCaloriesPerServing();
    }

    public String toString() {
        return super.toString() + "\n Viscosity: " + viscosity;
    }
}
