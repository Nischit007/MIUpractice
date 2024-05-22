public class Question22 {

    public static int sumFactor(int[] a){
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        for(int i=0;i<a.length;i++){
            if(sum==a[i]){
              count++;
            }
        }


            return count;
    }

    public static void main(String[] args) {
               int[] array1={3,0,2,-5,0};
        int result=sumFactor(array1);
       System.out.println(result);
    }
}
