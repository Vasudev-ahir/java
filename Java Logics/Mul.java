class Mul {
    static int mul = 1;

    static int multiple(int a, int b) {
        for (int i = a; i <= b; i++) {
            mul = mul * i;
        }
        return mul;
    }

    public static void main(String[] args) {
        int x = multiple(1, 5);
        System.out.println(x);
    }
}