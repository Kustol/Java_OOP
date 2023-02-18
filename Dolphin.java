package OOP_2;


public  class Dolphin extends Predator implements Swimmable{

    public Dolphin(String nickname) {
        super(nickname);
    }

    @Override
    public String toString(){
        return "I'm seal. " + super.toString() + ". I can swim at a speed of " + speedOfSwim();
    }
    @Override
    public String say(){
        return "pisk-pisk";
    }

    @Override
    public int speedOfSwim() {
        return 45;
    }

}