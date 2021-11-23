public abstract class Food {
    private String description;
    private int cps;

    public Food(String description, int cps) {
        this.description = description;
        this.cps = cps;
    }

    public String getDescription() {return description;}
    public int getCaloriesPerServing() {return cps;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCps(int cps) {
        this.cps = cps;
    }

    public abstract int totalCalories(int serving);

    public String toString() {
        return "Description: " + description +
                "\n Calories per serving: " + cps;
    }
}
