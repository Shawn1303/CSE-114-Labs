
public class MotorizedVehicle extends Vehicle{
    private double vDisplacement;

    public MotorizedVehicle(String name, int wheels, double vDisplacement) {
        super(name, wheels);
        this.vDisplacement = vDisplacement;
    }

    public double horsePower() {
        return vDisplacement*super.getWheels();
    }

    public String toString() {
        return super.toString() +
                "\n Volume displacement: " + vDisplacement;
    }
}
