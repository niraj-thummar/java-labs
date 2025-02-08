//Define Time class with constructor to initialize hour and minute. Also define addition
//method to add two time objects.
package practical6;
import java.util.Scanner;
class Time{
    int hour;
    int minute;

    public Time(int hour1, int minute1){
        this.hour = hour1;
        this.minute = minute1;
    }

    public void addition(int hour2, int minute2){
        hour += hour2;
        minute += minute2;
        while(minute>59) {
                hour++;
                minute -= 60;
        }
        System.out.println(hour+":"+minute);
    }
}
public class A2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour1: ");
        int hour1 = sc.nextInt();
        System.out.print("Enter minute1: ");
        int minute1 = sc.nextInt();
        Time obj = new Time(hour1, minute1);
        System.out.print("Enter hour2: ");
        int hour2 = sc.nextInt();
        System.out.print("Enter minute2: ");
        int minute2 = sc.nextInt();
        obj.addition(hour2, minute2);
    }
}