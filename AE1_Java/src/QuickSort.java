public class QuickSort {
    public static void quickSort(int[] array) {
      recursiveQuickSort(array, 0, array.length - 1);
    }
  
    public static void recursiveQuickSort(int[] array, int left, int right) {
      int size = right - left + 1;
      if (size <= 3)
        manualSort(array, left, right);
      else {
        double median = medianOf3(array, left, right);
        int partition = partitionIt(array, left, right, median);
        recursiveQuickSort(array, left, partition - 1);
        recursiveQuickSort(array, partition + 1, right);
      }
    }
  
    public static int medianOf3(int[] array, int left, int right) {
      int center = (left + right) / 2;
  
      if (array[left] > array[center]){swap(array, left, center);}
  
      if (array[left] > array[right]){swap(array, left, right);}
  
      if (array[center] > array[right]){swap(array, center, right);}
  
      swap(array, center, right - 1);
      return array[right - 1];
    }
  
    public static void swap(int[] array, int index1, int index2) {
      int temp = array[index1];
      array[index1] = array[index2];
      array[index2] = temp;
    }
  
    public static int partitionIt(int[] array, int left, int right, double pivot) {
      int leftPtr = left;
      int rightPtr = right - 1;
  
      while (true) {
        while (array[++leftPtr] < pivot);
        while (array[--rightPtr] > pivot);
        if (leftPtr >= rightPtr)
          break;
        else
          swap(array, leftPtr, rightPtr);
      }
      swap(array, leftPtr, right - 1);
      return leftPtr;
    }
  
    public static void manualSort(int[] array, int left, int right) {
      int size = right - left + 1;
      if (size <= 1)
        return;
      if (size == 2) {
        if (array[left] > array[right])
          swap(array, left, right);
        return;
      } else {
        if (array[left] > array[right - 1])
          swap(array, left, right - 1);
        if (array[left] > array[right])
          swap(array, left, right);
        if (array[right - 1] > array[right])
          swap(array, right - 1, right);
      }
    }
}



  
