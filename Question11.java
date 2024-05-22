import java.util.Scanner;


public class Question11 {
    public static int isMeera(int[] a){
        for(int i=0;i<5;i++){
            if(a[i]==1 && a[i]==9){
                return 1;
            }else if(a[i]!=1 && a[i]!=9){
                return 1;
            }else{
                return 0;
            }
            
        }
        return 0;
       
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        int result=isMeera(a);
        System.out.println(result);
     }
}
