package itschool;

public class Cylinder extends Circle {
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        // TODO add check
        this.height = height;
    }

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }

    @Override
    public double getSquare() {
        return super.getSquare()*2 + super.getPerimeter()*getHeight();
    }

    public double getVolume() {
        return super.getSquare() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius = " + getRadius()
                + ", height=" + height + ", square = " + this.getSquare()
                + ", volume = " + getVolume() + '}';
    }
}
