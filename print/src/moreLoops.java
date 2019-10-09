import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        double power = Integer.parseInt(reader.nextLine());
        double number = 2;

        int result = (int)Math.pow(number, power);



        System.out.println(result);
    }
}
