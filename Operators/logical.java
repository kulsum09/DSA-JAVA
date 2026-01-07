public class logical{
    public static void main(String args[]){

        // logical AND

        System.out.println("Logical AND:");
        System.out.println((3>5) && (5>0));
        System.out.println((3>5) && (5<0));
        System.out.println((3<5) && (5>0));
        System.out.println((3<5) && (5<0));

  
       //logical OR
         System.out.println("Logical OR :");

        System.out.println((3>5) || (5>0));
        System.out.println((3>5) || (5<0));
        System.out.println((3<5) || (5>0));
        System.out.println((3<5) || (5<0));

       //logical NOT
         System.out.println("Logical NOT :");

        System.out.println(!(5>0));
    }
}