import java.util.Scanner;
public class condStatement {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Your username: ");
            String username = reader.nextLine();

            System.out.println("Your password: ");
            String password = reader.nextLine();

            if (username.equals("alex") && password.equals("mightyducks")) {
                System.out.println("Welcome juzer");
            } else if (username.equals("emily") && password.equals("cat")) {
                System.out.println("Welcome juzer");
            } else {
                System.out.println("Wrong juzername or password");
            }

        }
    }

