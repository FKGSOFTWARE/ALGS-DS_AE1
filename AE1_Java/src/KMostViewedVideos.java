import java.util.Arrays;
import java.util.PriorityQueue;

public class KMostViewedVideos {
    public static int[] getKMostViewedVideos(int[] views, int k) {
        if(k == 0) return null;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int view : views) {
            if (heap.size() < k) {
                heap.add(view);
            } else if (view > heap.peek()) {
                heap.poll();
                heap.add(view);
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;
    }





    public static void main(String[] args) {
        int[] views1 = {10, 50, 20, 30, 40};
        int[] kMostViewed1 = getKMostViewedVideos(views1, 3);
        System.out.println(Arrays.toString(kMostViewed1)); // should print [50, 40, 30]
    
        int[] views2 = {5, 2, 1, 6, 4, 3};
        int[] kMostViewed2 = getKMostViewedVideos(views2, 2);
        System.out.println(Arrays.toString(kMostViewed2)); // should print [6, 5]
    
        int[] views3 = {100, 200, 300, 400, 500};
        int[] kMostViewed3 = getKMostViewedVideos(views3, 5);
        System.out.println(Arrays.toString(kMostViewed3)); // should print [500, 400, 300, 200, 100]
    
        int[] views4 = {10, 20, 30, 40, 50};
        int[] kMostViewed4 = getKMostViewedVideos(views4, 1);
        System.out.println(Arrays.toString(kMostViewed4)); // should print [50]
    
        int[] views5 = {5, 2, 1, 6, 4, 3};
        int[] kMostViewed5 = getKMostViewedVideos(views5, 0);
        System.out.println(Arrays.toString(kMostViewed5)); // should print []

        int[] views6 = {10, 50, 20, 30, 40, 15, 25, 35, 45, 60, 70, 80, 55, 65, 75, 90, 100};
        int[] kMostViewed6 = getKMostViewedVideos(views6, 5);
        System.out.println(Arrays.toString(kMostViewed6)); // should print [100, 90, 80, 75, 70]

        int[] views7 = {5, 2, 1, 6, 4, 3, 7, 8, 9, 10, 12, 11, 15, 13, 14, 18, 16, 17, 20, 19};
        int[] kMostViewed7 = getKMostViewedVideos(views7, 3);
        System.out.println(Arrays.toString(kMostViewed7)); // should print [20, 19, 18]

        int[] views8 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500};
        int[] kMostViewed8 = getKMostViewedVideos(views8, 5);
        System.out.println(Arrays.toString(kMostViewed8)); // should print [1500, 1400, 1300, 1200, 1100]

        int[] views9 = new int[1000000];
        for (int i = 0; i < views9.length; i++) {
            views9[i] = i;
        }
        int[] kMostViewed9 = getKMostViewedVideos(views9, 10);
        System.out.println(Arrays.toString(kMostViewed9)); // should print [999990, 999991, 999992, 999993, 999994, 999995, 999996, 999997, 999998, 999999]

        int[] views10 = new int[10000000];
        for (int i = 0; i < views10.length; i++) {
            views10[i] = views1.length - i;
        }
        int[] kMostViewed10 = getKMostViewedVideos(views10, 100);
        System.out.println(Arrays.toString(kMostViewed10)); // should print [10000000, 9999999, ..., 9999901]

    }   
}

