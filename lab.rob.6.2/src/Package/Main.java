package Package;

public class Main {

    public static void main(String[] args) {
        First engine = new First(1, 2, 3);
        Second porsche = new Second(4, 5, 6);
        Third pc = new Third(7, 8, 9);
        First engn = new First(60, 75, 90);
        First engn2 = new First(110, 150, 180);
        First engn3 = new First(360, 420, 580);
        System.out.println();
        First en = new First(60,75,90);
        System.out.println(en.hp0() + "кВт");
    }
}