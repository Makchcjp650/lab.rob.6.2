package Package;

public class Third {
    double engine;
    double occasion;
    double capacity;

    public Third(double engine, double occasion, double capacity){
        this.engine = engine;
        this.occasion = occasion;
        this.capacity = capacity;
    }
    public Third(double tec1) {
        engine = tec1;
    }
    public Third(Third technk) {
        engine = technk.engine;
        occasion = technk.occasion;
        capacity = technk.capacity;
    }

    double technical() {
        double d;
        d = engine + capacity;
        return d;
    }

    void tech() {
        double t = 1 * (occasion + capacity);
        System.out.println(t);
    }
    int tech1() {
        int t1 = (int) (1 * engine);
        return t1;
    }
    static void tch_third(int engine, int occasion) {
        System.out.println("Ваш двигун :" + engine + "Ваш привід :" + occasion);
    }
}
