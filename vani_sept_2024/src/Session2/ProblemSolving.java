package Session2;
import java.util.Scanner;

public class ProblemSolving {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the marks- to see the grades");
        int mark = Integer.parseInt(s.nextLine());
        if(mark>=90){
            System.out.println("Grade A");
        }else if(mark>=80 && mark<=89){
            System.out.println("Grade B");
        }else if(mark>=70 && mark<=79){
            System.out.println("Grade C");
        }else if(mark>=60 && mark<=69){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
