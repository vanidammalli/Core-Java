package Sep28;

//print number from 1 to 100, when you see multiple of 7 print your name;
public class forLoop {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 - 100, with your name on numbers - which are multiple of 7");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Vani");
                continue;
            }
                System.out.println(i);

        }
    }
}


