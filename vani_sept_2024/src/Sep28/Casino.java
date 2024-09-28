package Sep28;
//Niagara Falls Casino
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        System.out.println("Welcome to Niagara Falls Casino");
        System.out.println("Ready for the GAME!!!");
        int luckyNumber = 21;
        Scanner scanner = new Scanner(System.in);
        for(int i =1;i<4;i++){
            System.out.println("GUESS the LUCKY NUMBER");
            System.out.println("Hint: Choose between 1 - 100");
            int number = Integer.parseInt(scanner.nextLine());
            if (number == luckyNumber) {
                System.out.println("Jackpot,You WIN!");break;
            } else if(i>=3){
                System.out.println("Unfortunately No,You Lost");
            }else{
                System.out.println("No,Try Again");
            }
        }
    }
}
//number==luckyNumber ? System.out.println("Jackpot,You WIN!"): System.out.println("Unfortunately No,Please try Again");
