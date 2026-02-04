package practice;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double height,weight,BMI;
        String Category,name;
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Enter your height in meters");
        height=sc.nextDouble();
        System.out.println("Enter your weight in kilograms");
        weight=sc.nextDouble();
        BMI=weight/(height*height);

        if(BMI<18.5)
            Category="Under weight";
        else if(BMI<25)
            Category="Normal weight";
        else if(BMI<=30)
            Category="Over weight";
        else
            Category="Obese";
        System.out.printf("Hello %s, Your BMI is %.2f\n",name,BMI);
        System.out.println("You are under the category "+Category);
    }

}
