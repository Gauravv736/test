import java.util.Scanner;
public class numbercheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= scan.nextInt();
        if (num < 0) {
            System.out.println("The entered number is negative");
        }
        else{
            System.out.println("The entered number is positive");
        }
    }
}