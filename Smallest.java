import java.util.Locale;
import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, c, smallest;

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.print("SMALLEST NUMBER:" + smallest);

        sc.close();
    }
} 