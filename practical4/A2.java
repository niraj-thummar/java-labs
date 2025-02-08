//Write a program that creates and initializes a four integer element array. Calculate and
//display the average of its values
package practical4;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];
        double sum=0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
            sum  += arr[i];
        }
        double avg = sum / 4;
        System.out.println("Average is : "+avg);
    }
}
