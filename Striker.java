// CSE-111 LAB - 8 TASK - 2     []
// T-3 Striker class

public class Striker extends Football{
    public int goals = 0;
    public int shots_on_target = 0;

    public Striker(String nk_s_0, int ak_s_0, int smk_s_0, int gok_0, int shoK_0) {
        super(nk_s_0, ak_s_0, smk_s_0);
        this.goals = gok_0;
        this.shots_on_target = shoK_0;
    }

    public void calculatePerformance() {
        double performance = (double)goals / shots_on_target;
        System.out.println("Performance : " + performance);
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Stamina : " + stamina);
        System.out.println("Goals : " + goals);
        System.out.println("Shots on target : " + shots_on_target);
    }


}