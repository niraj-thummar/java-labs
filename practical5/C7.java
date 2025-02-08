//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot
//index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ...,
//nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7]
//might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the
//index of target if it is in nums, or -1 if it is not in nums.[C]
//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
package practical5;
import java.util.Scanner;
public class C7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {0, 1, 2, 4, 5, 6, 7};
        int[] newArr = new int[arr.length];
        System.out.print("Enter Pivot index: ");
        int k = sc.nextInt();
        int range = (arr.length) - k;
        for(int i=0; i<range; i++){
           newArr[i] = arr[k];
           k++;
        }

        for(int i=0; i<k; i++){
            if(range<7) {
                newArr[range] = arr[i];
            }
            range++;
        }
        System.out.println("new Array is: ");
        for(int n : newArr){
            System.out.print(n+",");
        }
        System.out.println();
        int target;
        System.out.print("Enter the target: ");
        target = sc.nextInt();
        int i;
        for(i=0; i<newArr.length; i++){
            if(newArr[i] == target){
                break;
            }
        }
        if(i != newArr.length){
            System.out.println("index: "+i);
        }
        else{
            System.out.println("-1");
        }
    }
}
