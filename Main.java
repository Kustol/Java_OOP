package OOP_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("RusskayaKartoshka",123.45))
                .addProduct(new Product("Baikal", 255.12))
                .addProduct(new Juice("J7", 312.13, "orange"))
                .addProduct(new Juice("Dobri", 62.87))
                .addProduct(new Chocolate("Milka", 121.00, "black", "bitter"))
                .addProduct(new Chocolate("Milka", 128.00, "milky"))
                .addProduct(new Chocolate("Alenka", 98.70, "milky", "nutty"))
                .addProduct(new Milk("Belorechenskoye", 97.00, 3.2))
                .addProduct(new Milk("Prostokvashino", 110.00, 3.5));


        System.out.println(vendingMachine);

        System.out.println("searching for RusskayaKartoshka");
        System.out.println(vendingMachine.findProduct("RusskayaKartoshka"));

        System.out.println("buying RusskayaKartoshka");
        vendingMachine.buy("RusskayaKartoshka",123.45);
        System.out.println(vendingMachine);

        System.out.println("buying Baikal");
        vendingMachine.buy("Baikal",255.12);
        System.out.println(vendingMachine);

        System.out.println("searching for J7");
        System.out.println(vendingMachine.findProduct("J7"));

        System.out.println("buying J7");
        vendingMachine.buy("J7",312.13);
        System.out.println(vendingMachine);


        System.out.println("searching for Milka");
        System.out.println(vendingMachine.findProduct("Milka"));

        System.out.println("buying Milka");
        vendingMachine.buy("Milka",122.00);
        System.out.println(vendingMachine);

        System.out.println("buying Milka");
        vendingMachine.buy("Milka",121.00);
        System.out.println(vendingMachine);

    }
}
