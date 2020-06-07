package MuglaCaffe.Beverages;

public abstract class Beverage {
    public int size;
    public String name;
    public static int SMALL = 0;
    public static int MEDIUM = 1;
    public static int LARGE = 2;

    public abstract int cost();
}