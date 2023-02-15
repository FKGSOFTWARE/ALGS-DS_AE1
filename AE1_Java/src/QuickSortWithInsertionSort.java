//imports for filereading
// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.List;

public class QuickSortWithInsertionSort {
    public static void sort(int[] arr, int k) {
        quickSortWithInsertionSortHelper(arr, 0, arr.length - 1, k);
        insertionSort(arr);
    }
    
    private static void quickSortWithInsertionSortHelper(int[] arr, int left, int right, int k) {
        if (left >= right) {
            return;
        }
        if (right - left + 1 < k) {
            return;
        }
        int pivotIndex = partition(arr, left, right);
        quickSortWithInsertionSortHelper(arr, left, pivotIndex - 1, k);
        quickSortWithInsertionSortHelper(arr, pivotIndex + 1, right, k);
    }
    
    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
    //#Simple main function to run with a simple test#
    // public static void main(String[] args) { 
    //     int[] arr = {10, 7, 8, 9, 1, 5, 6, 3, 4, 2};
    //     int k = 3;
    //     System.out.println("Original array:");
    //     printArray(arr);
    //     quickSortWithInsertionSort(arr, k);
    //     System.out.println("Sorted array:");
    //     printArray(arr);
    // }
    
    // private static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
    

    
//     public static void main(String[] args) {
//         String inputFile = "dutch.txt";
//         // if (args.length < 1) {
//         //     System.out.println("Usage: java Main <input_file>");
//         //     return;
//         // }
//         // String inputFile = args[0];
//         String outputFile = inputFile.replace(".txt", "sorted.txt");
//         int k = 3;
//         int[] arr = readArrayFromFile(inputFile);
//         quickSortWithInsertionSort(arr, k);
//         writeArrayToFile(arr, outputFile);
//         System.out.println("Sorted array has been written to " + outputFile);
//     }
    
//     private static int[] readArrayFromFile(String filename) {
//         try {
//             BufferedReader reader = new BufferedReader(new FileReader(filename));
//             List<Integer> list = new ArrayList<>();
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 list.add(Integer.parseInt(line));
//             }
//             reader.close();
//             int[] arr = new int[list.size()];
//             for (int i = 0; i < list.size(); i++) {
//                 arr[i] = list.get(i);
//             }
//             return arr;
//         } catch (IOException e) {
//             System.err.println("Error reading from file: " + filename);
//             return null;
//         }
//     }
    
    
//     private static void writeArrayToFile(int[] arr, String filename) {
//         try {
//             BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
//             for (int i = 0; i < arr.length; i++) {
//                 writer.write(Integer.toString(arr[i]));
//                 writer.write(" ");
//             }
//             writer.close();
//         } catch (IOException e) {
//             System.err.println("Error writing to file: " + filename);
//         }
//     }
    

// }
