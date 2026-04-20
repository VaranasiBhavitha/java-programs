import java.util.Scanner;

class Exception3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number: ");
            int num = sc.nextInt();

            int arr[] = new int[3];
            arr[5] = num;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        } catch (Exception e) {
            System.out.println("General Error");
        }
    }
}