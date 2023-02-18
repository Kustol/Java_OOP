package OOP_2;


public class Seal extends Predator implements Swimmable, Runable{
    public Seal(String nickname) {
        super(nickname);
    }
    @Override
    public String toString(){
        return "I'm seal. " + super.toString() + ". My speed is " + speedOfRun() + ". I can swim at a speed of " + speedOfSwim();
    }
    @Override
    public String say(){
        return "fr-fr";
    }
    @Override
    public int speedOfRun() {
        return 1;
    }

    @Override
    public int speedOfSwim() {
        return 30;
    }

}