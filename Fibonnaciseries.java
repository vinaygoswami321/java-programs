
import java.util.*;
  
  public class Fibonnaciseries{
  
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
       int a=0;
       int b=1;
       int c=0;
       for(int i=0;i<n;i++){
          if(i==0){
            System.out.print(a);
          }
          else{if(i==1){
            System.out.print(b);
          }
          else{
           c=a+b;
           a=b;
           b=c;
           System.out.print(c);
          }
        }
       }
   }
  }