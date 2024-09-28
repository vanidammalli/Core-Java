package Sep28;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number till where you would like to get sum of first n numbers");
        int in = Integer.parseInt(s.nextLine());
        int res=0;
        do{
             res+=in--;
        }while(in>=0);
        System.out.println("The result of first n numbers is "+res);
    }
}
