//Write a program that reads a number in meters, converts it to feet, and displays the
//result.
package practical1;
import java.util.Scanner;
public class B5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number in meter:");
        int num = sc.nextInt();
        double feet = num * 3.28084;
        System.out.println(num+ "m" +"=" +feet+ "feet");
    }
}
