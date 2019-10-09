import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int sum = 0;
        int count = 0;
        while (true) {

            int number = Integer.parseInt(reader.nextLine());
            if (number == -1){
                System.out.println("Thank you come again");
                System.out.println("The sum is " + sum);
                System.out.println("How many number: " + count);
                break;
            }else {
                sum = sum + number;
                count++;
                System.out.println(number);
            }

            }

        }

    }

