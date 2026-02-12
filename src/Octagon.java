public class Octagon extends GeometricObject1 {

    private double side;

    public Octagon() { }
    public Octagon (double side){
        this.side = side;
    }
    public Octagon(double side, String color, boolean filled) {
    this.side = side;
    setColor(color);
    setFilled(filled);
    }
    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * this.side * this.side;
    }

    public double getSide() {
    return this.side;
    }
    /** Set a new perimeter */
    public void setSide(double side) {
        this.side = side;
    }
}
