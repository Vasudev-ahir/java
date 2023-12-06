class NonstaticReturn {
    public static void main(String[] args) {
        double x = new Circle().area(5);
        System.out.println(x);
    }
}

class Circle {
    double area(int r){
        final double pi = 3.142;
        double result = pi * r * r;
        return result;
    }
}