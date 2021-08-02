import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class consecutive1{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
         int max=0;
         int consecutive=0;
        bufferedReader.close();
        while(n>0){
            if(n%2==1){
                consecutive++;
                max = Math.max(consecutive,max);
            }
            else 
               consecutive =0;
               n=n/2;
        }
        System.out.print(max);
    }
    
}


