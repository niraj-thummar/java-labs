//Write a program to accept a line and check how many consonants and vowels are there
//in line.
package practical4;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int vowel=0;
        int consonants=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='E' ||str.charAt(i)=='U'
               ||str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                vowel++;
            }
            else if(str.charAt(i) !=' '){
                consonants++;
            }
        }
        System.out.println("Vowel is: "+vowel);
        System.out.println("consonants is: "+consonants);
    }
}



