package practice;
import java.util.Arrays;
import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size,sum;
        System.out.println("Enter the array size");
        size=sc.nextInt();
        if(size<=0){
            System.out.println(size+" is an invalid array size");
            sc.close();
            return;
        }
        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<=0) {
                System.out.println(arr[i] + " is an invalid element");
                sc.close();
            }
        }
        System.out.println("Enter the target sum value");
        sum=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The sorted array is "+Arrays.toString(arr) );
        int found=0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j <size ; j++) {
                if(arr[i]+arr[j]==sum) {
                    System.out.println(sum);
                    found=found+1;
                }

            }
            if(found==0)
                System.out.println("None of the pair has the sum value as"+sum);

        }
    }
}
