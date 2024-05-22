import java.util.Scanner;



public class Question2 {
    public static int f(int[] a){
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even+=a[i];
    
            }else{
                odd+=a[i];
            }
        }
        return odd-even;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = f(a);
        System.out.println(result);
    }
 
}

