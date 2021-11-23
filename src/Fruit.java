public class Fruit extends Food{
    String season;
    public Fruit(String description, int cps, String season) {
        super(description, cps);
        this.season = season;
    }

    public String getSeason() { return season;}
    public void setSeason(String season) {this.season = season;}

    public int totalCalories(int serving) {
        return serving * super.getCaloriesPerServing();
    }
}
