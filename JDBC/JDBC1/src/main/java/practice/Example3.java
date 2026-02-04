package practice;
import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,count=10,sum=0;
        System.out.println("Enter the first number");
        num=sc.nextInt();
        System.out.println("Required Square Increment Sequence");
        for (int i = 0; i <=count; i++) {
            sum=num*num+1;
            num=num+1;
            System.out.print(sum+" ");
        }
    }
}
