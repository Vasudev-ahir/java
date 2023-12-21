class Reverse {
    public static void main(String[] args) {
        int num = 121;
        int reverse = 0;
        int copy = num;

        while (num != 0) {
            int reminder = num % 10;
                reverse = (reverse * 10) + reminder;
            num = num / 10;
            // System.out.println(" Reverse : " + reverse + " reminder : " + reminder + " Number : " + num);
        }
        System.out.println(reverse);

        // Check if it is pallindrom or not
        if (copy == reverse) {
            System.out.println("Pallindrom");
        }
        else{
            System.out.println("Its not pallindrom");
        }
    }
}