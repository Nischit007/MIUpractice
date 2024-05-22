public class Question10 {
    public static int isFancy(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            int first=1;
            int second=1;
            int curr=0;
            while(curr<n){
                curr=3*second+2*first;
                first=second;
                second=curr;
               
    
            }
            return curr;

        }

    }
    public static void main(String[] args) {
        int number = 61;
       
        
        int result = isFancy(number);
        System.out.println(result);
        }
    }

