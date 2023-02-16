package OOP_1;

public class Juice extends Product {
    private String color;
    private String taste;

    public Juice(String name, Double price) {
        super(name, price);
    }

    public Juice(String name, Double price, String taste) {
        super(name, price);
        this.taste = taste;
    }


    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("%s taste = %s;", super.toString(), color, taste);
    }
}