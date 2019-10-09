import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int sum = 0;
        int count = 0;
        int countEven = 0;
        int countOdd = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());

            if (number == -1){
                double avg = (double)sum / count ;
                System.out.println("Thank you come again");
                System.out.println("The sum is " + sum);
                System.out.println("How many number: " + count);
                System.out.println("Average: " + avg );
                System.out.println("Even numbers: " + countEven);
                System.out.println("Odd numbers: " + countOdd);
                break;
            }else {
                sum = sum + number;
                count++;
                System.out.println(number);
            }
            if (number%2 == 0) {
                countEven++;
            }else{
                countOdd++;
            }
            }

        }

    }

