public class Staticpm {
    public static void main(String[] args) {
        InnerStaticpm.area(5);
    }
}

class InnerStaticpm {
    static void area(int r){
        final double pi  = 3.142;
        double res = pi * r * r;
        System.out.println(res);
    }
}