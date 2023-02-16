import java.util.Arrays;

public class KLargestElements {
    public static int[] findKLargestElements(int[] nums, int k) {
    if (k <= 0 || k > nums.length) {
        return null;
    }
    int[] result = new int[k];
    quickselect(nums, 0, nums.length - 1, k - 1);
    System.arraycopy(nums, 0, result, 0, k);
    return result;
    }

private static void quickselect(int[] nums, int leftIndex, int rightIndex, int kthLargest) {
    if (leftIndex == rightIndex) {
        return;
    }
    int pivotIndex = partition(nums, leftIndex, rightIndex);
    if (kthLargest == pivotIndex) {
        return;
    } else if (kthLargest < pivotIndex) {
        quickselect(nums, leftIndex, pivotIndex - 1, kthLargest);
    } else {
        quickselect(nums, pivotIndex + 1, rightIndex, kthLargest);
    }
}

private static int partition(int[] nums, int leftIndex, int rightIndex) {
    int pivotIndex = leftIndex + (int) (Math.random() * (rightIndex - leftIndex + 1));
    int pivotValue = nums[pivotIndex];
    swap(nums, pivotIndex, rightIndex);
    int storeIndex = leftIndex;
    for (int i = leftIndex; i < rightIndex; i++) {
        if (nums[i] > pivotValue) {
            swap(nums, i, storeIndex);
            storeIndex++;
        }
    }
    swap(nums, storeIndex, rightIndex);
    return storeIndex;
}

private static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int k1 = 3;
        int[] result1 = findKLargestElements(arr1, k1);
        System.out.println(Arrays.toString(result1));

        int[] arr2 = {5, 7, 2, 8, 4, 9, 1, 3, 6};
        int k2 = 2;
        int[] result2 = findKLargestElements(arr2, k2);
        System.out.println(Arrays.toString(result2));

        int[] arr3 = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            arr3[i] = i;
        }
        int k3 = 10;
        long startTime = System.currentTimeMillis();
        int[] result3 = findKLargestElements(arr3, k3);
        long endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(result3));
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }
}





