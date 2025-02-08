//Write a program that prompts the user to enter a letter and check whether a letter is a
//vowel or a constant.
package practical1;
import java.util.Scanner;
public class C6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter character:");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("given char is vowel");
        }
        else{
            System.out.println("given char is constent");
        }
    }
}