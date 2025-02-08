//Write a program to print prime numbers between given range.
package practical3;
import java.util.Scanner;
public class C8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Starting: ");
        int a = sc.nextInt();
        System.out.print("Ending: ");
        int b = sc.nextInt();
            if(a>=b){
            int temp = a;
            a=b;
            b=temp;
        }
            else if(a==1){
                a=2;
            }
        int count = 0;
        for(int i=a; i<=b; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i % j == 0)
                {
                   count++;
                }
            }
            if(count == 0)
            {
                System.out.print(i+",");
            }
           count = 0;
        }
    }
}
