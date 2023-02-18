package OOP_2;


public  class Jellyfish extends Predator implements Swimmable{

    public Jellyfish(String nickname) {
        super(nickname);
    }

    @Override
    public String toString(){
        return "I'm jellyfish. " + super.toString() + ". I can swim at a speed of " + speedOfSwim();
    }
    @Override
    public String say(){
        return "brr-brr";
    }

    @Override
    public int speedOfSwim() {
        return 3;
    }

}