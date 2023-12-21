class Strong
{
    // sum of factorial of each digit is equal to the given number, then we consider it as the strong number...
    // for instance 145 -> 1! + 4! + 5! = 145
    public static void main(String[] args)
    {
        strong(1745);
    }

    static int strong(int no)
    {
    
        int sum = 0;
        int copy = no;
    
        while (no != 0)
        {
            int rem = no % 10;
            int fact = 1;
            for (int i = rem; i >= 1; i--) 
            {
                fact = fact * i;
            }
    
            sum = sum + fact;
            no = no / 10;
    
        }
    
        if (copy == sum)
        {
            System.out.println("Its a strong number");
        }
        else
        {
            System.out.println("Its not  a strong number");
        }
        
        return sum;    
    }
}
