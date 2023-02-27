package Game;

public class SmallShield implements Shield{
    private int defendPoint;

    public SmallShield(int defendPoint) {
        this.defendPoint = defendPoint;
    }

    public int getDefendPoint() {
        return defendPoint;
    }

    @Override
    public int defend() {
        return defendPoint;
    }

    @Override
    public String toString() {
        return "SmallShield{" +
                "defendPoint=" + defendPoint +
                '}';
    }
}