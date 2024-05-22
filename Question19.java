
public class Question19 {
    public static int findPorcupineNumber(int n) {
        boolean isprime = false;
        boolean nextPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0) {
              return 0; // n is not prime
          }
      }
      if (n % 10 == 9) {
          isprime = true;
      }
        if (isprime) {
 
            while (!nextPrime) {
                n++;
                int count = 0;
                for (int i = 2; i <Math.sqrt(n) ; i++) {
 
                    if (n % i == 0) {
                        count++;
                    }
                }
                    if (count == 0) {
 
                        if (n % 10 == 9) {
 
                            return 1;
                        }
                        nextPrime = true;
                        break;
                    }
 
                }
 
            }
 
        
 
        return 0;
    }
 
    public static void main(String[] args) {
        int result = findPorcupineNumber(139);
        System.out.println(result);
    }
 
 }
 