package Basics.src;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Character To CheckG: ");
        char x=sc.next().charAt(0);
        if(x=='a' || x=='e' ||x=='i' ||x=='o' ||x=='u' ||x=='A' || x=='E' ||x=='I' ||x=='O' ||x=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}
