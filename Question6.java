import java.util.Scanner;

public class Question6 {
    public static int isPerfectSquare(double n){
        if(n<0){
            return 0;
        }else{
            int m=(int)Math.sqrt(n);
            int l=m+1;
            return l*l;
            
        }
    }
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
          System.out.println("enter the number");
          double n=sc.nextDouble();
          int result=(int)isPerfectSquare(n);
          System.out.println(result);
    }
}
