import java.util.Random;
import java.util.Scanner;
public class method {

    static int count = 0;
    static int numberDrawn=0;
    private static int drawNumber() {
            return new Random().nextInt(10);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int numberDrawn = drawNumber();
        int count = 0;

        if (numberDrawn < guess) {
            count++;
            System.out.println("Number guessed is smaller. " + "Times guessed: " + count);
            loop();

        } else if (numberDrawn > guess) {
            count++;
            System.out.println("Number guessed is bigger. " + "Times guessed: " + count);
            loop();
        } else {
            count++;
            System.out.println("Guessed correctly! " + "Times guessed: " + count);

        }

    }

    public static void loop() {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int numberDrawn = drawNumber();


        if (numberDrawn < guess) {
            count++;
            System.out.println("Number is lesser. " + "Times guessed: " + count);
            loop();

        } else if (numberDrawn > guess) {
            count++;
            System.out.println("Number is greater. " + "Times guessed: " + count);
            loop();
        } else {
            count++;
            System.out.println("Guessed correctly! " + "Times guessed: " + count);

        }
    }

}
