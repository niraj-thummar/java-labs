//Write an interactive program to print a diamond shape. For example, if user enters
//the number 3, the diamond will be as follows:[B]
//*
//* *
//* * *
//* *
//*
package practical5;
public class B6{
    public static void main(String[] args) {
        int num = 3;
        for(int i=0; i<num; i++){
            for(int j=0; j<num-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = num-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j<i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}