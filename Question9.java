import java.util.Scanner;

public class Question9 {
    public static int primeCount(int start, int end) {
        
        int total = 0;
        while (start <= end) {
            int count = 0;
            for (int i = 2; i <=start; i++) {
                if (start % i == 0 ) {
                    count++;
                 

                }
            }
            if (count <2 ) {
                total++;

            }
            start++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number");
        int start = sc.nextInt();
        System.out.println("Enter the end number");
        int end = sc.nextInt();
        int result = primeCount(start, end);
        System.out.println(result);

    }
}
