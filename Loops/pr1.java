// print star a pattern

public class pr1{
    public static void main(String args[]){
        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

         for(int i=1; i<=4; i++){
        for(int j=4; j>=i; j--){
            System.out.print("*");
        }
        System.out.println();

        }
    }

   


}
