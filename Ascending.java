import java.util.Locale;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.println("Enter two numbers:");
        X = sc.nextInt();
        Y = sc.nextInt();

        while ( X != Y) {
            if ( X < Y) {
                System.out.println("ascending!");
            } else {
                System.out.println("descending!");
            }
            System.out.println("Enter two other numbers:");
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
} 