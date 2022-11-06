import java.util.Scanner;

public class SumScanner {
    public static void main(String[] args) {

        //Sum in for loop using Scanner.....
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Length to sum them: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);
    }
}
