
// need to correct 


public class Question25 {
    public static int isSymetric(int[] a){
        int length=a.length;
        if(length%2!=0){
            int mid=(length/2);
            
            for(int i=0;i<mid;i++){
                for(int j=length-1;j>=mid+1;j--){
                    if(a[i]%2==0 && a[j]%2!=0 || a[i]%2!=0 && a[j]%2==0){
                        System.out.println(a[i]+"="+a[j]);
                        return 0;
                    }
                }
            }
        }else{
            int mid=(length/2);
            for(int i=0;i<mid;i++){
                for(int j=length-1;j>=mid;j--){
                    if(a[i]%2==0 && a[j]%2!=0 || a[i]%2!=0 && a[j]%2==0){
                        System.out.println(a[i]+"="+a[j]);
                        return 0;
                      
                    }
                }
            }

        }
        return 1;
    }
public static void main(String[] args) {
    int[] array1={2,7,9,10,11,5,8};
    int result=isSymetric(array1);
   System.out.println(result);
}

    
}
