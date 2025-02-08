//Write a program to find maximum no from given 3 no.(without if-else).
package practical3;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("enter c:");
        int c = sc.nextInt();
        int max = a>b?((a>c)?a:c):(b>c)?b:c;
        System.out.println(max);
    }
}
