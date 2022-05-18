package Package;

public class Second {
    int porsche;
    int mercedes;
    int bmw;
    public Second(int porsche, int mercedes, int bmw){
        this.porsche = porsche;
        this.mercedes = mercedes;
        this.bmw = bmw;
    }

    double brand() {
        double b;
        b = bmw + porsche;
        return b;
    }

    void car() {
        double c = 1 * (bmw + mercedes);
        System.out.println(c);
    }
}
