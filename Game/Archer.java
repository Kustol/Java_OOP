package Game;

public class Archer extends BaseHero<Ranged, Shield>{

    public Archer(String name, int health, Ranged ranged, Shield shield) {
        super(name, health, ranged, shield);
    }

    public int range(){
        return  weapon.getRange();
    }

    @Override
    public String toString() {
        return "Archer{" +
                "weapon=" + weapon +
                '}';
    }

    public int defend(){
        return  defend();
    }
}