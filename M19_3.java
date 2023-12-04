// 19_1. write 8 programs to calculate areas with method with return type from non-static to static through reference variable.
class M19_3
{
    public static void main(String [] args)
    {
        M19_3 s1=new M19_3();
        System.out.println(s1.Triangle());
        System.out.println(s1.Square());
        System.out.println(s1.Rectangle());
        System.out.println(s1.Parallelogram());
        System.out.println(s1.Trapezoid());
        System.out.println(s1.Circle());
        System.out.println(s1.Ellipse());
        System.out.println(s1.Sector());
    }

    double Triangle()
    {
        int b = 5 ;
        int h = 8 ;                                                                                                                                                                                                                                                                              
        double area = 0.5*b*h ;
        return area;
    }

    int Square()
    {
        int a = 10 ;
        int length = a*a ;
        return length;
    }

    int Rectangle()
    {
        int w = 9 ;
        int h = 7 ;
        int area = w*h ;
        return area ;
    }

    int Parallelogram()
    {
        int b = 4 ;
        int h = 6 ;
        int area = b*h ;
        return area;
    }

    double Trapezoid()
    {
        int a = 5 ;
        int b = 9 ;
        int h = 7 ;
        double area = 0.5*(a+b)*h ;
        return area;
    }

    double Circle()
    {
        int r = 6 ;
        final double pi = 3.142 ;
        double area = pi*r*r ;
        return area;
    }

    double Ellipse()
    {
        int a = 2 ;
        int b = 4 ;
        final double pi  = 3.142 ;
        double area = pi*a*b ;
        return area;
    }

    double Sector()
    {
        int r = 4 ;
        double t = 35.4 ;
        double area = 0.5*r*r*t ;
        return area;
    }
}