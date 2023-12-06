class NonstaticPM {
    public static void main(String[] args) {
        new Circle().area(5);
    }
}

class Circle {
    void area(int r){
        final double pi = 3.142;
        double result = pi * r * r;
        System.out.println(result);
    }
}