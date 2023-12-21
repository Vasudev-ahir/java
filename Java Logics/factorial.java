class factorial {
    public static void main(String[] args) {
        // in java a factorial progam calculates the factorial of a given non negative integer the factorial of a number n is the product of all positive integers less than or equal to n. 
        // for instance 5! is equal to 5*4*3*2*1 = 120...

        int a = 1;
        int fact = 1;

        for(int i = a; i <= 5; i++){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
