import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter year: ");
            int num1 = Integer.parseInt(reader.nextLine());

            if (num1%4 == 0){
                System.out.println("Leap year");
            }else if (num1%100 == 0 && num1%400 == 0) {
                System.out.println("Leap year");
            }else {
                System.out.println("not leap year");
            }


        }
    }

