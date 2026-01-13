// Write a program to print the multiplication table of anumber N,entered by the user

import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n +"x" + i + "=" + n*i);
        }
    }
}