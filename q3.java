// Question3:Entercostof3itemsfromtheuser(usingfloatdatatype)- a pencil,apenandan eraser. 
// You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


import java.util.*;
public class q3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil+pen+eraser;

        System.out.println("The total bill is:" + total);

        // add on

        float newTotal = total +(0.18f * total);
        System.out.println("the total bill with GST is:" + newTotal);
    }
}