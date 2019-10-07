import java.util.Scanner;
public class changingVariables {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;


        System.out.print("Enter number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.print("Enter number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.print("Enter number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println(sum);

    }
}
