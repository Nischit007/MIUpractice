public class Question17 {
 public static int inertial(int[] a){
    boolean oddCount=false;
  

    int maxEvenValue=a[0];
    int oddSum=0;
    int evenSum=0;
    for(int i=0;i<a.length;i++){
        
            if(maxEvenValue<a[i]){
                   maxEvenValue=a[i];
                   
                
            }

            if(a[i]%2!=0){
                oddSum+=a[i];
                oddCount=true;
            }
            if(a[i]%2==0){
               evenSum+=a[i];
            }

        
    }
   
    
    if(!oddCount){
        return 0;
    }
    if(maxEvenValue%2!=0){
        return 0;
       }

    if(evenSum-maxEvenValue>=oddSum){
        return 0;
    }
   
 
    

    
    return 1;
 }
    public static void main(String[] args) {
         int[] array1 ={11,4,20,9,2,8};
        int result=inertial(array1);
        System.out.println(result);
    }
}
