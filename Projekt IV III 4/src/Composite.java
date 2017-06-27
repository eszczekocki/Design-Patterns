import java.util.ArrayList;

public class Composite implements Product {

    private ArrayList<Product> childrens = new ArrayList<Product>();
    String name;
    Integer priceSum;

    public Composite(String name) {
        this.name=name;
    }
    @Override
    public String getName() {

        return name;

    }
    @Override
    public Integer getPrice() {
        Integer sum = 0;
        for(Product p : childrens)
        {
            sum += p.getPrice();
        }
        this.priceSum = sum;
        return this.priceSum;

    }



    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();
        sb.append(this.getName() +":"+ System.lineSeparator());

        for(Product p : childrens)
        {
            sb.append(p);
        }

        return sb.toString();
    }

    @Override
    public void addChild(Product p) {

        childrens.add(p);

    }

    @Override
    public void removeChild(Product p) {
        childrens.remove(p);

    }

}