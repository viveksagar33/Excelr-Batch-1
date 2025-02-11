public class Demo074 {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {5, 2, 9, 1, 5, 6};
        
        // Print original array
        System.out.println("Original array:");
        printArray(numbers);
        
        // Sort the array using Bubble Sort
        bubbleSort(numbers);
        
        // Print sorted array
        System.out.println("Sorted array:");
        printArray(numbers);
    }

    // Method to sort an array using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}