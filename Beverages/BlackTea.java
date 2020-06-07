package MuglaCaffe.Beverages;

public class BlackTea extends TeaBeverage {
    public int cost() {
        return 3 + this.size + (hasLemon ? 1 : 0);
    }

    public BlackTea(boolean hasLemon, int size) {
        this.hasLemon = hasLemon;
        this.size = size;
        this.name = "Black Tea";
    }
}
