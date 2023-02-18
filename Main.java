package OOP_2;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"), new Dog("Sharik"), new Rabbit("Whik"), new Cow("Murka"), new Duck("Krya"), new Butterfly("Yellow"), new Dolphin("Finny"), new Jellyfish("Garry"), new Seal("Monya")));
        for (Sayable item : zoopark.getSayAble()) {
            System.out.println(item.say());
        }

        System.out.println();
        System.out.println("--------------------Runable-------------------------");
        for (Runable item : zoopark.getRunable()){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("-----------------Who runs faster?----------------------------");
        System.out.println(zoopark.getWinner());

        System.out.println();
        System.out.println("--------------------Flyable-------------------------");
        for (Flyable item : zoopark.getFlyable()){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("----------------Who flies faster?-----------------");
        System.out.println(zoopark.getWinnerFly());

        System.out.println();
        System.out.println("-----------------Swimmable--------------------");
        for (Swimmable item : zoopark.getSwimmable()){
            System.out.println(item);
        }

        System.out.println();
        System.out.println("---------------Who swims faster?-----------------");
        System.out.println(zoopark.getWinnerSwim());


    }
}