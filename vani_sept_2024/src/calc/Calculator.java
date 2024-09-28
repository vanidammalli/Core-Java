package calc;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter variables for operation");
        int v1 = Integer.parseInt(s.nextLine());
        int v2 = Integer.parseInt(s.nextLine());
        System.out.println("Please enter your input operation");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 0 to Exit");
        int in = Integer.parseInt(s.nextLine());

        int ans=0;
        if(in == 1){
            ans = v1+ v2;
        }
        else if(in == 2){
            ans = v1 - v2;
        }
        else if(in == 3){
            ans = v1 * v2;
        }
        else if(in == 4){
            ans = v1 / v2;
        }
        else {
            System.out.println("The operation is invalid");
            System.exit( 0);
        }
        System.out.println("The result is :"+ans);
    }
}
