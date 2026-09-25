import java.util.Locale;
import java.util.Scanner;

public class NegativeDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, negativeCount;


        System.out.print("What is the order of the matrix?");
        N = sc.nextInt();

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Element [" + i + "," + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < N; i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        negativeCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] < 0) {
                    negativeCount++;
                }
            }
        }

        System.out.println("Negative count: " + negativeCount);

        sc.close();
    }
} 