package Session2;

public class Comaprision {
    public static void main(String[] args){
        int x = 25, y = 15,a=23,b=19, c=25;
        System.out.println(x==y);
        System.out.println(x!=a);
        System.out.println(x<=b);
        System.out.println(x>=b);
        System.out.println(y==a);
        System.out.println(a>=y);
        System.out.println(a<=y);
        System.out.println(a!=y);

        String s = "Hello";

        System.out.println(s);
        System.out.print(s);
        System.out.println(s);
        System.out.println(x==y);

        System.out.println( (x!=y) || x <=a);
        System.out.println((x>=y) && x >=y);
        System.out.println((x==a) && x>b);
        System.out.println((x!=a) || y==b);
        System.out.println((b!=y)|| x<=a);
        System.out.println((x!=c) && x<=a);
        System.out.println(!((x!=c) && x<=a));



    }
}
