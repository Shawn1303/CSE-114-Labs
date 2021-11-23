public class Client {
    public static void main(String[] args) {
        Bicycle a = new Bicycle("bike1", 2);
        MotorizedVehicle b = new MotorizedVehicle("moto", 2, 30);
        System.out.println("Bike: "+ a);
        System.out.println("Motor: " + b + " Horsepower: " + b.horsePower());

        LiquidFood c = new LiquidFood("soda", 200, 20);
        Fruit d = new Fruit("peach", 50, "Summer");
        System.out.println("Drink: "+ c + "calories: " + c.totalCalories(1));
        System.out.println("Fruit: "+ d + "calories: " + d.totalCalories(2));
    }
}
