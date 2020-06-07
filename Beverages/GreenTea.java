package MuglaCaffe.Beverages;

public class GreenTea extends TeaBeverage {
    public int cost() {
        return 4 + this.size + (hasLemon ? 1 : 0);
    }

    public GreenTea(boolean hasLemon, int size) {
        this.hasLemon = hasLemon;
        this.size = size;
        this.name = "Green Tea";
    }
}