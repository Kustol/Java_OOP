package Game;

public class Footman extends BaseHero<Melee, Shield>{

    public Footman(String name, int health, Melee weapon, Shield shield) {
        super(name, health, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                '}' + super.toString();
    }
}