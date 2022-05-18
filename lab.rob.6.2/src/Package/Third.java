package Package;

public class Third {
    int engine;
    int occasion;
    int capacity;
    public Third(int engine, int occasion, int capacity){
        this.engine = engine;
        this.occasion = occasion;
        this.capacity = capacity;
    }

    double technical() {
        double d;
        d = engine + capacity;
        return d;
    }

    void tech() {
        double t = 3 * (occasion + capacity);
        System.out.println(t);
    }
}
