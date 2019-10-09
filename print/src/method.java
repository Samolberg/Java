import java.util.Scanner;
public class method {
    public static void printStars(int amount) {
       for(int i = 0; i<amount; i++) {
            System.out.print("*");
        }

        System.out.println("\n");


    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }



}
