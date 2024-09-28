package Sep28;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number of which you would like to see a factorial");
        Scanner s = new Scanner(System.in);
        int i = Integer.parseInt(s.nextLine());
        int res=1;
        do{
               res*=i;
               i--;
        }while(i>=1);
        System.out.println("The result of factorial is "+res );
    }
}
