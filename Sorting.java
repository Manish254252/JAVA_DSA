public class Sorting {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Bubble Sort
        // Time complexity = O(n^2)

        /*
         * for (int i = 0; i < arr.length-1; i++) {
         * for (int j = 0; j < arr.length-i-1; j++) {
         * 
         * if (arr[j]>arr[j+1])
         * {
         * int temp = arr[j];
         * arr[j] = arr[j+1];
         * arr[j+1] = temp;
         * 
         * }
         * 
         * }
         * 
         * }
         */

        // Selection Sort
        // Time Complexity = O(n^2)

        /*
         * for (int i = 0; i < arr.length-1; i++)
         * {
         * int small =i;
         * for (int j = i+1; j < arr.length; j++)
         * {
         * if (arr[small]>arr[j])
         * {
         * small=j;
         * }
         * }
         * int temp = arr[small];
         * arr[small] = arr[i];
         * arr[i] =temp;
         * 
         * 
         * }
         */

        // Insertion Sort
        // Time Complexity = O(n^2)

        for (int i = 1; i < arr.length; i++) {

            int currernt = arr[i];
            int j = i - 1;

            while (j >= 0 && currernt < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currernt;

        }

        printarr(arr);
    }
}
