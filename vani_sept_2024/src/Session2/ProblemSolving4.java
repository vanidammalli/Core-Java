package Session2;

import java.util.Scanner;

public class ProblemSolving4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers- to see the greatest one");
        int num1 = Integer.parseInt(s.nextLine());
        int num2 = Integer.parseInt(s.nextLine());
        int num3 = Integer.parseInt(s.nextLine());
        int temp;
       temp = (num1 >num2) ? num1:num2;
       temp = (num3>temp)? num3:temp;
       System.out.println("Greatest number is : "+temp);
    }

}
