//Write a program to find that given number is palindrome or not.
package practical3;
import java.util.Scanner;
public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int num = sc.nextInt();
        int rem,sum=0;
        int originalNum = num;
        while(num != 0)
        {
            rem = num % 10;
            sum = sum*10+rem;
            num /=10;
        }
       if(sum == originalNum)
       {
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not palindrome");
       }
    }
}
