import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();

        if(text.length() > 2) {
            System.out.println("Character 1:" + text.charAt(0));
            System.out.println("Character 2:" + text.charAt(1));
            System.out.println("Character 3:" + text.charAt(2));
        }

    }
    public static char calculateCharacters(String text){


        return text.charAt(0);


    }

}
