// import java.util.Arrays;

public class ThreeWayQuicksort{
  // public static void main(String[] args) {
  //   int[] array = {5, 8, 1, 3, 7, 9, 2,77,3,1234,5,3,12,54,6,7754,2,3,45,7,210};
  //   System.out.println("Before sorting: " + Arrays.toString(array));
  //   sort(array, 0, array.length - 1);
  //   System.out.println("After sorting: " + Arrays.toString(array));
  // }

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