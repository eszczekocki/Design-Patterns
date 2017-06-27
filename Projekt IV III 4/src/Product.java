public interface Product {

    String getName();
    Integer getPrice();
    void addChild(Product p);
    void removeChild(Product p);
}
