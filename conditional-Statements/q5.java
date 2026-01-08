// ¿WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not.

import java.util.*;

public class q5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%4 == 0 ){
         System.out.println("it is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
        
        
    }
}