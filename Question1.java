import java.util.Scanner;

public class Question1 {


    public static int isCenteredArray(int[] arr){
        int length=arr.length;
        if(length%2==0 ){
            return 0;
        }
        int middleIndex=length/2;
        int middleElement=arr[middleIndex];
       for(int i=0;i<arr.length;i++){
        if(i!=middleIndex && arr[i]<=middleElement){
            return 0;

        }
       
       }

       return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = isCenteredArray(a);
        System.out.println(result);


        
    }
}
