import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeSortingAlgorithms {
    public static int[] arr = null;
    public static int count;
    public static String filePrepend = "C:/Users/fkgde/Repos/ALG+DS/AE1/ALGS-DS_AE1/AE1_Java/src/";
    public static String fileAppend;
    public static String filename;
    public static String[] fileNames = {"int1000.txt", "int20k.txt", "int500k.txt", "dutch.txt", "intBig.txt"};
    public static long startTime;
    public static long endTime;
    public static long elapsedTime;

    // public static void arrayTestRunner(Object function) throws FileNotFoundException{
    //     for (String fileAppend : fileNames){
    //         filename = filePrepend + fileAppend;
    //         arr = readArray(filename);
    //         count = readArrayNoLines(filename);
    //         System.out.print("QuickSort - " + fileAppend + ": ");
    //         startTime = System.nanoTime();
    //         // QuickSort.quickSort(arr);
    //         function;
    //         endTime = System.nanoTime();
    //         elapsedTime = endTime - startTime;
    //         System.out.println(elapsedTime + "ns, with " + count + " elements.");
    //     }
        
    // };


    public static int[] readArray(String filename) throws FileNotFoundException {
        // Open the file using a Scanner
        Scanner scanner = new Scanner(new File(filename));
        
        // Count the number of lines in the file to determine the size of the array
        int count = 0;
        while (scanner.hasNextLine()) {
            count++;
            scanner.nextLine();
        }
        scanner.close();
        
        // Create the array with the determined size
        int[] arr = new int[count];
        
        // Open the file again and read integers into the array
        scanner = new Scanner(new File(filename));
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        return arr;
    }

    public static int readArrayNoLines(String filename) throws FileNotFoundException{
        // Open the file using a Scanner
        Scanner scanner = new Scanner(new File(filename));
        
        // Count the number of lines in the file to determine the size of the array
        int count = 0;
        while (scanner.hasNextLine()) {
            count++;
            scanner.nextLine();
        }
        scanner.close();
        return count;
    }



public static void main(String[] args) throws FileNotFoundException {
    

    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //quick
    fileAppend = "int1000.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int20k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int500k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "dutch.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "intBig.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         //quick w/ insertsort
        int k = 4;
        System.out.print("\n");
        fileAppend = "int1000.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortWithInsertionSort.sort(arr, k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int20k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortWithInsertionSort.sort(arr, k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int500k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortWithInsertionSort.sort(arr, k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "dutch.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortWithInsertionSort.sort(arr, k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");
    
        fileAppend = "intBig.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortWithInsertionSort.sort(arr, k);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         //median 3
        System.out.print("\n");
        fileAppend = "int1000.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int20k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int500k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "dutch.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "intBig.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         //3-way
        System.out.print("\n");
        fileAppend = "int1000.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int20k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "int500k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");

        fileAppend = "dutch.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");
    
        fileAppend = "intBig.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
        startTime = System.nanoTime();
        ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime + "ns, with " + count + " elements.");
    
//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     //insertion
    System.out.print("\n");
    fileAppend = "int1000.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("InsertionSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    InsertionSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int20k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("InsertionSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    InsertionSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int500k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("InsertionSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    InsertionSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "dutch.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("InsertionSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    InsertionSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "intBig.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("InsertionSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    InsertionSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //MergeSort
    System.out.print("\n");
    fileAppend = "int1000.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int20k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "int500k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "dutch.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    fileAppend = "intBig.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println(elapsedTime + "ns, with " + count + " elements.");

    }
}
