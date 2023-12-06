class Circle {
    void area(){
        final double pi = 3.142;
        int r = 4;
        double res = pi * r * r;
        System.out.println(res);
    }
}

class nonstatic {
    public static void main(String[] args) {     
        new Circle().area();
    }
}
