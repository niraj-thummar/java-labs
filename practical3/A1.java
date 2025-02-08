//The marks obtained by a student in 5 different subjects are input through the
//keyboard.
//The student gets a division as per the following rules:
//I. Percentage above or equals to 60-first division
//II. Percentage between 50 to 59-second division
//III. Percentage between 40 and 49-Third division
//IV. Percentage less than 40-fail
//Write a program to calculate the division obtained by the student.
package practical3;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks 1 :");
        int m1 = sc.nextInt();
        System.out.print("enter marks 2 :");
        int m2 = sc.nextInt();
        System.out.print("enter marks 3 :");
        int m3 = sc.nextInt();
        System.out.print("enter marks 4 :");
        int m4 = sc.nextInt();
        System.out.print("enter marks 5 :");
        int m5 = sc.nextInt();
        double avg = ((double)(m1 + m2 + m3 + m4 + m5)/500)*100;
        System.out.println(avg);
        if(avg>=60)
        {
            System.out.println("First division!");
        }
        else if(avg >=50 && avg<=59)
        {
            System.out.println("second division!");
        }
        else if(avg>=40 && avg<=49)
        {
            System.out.println("Third division!");
        }
        else if(avg<40)
        {
            System.out.println("Fail!");
        }
        System.out.println("You got " +avg+ " persent");
    }
}
