import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        int number = 1;
        while (number <= num1) {

            System.out.println(number);
            number++;


        }
    }
}
