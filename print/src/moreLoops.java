import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int result = Integer.parseInt(reader.nextLine());
        System.out.print("Enter number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        int times = result;

        while (times < num2) {
            times++;
            result = result + times;

        }
        System.out.println(result);
    }
}
