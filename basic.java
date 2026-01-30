import java.util.Scanner;

public class basic  {
    public static void main(String[] args){
        System.out.println("hello world");

        int n;
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
         n=sc.nextInt();
         if(n%2==0){
            System.out.println("even");
         }
         else{
            System.out.println("odd");
         }
         sc.close();
    }
}
