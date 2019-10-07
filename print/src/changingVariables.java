import java.util.Scanner;
public class changingVariables {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int sum = 0;
        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }else{
                sum = sum + read;
                System.out.println("Sum is now: " + sum);
            }
        }
        System.out.println("Sum in the end: " + sum);

    }
}
