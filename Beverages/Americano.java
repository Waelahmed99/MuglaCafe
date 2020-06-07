package MuglaCaffe.Beverages;

public class Americano extends CaffeineBeverage {
    public int cost() {
        return 7 + this.size + (hasMilk ? 1 : 0);
    }

    public Americano() {
        this.hasMilk = true;
        this.size = Beverage.LARGE;
        this.name = "Americano";
    }

    public Americano(boolean hasMilk, int size) {
        this.hasMilk = hasMilk;
        this.size = size;
        this.name = "Americano";
    }
}