package Session2;

import java.util.Scanner;

public class ProblemSolving3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day of week- to see the price");
        String day = s.nextLine();
        if(day.equals("Wednesday")){
            System.out.println("Ticket Price: $10");
        }if(day.equals("Saturday")){
            System.out.println("Ticket Price: $15");
        }
        if(day.equals("Sunday")){
            System.out.println("Ticket Price: $12");
        }
        else{
            System.out.println("Contact cinemas to check for the price");
        }
    }

}
