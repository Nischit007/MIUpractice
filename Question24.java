public class Question24 {
 public static int isSubArray(int[] a){
    
    for(int i=0;i<a.length-1;i++){
        int sum=0;
        for(int j=i+1;j<a.length;j++){
            sum+=a[j];


        }
        // System.out.println(a[i]+">"+sum);
        if(a[i]<sum){
           
            return 0;
        }

      
    }
    return 1;


    
 }

    public static void main(String[] args) {
                          int[] array1={11,5,4,2};
        int result=isSubArray(array1);
       System.out.println(result);
    }
}
