import java.util.Scanner;

public class ForLoopScanner {
    public static void main(String[] args) {

        //For Loop using Scanner.....
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            System.out.println("Owh Yeah!");
        }
    }
}
