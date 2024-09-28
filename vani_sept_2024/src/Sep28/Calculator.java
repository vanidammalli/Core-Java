package Sep28;


import java.util.Scanner;


public class Calculator{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 0 to Exit");
        int in;
        char c;
        do{
            System.out.println("Enter variables for operation");
            int v1 = Integer.parseInt(s.nextLine());
            int v2 = Integer.parseInt(s.nextLine());
            System.out.println("Please enter your input operation");
            in = Integer.parseInt(s.nextLine());
            switch(in){
                case 1:
                    System.out.println("The sum is "+(v1+v2));
                break;
                case 2:
                    System.out.println("The sum is "+(v1-v2));
                    break;
                case 3:
                    System.out.println("The sum is "+(v1*v2));
                    break;
                case 4:
                    System.out.println("The sum is "+(v1/v2));
                    break;
                default: break;
            }
            System.out.println("Do you want to continue: Yes or No");
            c = s.nextLine().charAt(0);
        }while(c=='Y' || c=='y');
    }
}




