//Write a program to check that the given number is prime or not
package practical3;
import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        if(num<2)
        {
            System.out.println("No Prime");
        }
        int count = 0;
        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
