package MuglaCaffe.Beverages;

public class Latte extends CaffeineBeverage {
    public int cost() {
        return 5 + this.size + (hasMilk ? 1 : 0);
    }

    public Latte(boolean hasMilk, int size) {
        this.hasMilk = hasMilk;
        this.size = size;
        this.name = "Latte";
    }
}