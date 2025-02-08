package practical4;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element of Array: ");
            arr[i] = sc.nextInt();
        }
        for(int i=(arr.length)-1; i>=0; i--){
            System.out.print(arr[i]+",");
        }
    }
}
