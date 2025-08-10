import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int num = 1 + 2 * i;
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(num);
        }
    }
}
