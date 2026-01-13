// Write a program that reads a set of integers, and then prints the sum of the even and odd integers

import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int integer;
        int evenSum = 0;
        int oddSum = 0;
        int choice = 0;

        do{
            System.out.println("Enter the number:");
            integer = sc.nextInt();

            if(integer%2 == 0){
              evenSum+=integer;
            } 
            else{
                 oddSum+=integer;
            }
             System.out.println("Do you want to continue press 1 or else zero");
             choice = sc.nextInt();

            System.out.println("The sum of even numbers are :" + evenSum);
               System.out.println("The sum of odd numbers are :" + oddSum);

        }while(choice == 1);

      

    }
}