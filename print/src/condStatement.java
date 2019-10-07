import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a number: ");
            int num1 = Integer.parseInt(reader.nextLine());

            System.out.print("Type a number: ");
            int num2 = Integer.parseInt(reader.nextLine());

            if (num1 > num2) {
                System.out.println("Bigger number: " + num1);
            } else if (num2 > num1) {
                System.out.println("Bigger number:" + num2);
            } else {
                System.out.println("Numbers are equal");
            }
        }
    }

