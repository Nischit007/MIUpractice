


import java.util.Scanner;

public class Question3 {
    public static  char[] f(char[] a, int start, int len){
        if(start< 0 || start >=a.length || len<=0 || start+len>a.length){
            System.out.println("Invaild start index or length");
            return null;
        }
        char[] result=new char[len];
        for(int i=0;i<len;i++){
            result[i]=a[start+i];
        }
        return result;

    }
    

    public static void main(String[] args) {
             
        int size = 5; 
        char[] charArray = new char[size]; 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter " + size + " characters:");

        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.nextLine().charAt(0);
        }
        System.out.println("Enter start index:");
        int start = scanner.nextInt();

        System.out.println("Enter length:");
        int length = scanner.nextInt();

        char[] result = f(charArray, start, length);

        if(result!=null){
            System.out.println("result :");
            for(char c:result){
                System.out.print(c + " ");
            }
            System.out.println();
        }
         

        

        
        

    }
    
}

