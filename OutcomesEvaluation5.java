//Joben D. Gabin
//BSCS 2-1
// DSA
//Outcomes Evaulation 5

import java.util.Scanner;

public class OutcomesEvaluation5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int a = 0; a < size; a++) {
            arr[a] = scanner.nextInt();
        }

        scanner.close();

        qs(arr, 0, size - 1);

        System.out.print("Sorted array: ");
        for (int b = 0; b < size; b++) {
            System.out.print(arr[b] + " ");
        }
    }

    //for quicksort
    public static void qs(int[] arr, int L, int R) {
        if (L < R) {
            int pivotIndex = p(arr, L, R);
            qs(arr, L, pivotIndex - 1);
            qs(arr, pivotIndex + 1, R);
        }
    }
    
    //for partition
    public static int p(int[] arr, int L, int R) {
        int pivot = arr[R];
        int i = L - 1;
        for (int c = L; c < R; c++) {
            if (arr[c] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[R];
        arr[R] = temp;
        return i + 1;
    }
}
