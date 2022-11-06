import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        //Positive/Negative Number using scanner.......
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("The entered number "+num+" is positive.");
        }
        else
        {
            System.out.println("The entered number "+num+" is negative.");
        }
    }
}
