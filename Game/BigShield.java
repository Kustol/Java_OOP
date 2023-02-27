package Game;


public class BigShield implements Shield{
    private int defendPoint;

    public BigShield(int defendPoint) {
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
        return "BigShield{" +
                "defendPoint=" + defendPoint +
                '}';
    }
}