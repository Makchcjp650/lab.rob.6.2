package Package;
//задано три класи
public class First {
    double one;
    double two;
    double three;
//використання конструктора
    First(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    First(double en1) {
        one = en1;
    }
    First(First engn) {
        one = engn.one;
        two = engn.two;
        three = engn.three;
    }
    double hp0() {
        double e0;
        e0 = 1.3596 * one;
        return e0;
    }
    void hp1() {
        double e1 = 1.3596 * two;
        System.out.println(e1);
    }
    int hp2(){
        int e2 = (int) (one * 1.3596);
        return e2;
    }
    static void ngn_first(int two, int three){
        System.out.println("Кількість кВт 1 :" + two + "Кількість кВт 2 :" + three);
    }
}
