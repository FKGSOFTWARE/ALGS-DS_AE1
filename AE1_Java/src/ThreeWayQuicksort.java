public class ThreeWayQuicksort{

  public static void sort(int[] array, int leftIndex, int rightIndex) {
    if (rightIndex <= leftIndex) {
      return;
    }
    int pivot = array[leftIndex];
    int low = leftIndex + 1;
    int high = rightIndex;

    int i = low;
    while (i <= high) {
      if (array[i] < pivot) {
        swap(array, i++, low++);
      } else if (array[i] > pivot) {
        swap(array, i, high--);
      } else {
        i++;
      }
    }

    swap(array, leftIndex, --low);
    sort(array, leftIndex, low - 1);
    sort(array, high + 1, rightIndex);
  }

  public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}