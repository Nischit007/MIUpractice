public class Question13 {
public static int answerOne(int n){
       int count=0;
       int limit=(int) Math.sqrt(n);
       
       for(int i=0;i<=limit;i++){
        for(int j=0;j<=limit;j++){
             if(i*i+j*j==n){
                count++;
              
             }
        }
       }
       System.out.println(count);
       
    
   
    if(count>=2){
        return 2;
    }else{
        return 1;
    }


}

    public static void main(String[] args) {
   int result=answerOne(50);
   System.out.println(result);
     if(result==2){
        System.out.println("can be expressed as a sum of two squares");
     }else{
        System.out.println("cannot be expressed");
     }
        
    }
}
