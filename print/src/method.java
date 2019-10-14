import java.util.Scanner;
public class method {
    public static void printStars(int amount) {
       for(int i = 0; i<amount; i++) {
            System.out.print("*");
        }

        System.out.print("\n");
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

    public static void printWhitespaces(int size) {
        for(int i = 0; i<size; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {

        for(int i = size; i>=0; i--){

            printStars(size-i);
            printWhitespaces(size+i);

        }

    }
    public static void main(String[] args) {

        printTriangle(4);
    }

}
