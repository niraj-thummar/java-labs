//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f32*5/9 );
package practical2;
import java.util.Scanner;
public class B4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter temperature in Fahrenheit:");
        double f = sc.nextDouble();
        System.out.print("temperature in celsius is :"+((f-32)*(5.0/9)));
    }
}
