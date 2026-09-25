import java.util.Locale;
import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String name1, name2;
        int age1, age2;
        double average;
        
        System.out.println("Data of the first person: ");
        System.out.print("Name: ");
        name1 = sc.nextLine();
        System.out.print("Age: ");
        age1 = sc.nextInt();
        
        System.out.println("Data of the second person: ");
        System.out.print("Name: ");
        sc.nextLine();
        name2 = sc.nextLine();
        System.out.print("Age: ");
        age2 = sc.nextInt();
        
        average = (double)(age1 + age2) / 2;
        System.out.println("The average age of " + name1 + " and " + name2 + " is " + average + " years");
        
        sc.close();
    }
}