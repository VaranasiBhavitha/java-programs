import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original = num, sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}