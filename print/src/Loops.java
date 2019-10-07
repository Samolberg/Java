import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter password\n");
            String password = reader.nextLine();
            if (password.equals("carrot")) {
                System.out.println("Secret message : MEHED");
                break;
            }else {
                System.out.println("Wrong password");
            }
        }
    }
}
