class Nested_if {
    public static void main(String[] args) {
        int i = 21;
        if (i > 15) {
            if (i < 14) {
                System.out.println("Integer is less then 14");
            }
            else{
                System.out.println("nested if else nu else statement");
            }
        }
        else{
            System.out.println("Main else statement");
        }
    }    
}
