//Write a program to get 2 numbers from the user and print the sum of two numbers
//using command line and Scanner class.[
//package practical1;  //command line
//public class A4{
//    public static void main(String[] args){
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        System.out.println(a+b);
//    }
//}

//Scanner
package practical1;
import java.util.Scanner;
public class A4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        System.out.print("sum is :"+(a+b));

    }
}



