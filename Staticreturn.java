public class Staticreturn {
    public static void main(String[] args) {
        double x = InnerStaticreturn.area();
        System.out.println(x);
    }
}

class InnerStaticreturn {
    static double area() {
        int r = 5;
        final double pi = 3.142;
        double res = pi * r * r;
        return res;
    }
}