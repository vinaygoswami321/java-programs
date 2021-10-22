import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n ; i++){
             for(int j = 0; j < m ; j++){
                 arr[i][j] = sc.nextInt();
             }
        }
        sc.close();
       int minr = 0;
       int maxr = arr.length-1;
       int minc = 0;
       int maxc = arr[0].length-1;
       int total = n*m;
       int count = 0;
       
       while(count < total){
           for(int i = minr,j = minc; i <= maxr && count<total; i++){
               System.out.println(arr[i][j]);
               count++;
           }
           minc ++;
           for(int i = maxr,j = minc; j <= maxc && count<total; j++){
               System.out.println(arr[i][j]);
               count++;
           }
           maxr--;
           for(int i = maxr,j = maxc; i>=minr && count<total; i--){
               System.out.println(arr[i][j]);
               count++;
           }
           maxc--;
           for(int i = minr,j = maxc; j>=minc && count<total; j--){
               System.out.println(arr[i][j]);
               count++;
           }
           minr++;
       }
        
    }
}