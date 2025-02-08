//Write a program to find length of string and print second half of the string.
package practical4;
import java.util.Scanner;
public class B4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int length = str.length();
        int secHalf = length / 2;
        System.out.println(str.substring(0,secHalf));
    }
}