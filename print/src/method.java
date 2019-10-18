import java.util.Random;
import java.util.Scanner;
public class method {

    public static int least (int num1, int num2){

        return Math.min(num1, num2);

    }

    public static void main(String[] args) {

        int smaller = least(2,7);
        System.out.println("Least: " + smaller);
    }

}
