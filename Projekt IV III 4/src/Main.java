public class Main {

    public static void main(String[] args) {
        Product Komputer = new Composite("Komputer");
        Product KartaGraficzna = new Composite("Karta graficzna");

        Komputer.addChild(new ProductImpl("Klawiatura",20));
        Komputer.addChild(new ProductImpl("Procesor",500));
        Komputer.addChild(new ProductImpl("Pamiec",210));
        Komputer.addChild(new ProductImpl("Monitor",200));

        KartaGraficzna.addChild(new ProductImpl("Procesor graficzny",200));
        KartaGraficzna.addChild(new ProductImpl("Pamięć",100));

        Komputer.addChild(KartaGraficzna);


        System.out.println(Komputer+"Cena: "+Komputer.getPrice());

    }
}
