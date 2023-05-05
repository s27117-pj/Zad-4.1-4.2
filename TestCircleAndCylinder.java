class TestCircleAndCylinder {
    //zad 4.1
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        Cylinder cyl1 = new Cylinder();
        System.out.println("The cylinder has radius of " + cyl1.getRadius() + ", height of " + cyl1.getHeight() + " and volume of " + cyl1.getVolume());

        Cylinder cyl2 = new Cylinder(2.0);
        System.out.println("The cylinder has radius of " + cyl2.getRadius() + ", height of " + cyl2.getHeight() + " and volume of " + cyl2.getVolume());

        Cylinder cyl3 = new Cylinder(2.0, 3.0);
        System.out.println("The cylinder has radius of " + cyl3.getRadius() + ", height of " + cyl3.getHeight() + " and volume of " + cyl3.getVolume());
    }
}