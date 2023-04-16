import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ===================== left shift and right shift operator
//        int a = 10;
//        int b = a << 2;
//        int c = a >> 2;
//
//        System.out.println(b);
//        System.out.println(c);

        //================= Taking input from system
        System.out.println("Enter your age ");
        Scanner sc = new Scanner(System.in);
        float age = sc.nextFloat();

        System.out.println("Enter your name ");

        sc.nextLine(); // dummy next line to catch enter key
        String name = sc.nextLine();

        System.out.println("your age is " +age);
        System.out.println("your name is " +name);

    }
}