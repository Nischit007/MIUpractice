public class Question21 {
    public static int stantonMeasure(int[] a){
        int count=0;
        int countValue=0;
            for(int i=0;i<a.length;i++){
                if(a[i]==1){
                    count++;
                }

            }
            for(int i=0;i<a.length;i++){
                if(a[i]==count){
                   countValue++;
                }
            }


         return countValue;
    }

    public static void main(String[] args) {
        int[] array1= {1,3,1,1,3,3,2,3,3,3,4} ;
        int result=stantonMeasure(array1);
       System.out.println(result);
    }
    
}
