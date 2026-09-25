import java.util.Locale;
import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double base, height, area, perimeter, diagonal;
        
        System.out.print("Rectangle base: ");
        base = sc.nextDouble();
        
        System.out.print("Rectangle height: ");
        height = sc.nextDouble();
        
        area = base * height;
        perimeter = 2 * (base + height);
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(height, 2.0));
        
        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETER = " + String.format("%.4f", perimeter));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
        
        sc.close();
    }
}