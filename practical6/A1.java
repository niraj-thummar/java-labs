//Write a program to create circle class with area function to find area of circle.
package practical6;
import java.util.Scanner;
class Circle{
   double radius;
   public double findArea(double radius){
       return Math.PI * Math.pow(radius,2);
   }
}
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        Circle obj1 = new Circle();
        double area = obj1.findArea(radius);
        System.out.println("Area is: "+area);
    }
}
