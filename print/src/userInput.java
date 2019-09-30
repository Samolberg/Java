import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Your name: ");
        String name1 = reader.nextLine();

        System.out.print("Enter age: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Enter another name: ");
        String name2 = reader.nextLine();

        System.out.print("Enter age: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int num3 = num1 + num2;
        System.out.println(name1 + " and "+ name2 + " are " + num3 + " years old in total");



    }
}
