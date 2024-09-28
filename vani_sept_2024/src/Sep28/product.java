package Sep28;
import java.sql.SQLOutput;
import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        System.out.println("Enter the number of which you would like to see a product table");
        Scanner s = new Scanner(System.in);
        int j=1;
        int i = Integer.parseInt(s.nextLine());
        do{
            System.out.println(+i +"*" +j +"=" +(i*j));
            j++;
        }while(j<11);
    }
}
