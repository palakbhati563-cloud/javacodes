import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = Integer.parseInt(scan.nextLine());

        System.out.println("Enter your name");
        String name = scan.nextLine();// String input
        System.out.println("Hello " + name);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }


    }
}









