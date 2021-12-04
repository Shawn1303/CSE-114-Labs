public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color a square of side length " + side + " from one side to the other side");
    }

    public double getArea() {return side*side;}

    public double getPerimeter() {return side*4;}

    public static void main(String[] args) {
        GeometricObject[] test = new GeometricObject[5];
        test[0] = new Square(2);
        test[1] = new Square(3);
        test[2] = new Square(4);
        test[3] = new Square(5);
        test[4] = new CreateTriangle();
        for(GeometricObject g: test) {
            if(g instanceof Colorable){
                ((Colorable) g).howToColor();
            }
        }
    }
}
