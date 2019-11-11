import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();

        System.out.println("First char:" + calculateCharacters(text));

    }
    public static char calculateCharacters(String text){


        return text.charAt(0);


    }

}
