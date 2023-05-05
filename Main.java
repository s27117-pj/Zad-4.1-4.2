interface Purchase {
    String getPurchaseInfo();
}
//zad 4.2 niedokonczone
class Car {
    int speed;
    double regularPrice;
    String color;

    double getSalePrice() {
        return regularPrice;
    }
}

class Sedan extends Car {
    int length;

    @Override
    double getSalePrice() {
        if (length > 20) {
            return regularPrice * 0.95;
        } else {
            return regularPrice * 0.9;
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN:";
    }
}

class Ford extends Car implements Purchase {
    int year;
    int manufacturerDiscount;

    @Override
    double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD:";
    }
}

class Truck extends Car implements Purchase {
    int weight;

    @Override
    double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9;
        } else {
            return regularPrice;
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "TRUCK:";
    }
}