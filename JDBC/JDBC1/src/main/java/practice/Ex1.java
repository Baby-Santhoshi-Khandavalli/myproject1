package practice;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) {
            System.out.println(n + " is an invalid array size");
            return;
        }

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        ArrayList<Integer> list=new ArrayList<>();
        for(int x:arr){
            if(x!=0){
                list.add(x);
            }
        }

        boolean isPalindrome=true;
        int i=0,j=list.size()-1;

        while (i<j){
            if(!list.get(i).equals(list.get(j))){
                isPalindrome=false;
                break;
            }
            i++;
            j--;

        }

        if(isPalindrome){
            for(int x:list){
                System.out.println(x+" ");
            }
            System.out.println("is a palindrome array");
        }else{
            for(int x:arr){
                System.out.println(x+" ");
            }
            System.out.println("is not a palindrome array");
        }
    }
}
