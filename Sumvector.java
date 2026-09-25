import java.util.Locale;
import java.util.Scanner;

public class Sumvector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N;
        double average, sum;

        System.out.print("How many numbers are you going to type? ");
        N = sc.nextInt();

        double[] vector = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.print("VALUES = ");
        for (int i = 0; i < N; i++) {
            System.out.print(vector[i] + "  ");
        }

        sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + vector[i];
        }

        average = sum / N;
        System.out.println();
        System.out.println("SUM = " + sum);
        System.out.println("AVERAGE = " + average);

        sc.close();
    }
} 