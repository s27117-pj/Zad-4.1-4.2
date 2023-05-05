public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.speed = 160;
        sedan.regularPrice = 20000.0;
        sedan.color = "red";
        sedan.length = 10;
        System.out.println(sedan.getPurchaseInfo() + " " + sedan.getSalePrice());
//zad 4.2
        Ford ford1 = new Ford();
        ford1.speed = 156;
        ford1.regularPrice = 4452.0;
        ford1.color = "black";
        ford1.year = 2005;
        ford1.manufacturerDiscount = 10;
        System.out.println(ford1.getPurchaseInfo() + " " + ford1.getSalePrice());

        Ford ford2 = new Ford();
        ford2.speed = 155;
        ford2.regularPrice = 5000.0;
        ford2.color = "pink";
        ford2.year = 1998;
        ford2.manufacturerDiscount = 5;
        System.out.println(ford2.getPurchaseInfo() + " " + ford2.getSalePrice());

        Truck truck = new Truck();
        truck.speed = 200;
        truck.regularPrice = 500000.0;
        truck.color = "gold";
        truck.weight = 5000;
        System.out.println(truck.getPurchaseInfo() + " " + truck.getSalePrice());
    }
}