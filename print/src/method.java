import java.util.Scanner;
public class method {
    public static void printStars(int amount) {
       for(int i = 0; i<amount; i++) {
            System.out.print("*");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        printRectangle(17,3);
    }

    public static void printSquare(int sideSize) {

        for(int i = 0; i<sideSize; i++) {
            printStars(sideSize);
        }
        System.out.println("\n");
    }

    public static void printRectangle(int width, int height) {

        for(int i = 0; i<height; i++) {
            printStars(width);

        }

        System.out.println("\n");
    }



}
