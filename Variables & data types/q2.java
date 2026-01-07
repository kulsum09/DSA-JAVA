// Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.
// (Hint : area of a square is (side x side))

import java.util.*;
public class q2{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int side = sc.nextInt();
       int area = side*side;

       System.out.println("The area of square is:" + area);
    }
}