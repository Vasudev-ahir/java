class Prime {
    public static void main(String[] args) {
        //  prime number is a natural number that has no divisors other than 1 and itself
        int num = 5;
        boolean flag = true; // Assumption number is prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // If it is devided by any of the number with reminder zero
                flag = false;   // it will return false... Means assumption is wrong
                break;
            }
        }
        if (flag == true) {
            System.out.println("Prime number...");
        } else {
            System.out.println("Not Prime number...");
        }
    }
}
