//Write a program to calculate the area of Rectangle
package practical2;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter l:");
        double l = sc.nextDouble();
        System.out.print("enter b:");
        double b = sc.nextDouble();
        System.out.print("area of ractangle is :"+(l*b));
    }
}
