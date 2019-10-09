import java.util.Scanner;
public class moreLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(reader.nextLine());

        int i,fact=1;

        for(i=1;i<=number;i++){
           fact = fact*i;
        }
        System.out.println(fact);
    }
}
