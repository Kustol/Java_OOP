package Game;

import java.util.Random;

public abstract class BaseHero <W extends Weapon, S extends Shield> {

    private String name;

    private int health;

    protected W weapon;

    protected S shield;

    protected BaseHero(String name, int health, W weapon, S shield) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public W getWeapon() {
        return weapon;
    }
    public S getShield() {
        return shield;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "BaseHero{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weapon=" + weapon +
                '}';
    }

    public boolean hit(BaseHero recepient){
        int damage = damageFork();
        return !recepient.reduceHealth(damage);
    }

    public boolean reduceHealth(int damage){
        health -= damage;
        return health>0;
    }

    public int damageFork(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}