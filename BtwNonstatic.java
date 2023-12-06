class BtwNonstatic {
    public static void main(String[] args) {
        Tester.area();
    }
}

class Tester {
    static void area(){
        final double pi  = 3.142;
        int r = 5;
        double result = pi * r * r;
        System.out.println(result);

    }
}