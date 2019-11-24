import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = reader.nextLine();
        System.out.print("Enter length: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.println("Result: " + text.substring(0,num1));



    }
}
