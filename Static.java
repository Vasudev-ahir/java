public class Static {
    public static void main(String[] args) {
        // To take values from another class we should go to "class_name.method_name();""
        // Static to static we dont need of creating object...
        InnerStatic.area();
    }
}

class InnerStatic {
    static void area(){
        final double pi = 3.142;
        int r = 5;
        double res = pi * r * r;
        System.out.println(res);
    }
}