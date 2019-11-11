import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();
        int i = text.length()-1;
        int j = 0;

        System.out.println("Revered: ");
        while (true) {
            if (i < 0) {
                break;
            }
            System.out.print(text.charAt(i));
            i--;
        }

    }
    public static char calculateCharacters(String text){


        return text.charAt(0);


    }

}
