import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num1 = Integer.parseInt(reader.nextLine());
            if (num1 > 0) {
                System.out.println("Your number is positive");
            } else {
                System.out.println("Your number is negative");
            }
        }
    }

