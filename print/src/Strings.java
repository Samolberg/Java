import java.util.Scanner;

public class Strings {


    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String text1 = reader.nextLine();

        System.out.print("Enter string 2: ");
        String text2 = reader.nextLine();

        int index = text1.indexOf(text2);

        if(index != -1) {
            System.out.println("Common word: " + text1.substring(index));
        }else {
            System.out.println("Sorry they dont have match");

        }





    }
}
