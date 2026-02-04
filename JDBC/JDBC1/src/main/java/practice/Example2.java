package practice;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        double radius, height, volume, capacity;
        float Pi = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextDouble();
        System.out.println("Enter the height");
        height = sc.nextDouble();
        if (radius <= 0 || height <= 0)
            System.out.println("Invalid measurement");
        else {
            volume = Pi * radius * radius * height;
            capacity = volume * (3.0/4.0);
            System.out.printf("Total capacity is %.2f litres\n", volume);
            System.out.printf("Capacity for alarm is %.2f litres", capacity);
        }
    }
}
