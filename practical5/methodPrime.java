package practical5;
import java.util.Scanner;
class Prime{
    public void printPrimeNum(int a, int b){
        if(a>=b){
            int temp = a;
            a=b;
            b=temp;
        }
        else if(a==1){
            a=2;
        }
        int count = 0;
        for(int i=a; i<=b; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }
            if(count == 0)
            {
                System.out.print(i+",");
            }
            count = 0;
        }
    }
}
public class methodPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();
        System.out.print("Enter Starting: ");
        int a = sc.nextInt();
        System.out.println("Enter Ending: ");
        int b = sc.nextInt();
       obj.printPrimeNum(a, b);

    }
}