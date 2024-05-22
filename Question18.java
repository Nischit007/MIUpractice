public class Question18 {
    public static int perfectSquare(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int x=a[i];
                int y=a[j];
                
                if(x>y){
                    int temp=x;
                     x=y;
                     y=temp;


                }
                 if(x>0 && y>0){
                int sum=x+y;
                int sum1=(int) Math.sqrt(sum);
                if(sum1*sum1==sum){
                     count++;
                }
            }
        }
    }



        return count;
    }



    public static void main(String[] args) {
              int[] array1 ={11,5,4,20};
        int result=perfectSquare(array1);
        System.out.println(result);
    }
}
