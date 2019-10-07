import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a number: 0-60 ");
            int num1 = Integer.parseInt(reader.nextLine());

            if (num1 >= 50 ) {
                System.out.println("Grade: 5");
            } else if (num1 >= 45) {
                System.out.println("Grade: 4");
            }else if (num1 >= 40) {
                System.out.println("Grade: 3");
            }else if (num1 >= 35) {
                System.out.println("Grade: 2");
            }else if (num1 >= 30) {
                System.out.println("Grade: 1");
            } else {
                System.out.println("Failed");
            }
        }
    }

