import java.util.*;
import java.lang.Math;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int r=n;
     int k = sc.nextInt();
     int len=0;
     int d=0;
     while(n!=0){
         n/=10;
         len++;
     }
     int p=(int)Math.pow(10,len-1);
     k=k%len;
     if(k>0){
         while(k!=0){
             d=r%10;
             r/=10;
             r=d*p+ r;
             k--;
         }
     }
     if(k<0){
          while(k!=0){
             d=r/p;
             r=r%p*10+d;
             k++;
         }
     }
     System.out.print(r);
    }
   }