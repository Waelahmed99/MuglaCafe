package MuglaCaffe.Beverages;

public class Cappucino extends CaffeineBeverage {
    public int cost() {
        return 6 + this.size + (hasMilk ? 1 : 0);
    }

    public Cappucino(boolean hasMilk, int size) {
        this.hasMilk = hasMilk;
        this.size = size;
        this.name = "Cappucino";
    }
}