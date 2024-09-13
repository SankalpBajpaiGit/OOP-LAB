import java.util.*;
interface calc{
    double area();
}
class rectangle implements calc{
    private double length , breath;
    public rectangle(double length , double breath){
        this.length = length;
        this.breath = breath;
    }
    public double area(){
        return (length * breath);
    }
}
class circle implements calc{
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return (3.14 * radius * radius);
    }
}
class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length and bredth");
        double l , b;
        l = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter radius");
        double rad = sc.nextDouble();
        rectangle r = new rectangle(l , b);
        circle c = new circle(rad);
        System.out.println("Area of rectangle is : "+r.area());
        System.out.println("Area of circle is : "+c.area());

    }
}
