import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a number: ");
            int num1 = Integer.parseInt(reader.nextLine());

            if (num1%2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Not even");
            }
        }
    }

