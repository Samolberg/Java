import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter name: ");
        String text = reader.nextLine();
        int i = 0;

        while(i < text.length()) {

            System.out.println(1+i + "." + " Character " + text.charAt(i));
            i++;

        }

    }
    public static char calculateCharacters(String text){


        return text.charAt(0);


    }

}
