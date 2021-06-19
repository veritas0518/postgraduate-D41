import java.util.Scanner;
import java.math.*;
public class TestCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius1=s.nextDouble();
        Circle c1=new Circle(radius1);

        double radius=s.nextDouble();
        double height=s.nextDouble();
        Cylinder c2=new Cylinder(radius,height);
        System.out.printf("Perimeter:%f\n",c1.getPerimeter());
        System.out.printf("Area:%f\n",c1.getArea());
        System.out.printf("Surface area:%f\n",c2.getSurfaceArea());
        System.out.printf("Volume:%f\n",c2.getVol());

    }
}
class Circle{
    double radius;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    public double getPerimeter(){return Math.PI*2*radius;}
    public double getArea(){return Math.PI*radius*radius;}
}
class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getSurfaceArea() {
        return getArea() * 2 + getPerimeter() * height;
    }

    public double getVol() {
        return getArea() * height;
    }

}
