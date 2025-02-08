//Write a program that prompts the user to enter three numbers. Find the largest
//number.
package practical2;
import java.util.Scanner;
public class C5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a");
        int a = sc.nextInt();
        System.out.print("enter b");
        int b = sc.nextInt();
        System.out.print("enter c");
        int c = sc.nextInt();
        if(a>b) {
            if (a > c) {
                System.out.print("a is greater");
            } else {
                System.out.println("c is greater");
            }
        }
        else if(c>b)
        {
            System.out.println("c is greater");
        }
        else{
            System.out.println("b is greater");
        }
        }
    }

