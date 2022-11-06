import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        //UIU grading system.....
        //Taking input from the user.....
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mark : ");
        int num=sc.nextInt();
        if(num<55)
        {
            System.out.println("fail");
        }
        else if(num>=55 && num<=57)
        {
            System.out.println("D grade");
        }
        else if(num>=58 && num<61)
        {
            System.out.println("D+ grade");
        }
        else if(num>=62 && num<65)
        {
            System.out.println("C- grade");
        }
        else if(num>=66 && num<=69)
        {
            System.out.println("C grade");
        }
        else if(num>=70 && num<73)
        {
            System.out.println("C+ grade");
        }
        else if(num>=74 && num<77)
        {
            System.out.println("B- grade");
        }
        else if(num>=78 && num<81)
        {
            System.out.println("B grade");
        }
        else if(num>=82 && num<85)
        {
            System.out.println("B+ grade");
        }
        else if(num>=86 && num<89)
        {
            System.out.println("A- grade");
        }
        else if(num>=90 && num<100)
        {
            System.out.println("A grade");
        }
        else
        {
            System.out.println("Invalid!");
        }
    }
}