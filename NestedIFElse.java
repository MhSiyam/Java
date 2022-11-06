import java.util.Scanner;

public class NestedIFElse {
    public static void main(String[] args) {

        //Nested if/else problem for blood donation......
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        System.out.println("Enter the weight: ");
        int weight=sc.nextInt();
        if(age>=18)
        {
            if(weight>50)
            {
                System.out.println("This person can donate blood");
            }
            else
            {
                System.out.println("The person is not eligible to donate blood");
            }
        }
        else
        {
            System.out.println("Age must be greater than 18");
        }
    }
}
