import java.util.Locale;
import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X, Y, replacing, sum;

        System.out.print("Enter two numbers:");
        X = sc.nextInt();
        Y = sc.nextInt();

        if (X > Y){
            replacing = X;
            X = Y;
            Y = replacing;
        }

        sum  = 0;
        for (int i = X+1; i < Y; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }

        System.out.println("Sum of odd numbers = " + sum);

        sc.close();
    }
} 