//Write a program to create basic calculator by getting 2 numbers and 1 string (operation)
//from the user and apply the operation given in a string on the given numbers.
package practical2;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        double a = sc.nextDouble();
        System.out.print("enter b:");
        double b = sc.nextDouble();
        System.out.println("which operation you want to perform");
        String str = sc.next();
        if(str .equals("+"))
        {
            System.out.print("sum is :"+(a+b));
        }
        else if(str .equals("-"))
        {
            System.out.print("sub is :"+(a-b));
        }
        else if(str .equals("*"))
        {
            System.out.print("mul is :"+(a*b));
        }
        else if(str .equals("/"))
        {
            System.out.print("sub is :"+(a/b));
        }

    }
}
