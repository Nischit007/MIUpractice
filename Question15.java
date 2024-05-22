public class Question15 {
    public static int answerTwo(int[] a){
        int length=a.length;
        int sum1=0;
        int sum2=0;
        int mid=length/2;
        for(int i=0;i<mid;i++){
            sum1=sum1+a[i];
        }
        for(int j=mid;j<a.length;j++){
            sum2=sum2+a[j];
        }
        if(length%2==0 && sum1==sum2){
            return 1;
        }
       return 0;
    }



    public static void main(String[] args) {
           int[] array1 = {5,4,3,2,3,4,6,1};
         int result=answerTwo(array1);
         System.out.println(result);
    }
}
