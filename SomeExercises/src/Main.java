import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumProductMinMax3 sumProductMinMax3 = new SumProductMinMax3();

        System.out.print("Enter 1st integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter 1st integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter 1st integer: ");
        int num3 = scanner.nextInt();

        scanner.close();

        sumProductMinMax3.result(num1, num2, num3);

    }
}