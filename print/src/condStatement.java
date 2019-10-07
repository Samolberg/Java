import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type in your age ");
            int num1 = Integer.parseInt(reader.nextLine());

            if (num1 <= 150 && num1 > 0 ) {
                System.out.println("OK");
            } else {
                System.out.println("Impossible");
            }
        }
    }

