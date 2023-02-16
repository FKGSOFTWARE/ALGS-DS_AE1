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