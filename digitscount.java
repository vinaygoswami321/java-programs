import java.util.Scanner;
public class digitscount {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    int count=1;
    while(n/10!=0){
      count++;
      n=n/10;
    }
    System.out.print(count);
    }
}
