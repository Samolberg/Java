import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");

        while (true) {

            int number = Integer.parseInt(reader.nextLine());
            if (number == -1){
                System.out.println("Thank you come again");
                break;
            }else {
                System.out.println(number);
            }

            }

        }

    }

