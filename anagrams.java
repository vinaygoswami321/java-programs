import java.util.Scanner;

public class anagrams{
    static void arrsort(char[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
    }
    static boolean isAnagram(String a, String b) {
        // Complete the function
         
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        int n1 =a.length();
        int n2 =b.length();
        if(n1!=n2){
            return false;
        }
        arrsort(arr1,n1);
        arrsort(arr2,n2);
        
        for(int i=0;i<n1;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
