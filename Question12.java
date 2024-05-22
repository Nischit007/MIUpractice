public class Question12 {
    public static int isBean(int[] array) {
        for (int n : array) {
            if (!contains(array, n * 2) && !contains(array, n * 2 + 1) && !contains(array, n / 2)) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
    
        int[] array1 = {4, 9, 8};
        int[] array2 = {2, 2, 5, 11, 23};
  

        System.out.println(isBean(array1));
        System.out.println(isBean(array2)); 

    }
}

