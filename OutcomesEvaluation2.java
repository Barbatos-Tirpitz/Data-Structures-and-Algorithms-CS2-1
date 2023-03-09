import java.util.Scanner;

public class OutcomesEvaluation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int a = 0; a < size; a++) {
            arr[a] = scanner.nextInt();
        }
        System.out.println("Unordered Array: ");
        printArray(arr);

        // Bubble Sort
        int[] bubbleSortedArray = bubbleSort(arr.clone());
        System.out.println("Bubble Sorted Array: ");
        printArray(bubbleSortedArray);
        System.out.println("Number of iterations in Bubble Sort: " + getIterations());

        // Insertion Sort
        int[] insertionSortedArray = insertionSort(arr.clone());
        System.out.println("Insertion Sorted Array: ");
        printArray(insertionSortedArray);
        System.out.println("Number of iterations in Insertion Sort: " + getIterations());

        scanner.close();
    }

    private static int iterations = 0;

    private static int getIterations() {
        int count = iterations;
        iterations = 0;
        return count;
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int b = 0; b < n - 1; b++) {
            for (int c = 0; c < n - b - 1; c++) {
                iterations++;
                if (arr[c] > arr[c + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[c];
                    arr[c] = arr[c + 1];
                    arr[c + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int ab = 1; ab < n; ++ab) {
            int abcd = arr[ab];
            int ac = ab - 1;

          
            while (ac >= 0 && arr[ac] > abcd) {
                iterations++;
                arr[ac + 1] = arr[ac];
                ac = ac - 1;
            }
            arr[ac + 1] = abcd;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for (int abc = 0; abc < arr.length; abc++) {
            System.out.print(arr[abc] + " ");
        }
        System.out.println();
    }
}
