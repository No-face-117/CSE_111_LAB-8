// CSE-111 LAB - 8 TASK - 3     []
// T-3 Defender class

public class Defender extends Football{
    public int tackles = 0;
    public int interceptions = 0;

    public Defender(String nk_d_0, int ak_d_0, int smk_d_0, int tak_0, int ink_0) {
        super(nk_d_0, ak_d_0, smk_d_0);
        this.tackles = tak_0;
        this.interceptions = ink_0;
    }

    public void calculatePerformance() {
        double performance = (double)interceptions / tackles;
        System.out.println("Performance : " + performance);
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Stamina : " + stamina);
        System.out.println("Tackles : " + tackles);
        System.out.println("Interceptions : " + interceptions);
    }


}

