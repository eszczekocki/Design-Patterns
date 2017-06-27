import org.omg.PortableServer.POAPackage.InvalidPolicy;

public class ProductImpl implements Product {

    private String name;
    private Integer price;

    public ProductImpl(String name, Integer price) {
        this.name=name;
        this.price=price;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public Integer getPrice() {

        return price;
    }

    @Override
    public void addChild(Product p) {

        System.out.println("Nie można dodać.");

    }

    @Override
    public void removeChild(Product p) {

        System.out.println("Brak dzieci.");

    }
    @Override
    public String toString() {
        return "Element: "+this.getName() +", koszt: "+ this.getPrice()+" "+System.lineSeparator();
    }

}