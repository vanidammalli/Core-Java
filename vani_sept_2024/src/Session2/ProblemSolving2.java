package Session2;

import java.util.Scanner;

public class ProblemSolving2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age- to see the category");
        int age = Integer.parseInt(s.nextLine());
        if(age<13){
            System.out.println("Child");
        }else if(age>=13 && age<19){
            System.out.println("Teenager");
        }else if(age>=20 && age<59){
            System.out.println("Adult");
        }else {
            System.out.println("Senior");
    }
}
}