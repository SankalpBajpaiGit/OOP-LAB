import java.util.*;
interface calc{
    double area();
}
class square implements calc{
    private double length;
    public square(double length){
        this.length = length;
    }
    public double area(){
        return (length * length);
    }
}
class triangle implements calc{
    private double height , base;
    public triangle(double height , double base){
        this.height = height;
        this.base = base;
    }
    public double area(){
        return (0.5 * base * height);
    }
}
class aq1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        double l;
        l = sc.nextDouble();
        System.out.println("Enter height and base of triangle");
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        square s = new square(l);
        triangle t = new triangle(h , b);
        System.out.println("Area of square is : "+s.area());
        System.out.println("Area of triangle is : "+t.area());

    }
}
