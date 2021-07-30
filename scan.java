import java.util.Scanner;
public class scan{
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       float b = s.nextFloat();
       System.out.println("a ="+a+", b ="+b);
       s.close();
   }    
}