package Session2;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year to be checked for leap year");
        int year = Integer.parseInt(s.nextLine());
        if(year%4==0){
            System.out.println("It is a Leap Year");
        }else{
            System.out.println("It is not a Leap Year");
        }


        System.out.println("Enter the age - to be checked if eligible to vote");
        int age = Integer.parseInt(s.nextLine());
        if(age>=18){
            System.out.println("Eligible to Vote - major");
        }else{
            System.out.println("Children under 18 are not eligible to Vote - minor");
        }



        System.out.println("Enter the number- to be checked if even or odd");
        int n = Integer.parseInt(s.nextLine());
        if(n%2==0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }

        System.out.println("Enter the number- to be checked if positive or negative");
        int num = Integer.parseInt(s.nextLine());
        if(num>=0){
            System.out.println("Number is Positive");
        }else {
            System.out.println("Number is Negative");
        }
    }
}
