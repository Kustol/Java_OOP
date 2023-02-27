package Game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends BaseHero> implements Iterable<T> {

    List<T> players = new ArrayList<T>();

    public void add(T t) {
        players.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return players.iterator();
    }

    public int getTeamHealth() {
        int teamHealth = 0;
        for (T hero : players) {
            teamHealth += hero.getHealth();
        }
        return teamHealth;
    }

    public int getMaxRange() {
        int maxRange = 0;
        for (T hero : players) {
            if (hero instanceof Archer) {
                Archer archer = (Archer) hero;
                if (maxRange < archer.range()) {
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getSumDamage() {
        int sumDamage = 0;
        for (T hero : players) {
            sumDamage += hero.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getMinDefend() {
        int minDefend = 0;
        for (T hero : players) {
            if (hero.getShield().defend() > minDefend) {
                minDefend = hero.getShield().defend();
            }
        }
        return minDefend;
    }
}