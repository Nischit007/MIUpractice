public class Question14 {
     public static int answerTwo(int[] a){
        int number=0;
        int count=0;
        int currCount=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                }
                if(count>currCount){
                    currCount=count;
                    number=a[i];

                }
            }
        }
        return number;






      
     }
    public static void main(String[] args) {
        int[] array1 = {2, 2, 5, 11, 23,5,5};
         int result=answerTwo(array1);
         System.out.println(result);
    }
}
