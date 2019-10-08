import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        int result = 0;
        int times = 0;

        while (times < num1) {
            times++;
            result = result + times;
        }
        System.out.println(result);
    }
}
