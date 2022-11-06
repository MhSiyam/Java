package Basics.src;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        //Basic Switch Using Scanner.....
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A Number: ");
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("The Number Is: 1");
                break;
            case 2:
                System.out.println("The Number Is: 2");
                break;
            case 3:
                System.out.println("The Number Is: 3");
                break;
            case 4:
                System.out.println("The Number Is: 4");
                break;
            case 5:
                System.out.println("The Number Is: 5");
                break;
            default:
                System.out.println("The Number Is: Unknown");

        }
    }
}
