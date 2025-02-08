//Write a program to check whether a number is even or odd.
package practical3;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
