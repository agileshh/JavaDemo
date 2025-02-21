import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
public class scanner_class
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int c =sc.nextInt();
        System.out.println(c);

        System.out.println("Enter the String");
        String word = sc.next();
        System.out.println("The word is :" +word );

        System.out.println("Hello");
        int a = 23;
        System.out.println(a);
        System.out.println(23);

        System.out.println();

    }
}
