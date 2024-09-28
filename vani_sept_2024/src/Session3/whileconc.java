package Session3;
import java.util.Scanner;

public class whileconc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        System.out.println("Enter the nth   number to see the sum of first n numbers");
        i = Integer.parseInt(s.nextLine());
        double ans = 0;
        while (i != 0) {
            ans += i--;
        }
        System.out.println("Sum of first n numbers is " + ans);


        System.out.println("Enter the nth number , till where you want to see the list of numbers from 1 to n");
        int j = Integer.parseInt(s.nextLine());
        int r = 1;
        while (!(r > j)) {
            System.out.println(r++);
        }

        System.out.println("Printing numbers from 1 to 10");
        int k = 1;
        while (!(k > 10)) {
            System.out.println(k++);
        }
    }
}
