class swapTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;   // temp = 10
        a = b;          // a = 20
        b = temp;       // b = temp = 10
        System.out.println(a);
        System.out.println(b);
    }

}
