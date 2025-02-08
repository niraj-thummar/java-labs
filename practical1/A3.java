//Write a java program to take user input
//i. through Command Line Argument.[A]
//ii. through Scanner class.[A]


//package practical1;
//import java.util.Scanner;
//public class A3 {
//  public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//      System.out.print("enter num");
//      int num = sc.nextInt();
//  }
//}

package practical1;
public class A3{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);
    }
}
