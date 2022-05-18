package Package;

public class Second {
    double porsche;
    double mercedes;
    double bmw;

    public Second(double porsche, double mercedes, double bmw){
        this.porsche = porsche;
        this.mercedes = mercedes;
        this.bmw = bmw;
    }
    public Second(double br1) {
        porsche = br1;
    }
    public Second(Second brnd) {
        porsche = brnd.porsche;
        mercedes = brnd.mercedes;
        bmw = brnd.bmw;
    }

    double brand() {
        double b;
        b = porsche + bmw;
        return b;
    }

    void car0() {
        double c0 = 1 * (bmw + mercedes);
        System.out.println(c0);
    }
    int car1() {
        int c1 = (int) (1 * bmw);
        return c1;
    }
    static void brn_second(int porsche, int bmw) {
        System.out.println("Ваша марка першого авто це :" + porsche + "Ваша марка другого авто це :" + bmw );
    }
}
