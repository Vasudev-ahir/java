// 19_1. write 8 programs to calculate areas with only method from non-static to static through reference variable.
class Assign51
{
    public static void main(String [] ags)
    {
        M19 a1=new M19();
        a1.Triangle();
        a1.Square();
        a1.Rectangle();
        a1.Parallelogram();
        a1.Trapezoid();
        a1.Circle();
        a1.Ellipse();
        a1.Sector();
    }

    void Triangle()
    {
        int b = 5 ;
        int h = 8 ;
        double area = 0.5*b*h ;
        System.out.println("Triangle area : "+area) ;
    }

    void Square()
    {
        int a = 10 ;
        int area = a*a ;
        System.out.println("Square area : "+area) ;
    }

    void Rectangle()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        System.out.println("Rectangle area : "+area) ;
    }

    void Parallelogram()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        System.out.println("Parallelogram area : "+area) ;
    }

    void Trapezoid()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        System.out.println("Trapezoid area : "+area) ;
    }

    void Circle()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        System.out.println("Circle area : "+area) ;
    }

    void Ellipse()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        System.out.println("Ellipse area : "+area) ;
    }

    void Sector()
    {
        int r = 4 ;
        double t = 35.4 ;
        double area = 0.5*r*r*t ;
        System.out.println("Sector area : "+area) ;
    }
}