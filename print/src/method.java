import java.util.Scanner;
public class method {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Times to print: ");
        int times = Integer.parseInt(reader.nextLine());
        int count = 0;

        while (true) {
            if (times > count) {
                count++;
                printText();
            } else {
                break;
            }
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.\n");
    }
}
