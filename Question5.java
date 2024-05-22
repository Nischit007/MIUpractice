import java.util.Scanner;

public class Question5 {
    public static  int[] f(int[] first, int[] second){
        int index=0;
        int count=0;
        for(int i=0;i<first.length;i++){
            for(int j=0;j<second.length;j++){
                if(first[i]==second[j]){
                     count++;
                }
            }
        }
        int[] result=new int[count];
        for(int i=0;i<first.length;i++){
            for(int j=0;j<second.length;j++){
                if(first[i]==second[j]){
                    result[index++]=first[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of first array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter the element of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the size of second array");
        int m=sc.nextInt();

        int[] b=new int[m];
        System.out.println("enter the element of an array");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();


        }

        int[] result=f(a,b);
        for(int c:result){
            System.out.println(c + " ");
        }

    }
}
