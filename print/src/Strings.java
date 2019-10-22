import java.util.Scanner;

public class Strings {

    public static  calculateCharacters(String text){



        char firstChar = text.charAt(0);
        return firstChar;


    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();

        System.out.println("First char:" + calculateCharacters(text));

    }


}
