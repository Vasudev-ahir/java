class factorialRange {
    public static void main(String[] args) {
        int a = 1;
        int fact = 1;
        for(int i = a; i <= 5; i++){
            if (i%2 == 0) {
                fact = fact * i;
                // System.out.println(fact + " " + i );
            }
        }
        System.out.println(fact);
    }
}
