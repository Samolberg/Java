import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int num3 = num1 * num2;
        System.out.println("Calculation with numbers: " + num3);

        System.out.println("Enter radius ");
        int radius = Integer.parseInt(reader.nextLine());
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle :" + circumference);5

    }
}
