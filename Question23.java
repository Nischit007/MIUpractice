public class Question23 {
  public static int isEvenSpaced(int[] a){
    int maxValue=a[0];
    int minValue=a[0];
    for(int i=0;i<a.length;i++){
        if(maxValue<a[i]){
            maxValue=a[i];
        }
        if(minValue>a[i]){
            minValue=a[i];
        }
      
    }

    if((maxValue-minValue)%2==0){
        return 1;
    }else{
    return 0;
    }
  }
    public static void main(String[] args) {
                  int[] array1={200,10,151,160} ;
        int result=isEvenSpaced(array1);
       System.out.println(result);
    }
}
