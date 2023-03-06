package OOP_6.HomeWork;

public class Main{
    public static void main(String[] args){
        User user = new User("Looloo");

        Saveable saveable = (Saveable) new Persister(user);
        saveable.save();

        Reportable reportable = new ReportUser(user);
        reportable.report();
    }
}