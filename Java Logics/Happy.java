// conditions for happy number : 
// 1. Number should be in double digit
// 2. Sum of that number should be  1 or 7:
// two steps :- 1) split 2) sum of square
class Happy
{
    static int happy(int no)
    {
        int sum = 0;
        while (no != 0)
        {
            int rem = no % 10;
            sum = sum + rem * rem;
            no = no / 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int no = 13;
        while (no > 9)
        {
            no = happy(no);
        }
        if (no == 1 || no == 7)
        {
            System.out.println("Happy Happy :)");
        } 
        else
        {
            System.out.println("Not happy happy :(");
        }
    }
}