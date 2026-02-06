package test1.com;
import java.util.Scanner;
public class FindSecondLargestElement {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.println("how many elements:");
        int n = s1.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s1.nextInt();
        }

        int l = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > l){
                s = l;
                l = arr[i];
            } else if (arr[i] > s && arr[i] != l) {
                s = arr[i];
            }
        }
        System.out.println("the second largest element is " + s);
    }
}
