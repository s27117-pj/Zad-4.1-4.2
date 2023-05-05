class Cylinder extends Circle {
    private double height;
    //zad 4.1

    public Cylinder() {
        super();
        this.height = 4.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 4.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public String toString() {
        return "Cylinder with radius: " + super.getRadius() + ", height: " + this.height + ", color: " + super.toString();
    }
}