package Game;

public class Main {
    public static void main(String[] args) {
        Team<Footman> teamA = new Team<>();

        teamA.add(new Footman("Joe", 55, new Melee("Spear", 15), new SmallShield(50)));
        teamA.add(new Footman("Moe", 100, new Melee("Sword", 44), new BigShield(250)));
        teamA.add(new Footman("Doe", 20, new Melee("Axe", 25), new SmallShield(50)));


        for (Footman item : teamA) {
            System.out.println(item);

        }
        System.out.println("Total health Team'A': " + teamA.getTeamHealth());
        System.out.println("Range of destruction Team'A': " + teamA.getMaxRange());
        System.out.println("Total damage Team'A': " + teamA.getSumDamage());
        System.out.println("Min defend Team'A': " + teamA.getMinDefend());
        System.out.println();

        Team<BaseHero> teamB = new Team<>();
        teamB.add(new Footman("Bill", 54, new Melee("Dagger", 100), new BigShield(250)));
        teamB.add(new Footman("Fill", 54, new Melee("Mace", 50), new SmallShield(50)));
        teamB.add(new Archer("Gill", 54, new Ranged("Bow", 90, 22), new SmallShield(50)));

        for (BaseHero item : teamB) {
            System.out.println(item);
        }
        System.out.println("Total health Team'B': " + teamB.getTeamHealth());
        System.out.println("Range of destruction Team'B': " + teamB.getMaxRange());
        System.out.println("Total damage Team'B': " + teamB.getSumDamage());
        System.out.println("Min defend Team'B': " + teamB.getMinDefend());
        System.out.println("________________________________________________________________________________________________________________________________");

        Footman footman1 = new Footman("Stan", 77, new Melee("Book", 30), new SmallShield(150));
        Footman footman2 = new Footman("Homer", 66, new Melee("Weights", 20), new BigShield(300));

        while (footman1.getHealth() > 0  && footman2.getHealth() > 0){
            footman1.hit(footman2);
            System.out.println(footman2);
            System.out.println();
            footman2.hit(footman1);
            System.out.println(footman1);
            System.out.println();
        }

        if (footman1.getHealth()>0){
            System.out.println("WIN \n" + footman1);
        } else {
            System.out.println("WIN \n" + footman2);
        }
    }


}