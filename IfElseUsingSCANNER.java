import java.util.Scanner;

public class IfElseUsingSCANNER {
    public static void main(String[] args) {
        //Scan value from user for if/else.....
        //Category By Age Difference.....
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age To Verify: ");
        int age = sc.nextInt();
        if(age>=18 && age<=40){
            System.out.println("This Person Is Young");
        }
        else if(age<=17 && age>=12){
            System.out.println("Underage");
        }
        else if(age<=11 && age>=1){
            System.out.println("Child");
        }
        else{
            System.out.println("Old Guy");
        }
    }
}
