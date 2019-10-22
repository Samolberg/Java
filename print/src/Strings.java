import java.util.Scanner;

public class Strings {

    public static int calculateCharacters(String text){



        int nameLength = text.length();
        return nameLength;


    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();

        System.out.println("Lenght of the name:" + calculateCharacters(text));

    }


}
