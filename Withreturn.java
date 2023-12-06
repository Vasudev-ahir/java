class Withreturn {
    static double area(){
        int r = 5;
        final double pi = 3.142;
        double res = pi * r * r;
        return res;
    }   
    public static void main(String[] args) {
        double x = area();
        System.out.println(x);
    }
}
