//Write an interactive program to print a string entered in a pyramid form. For instance,
//the string "stream" has to be displayed as follows:[A]
//s
//st
//str
//stre
//strea
//stream
package practical5;
import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        int m=0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<=i; j++) {
                System.out.print(str.charAt(m));
                m++;
            }
            m=0;
            System.out.println();
        }
    }
}
