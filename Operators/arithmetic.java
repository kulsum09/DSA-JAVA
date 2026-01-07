public class pr1{
    public static void main(String args[]){

        // binary operator
        int A = 10;
        int B = 20;

        System.out.println("The Addition is :" +(A+B));
         System.out.println("The Subtraction is :" +(A-B));
          System.out.println("The Multiplication is :" +(A*B));
           System.out.println("The Devision is :" +(A/B));
            System.out.println("The Modulo(Remainder) is :" +(A%B));


        // unary operator


        // pre - icrement

        System.out.println("pre - icrement");
            int a = 10;
            int b = ++a ;
            System.out.println(a);
            System.out.println(b);

        System.out.println("post - icrement");
            int c = 10;
            int d = c++ ;
            System.out.println(c);
            System.out.println(d);

        System.out.println("pre - decrement");
            int e = 10;
            int f = --e ;
            System.out.println(e);
            System.out.println(f);

         System.out.println("post - decrement");
            int g = 10;
            int h = g-- ;
            System.out.println(g);
            System.out.println(h);

    }
}