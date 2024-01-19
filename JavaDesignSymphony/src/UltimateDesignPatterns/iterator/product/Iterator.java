package UltimateDesignPatterns.iterator.product;

public interface Iterator {
    boolean hasNext();
    Product current();
    void next();
}
