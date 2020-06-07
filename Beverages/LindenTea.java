package MuglaCaffe.Beverages;

public class LindenTea extends TeaBeverage {
    public int cost() {
        return 5 + this.size + (hasLemon ? 1 : 0);
    }

    public LindenTea(boolean hasLemon, int size) {
        this.hasLemon = hasLemon;
        this.size = size;
        this.name = "Linden Tea";
    }
}