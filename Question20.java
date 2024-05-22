public class Question20 {
    public static int GuthrieSequence(int[] a){
        int element=a[0];
        int length=a.length-1;
        for(int i=0;i<length;i++){
            if(a[i]%2==0){
                element=element/2;
            }
            if(a[i]%2!=0){
               element=element*3+1;
            }
        }
        System.out.println(element);
        if(element==1 && a[length]==1 ){
            return 1;
        }else{
            return 0;
        }


    }


    public static void main(String[] args) {
        int[] array1= {7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1};
         int result=GuthrieSequence(array1);
        System.out.println(result);
    
    

    }
}