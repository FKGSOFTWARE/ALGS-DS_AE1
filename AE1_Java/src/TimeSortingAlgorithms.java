import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TimeSortingAlgorithms {
    
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
    
    int[] arr = null;
    int count;
    String filePrepend = "C:/Users/fkgde/OneDrive - University of Glasgow/Desktop/ALGS+DS/AE1 Fix/AE1_2/src/";
    
    String fileAppend;
    String filename;
    

    //quick
    fileAppend = "int1000.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    long startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


    fileAppend = "int20k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



    fileAppend = "int500k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



    fileAppend = "dutch.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


    fileAppend = "intBig.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("QuickSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    QuickSort.quickSort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         //quick
//         int k = 4;
//         System.out.print("\n");
//         fileAppend = "int1000.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         QuickSortWithInsertionSort.sort(arr, k);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

        
//         fileAppend = "int20k.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         QuickSortWithInsertionSort.sort(arr, k);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


//         fileAppend = "int500k.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         QuickSortWithInsertionSort.sort(arr, k);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


//         fileAppend = "dutch.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         QuickSortWithInsertionSort.sort(arr, k);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");
    

//         fileAppend = "intBig.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("QuickSortWithInsertionSort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         QuickSortWithInsertionSort.sort(arr, k);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

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
        System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

        
        fileAppend = "int20k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



        fileAppend = "int500k.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



        fileAppend = "dutch.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

    

        fileAppend = "intBig.txt";
        filename = filePrepend + fileAppend;
        arr = readArray(filename);
        count = readArrayNoLines(filename);
        System.out.print("QuickSortMedianOfThree - " + fileAppend + ": ");
        startTime = System.nanoTime();
        QuickSortMedianOfThree.quickSort(arr);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//         //3-way
//         System.out.print("\n");
//         fileAppend = "int1000.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

        
//         fileAppend = "int20k.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


//         fileAppend = "int500k.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


//         fileAppend = "dutch.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");
    

//         fileAppend = "intBig.txt";
//         filename = filePrepend + fileAppend;
//         arr = readArray(filename);
//         count = readArrayNoLines(filename);
//         System.out.print("ThreeWayQuicksort - " + fileAppend + ": ");
//         startTime = System.nanoTime();
//         ThreeWayQuicksort.sort(arr, 0, arr.length - 1);
//         endTime = System.nanoTime();
//         elapsedTime = endTime - startTime;
//         System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");
    
//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     //insertion
//     System.out.print("\n");
//     fileAppend = "int1000.txt";
//     filename = filePrepend + fileAppend;
//     arr = readArray(filename);
//     count = readArrayNoLines(filename);
//     System.out.print("InsertionSort - " + fileAppend + ": ");
//     startTime = System.nanoTime();
//     InsertionSort.sort(arr);
//     endTime = System.nanoTime();
//     elapsedTime = endTime - startTime;
//     System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

//     fileAppend = "int20k.txt";
//     filename = filePrepend + fileAppend;
//     arr = readArray(filename);
//     count = readArrayNoLines(filename);
//     System.out.print("InsertionSort - " + fileAppend + ": ");
//     startTime = System.nanoTime();
//     InsertionSort.sort(arr);
//     endTime = System.nanoTime();
//     elapsedTime = endTime - startTime;
//     System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



//     fileAppend = "int500k.txt";
//     filename = filePrepend + fileAppend;
//     arr = readArray(filename);
//     count = readArrayNoLines(filename);
//     System.out.print("InsertionSort - " + fileAppend + ": ");
//     startTime = System.nanoTime();
//     InsertionSort.sort(arr);
//     endTime = System.nanoTime();
//     elapsedTime = endTime - startTime;
//     System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



//     fileAppend = "dutch.txt";
//     filename = filePrepend + fileAppend;
//     arr = readArray(filename);
//     count = readArrayNoLines(filename);
//     System.out.print("InsertionSort - " + fileAppend + ": ");
//     startTime = System.nanoTime();
//     InsertionSort.sort(arr);
//     endTime = System.nanoTime();
//     elapsedTime = endTime - startTime;
//     System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



//     fileAppend = "intBig.txt";
//     filename = filePrepend + fileAppend;
//     arr = readArray(filename);
//     count = readArrayNoLines(filename);
//     System.out.print("InsertionSort - " + fileAppend + ": ");
//     startTime = System.nanoTime();
//     InsertionSort.sort(arr);
//     endTime = System.nanoTime();
//     elapsedTime = endTime - startTime;
//     System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


    

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
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");

    fileAppend = "int20k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


    fileAppend = "int500k.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



    fileAppend = "dutch.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");



    fileAppend = "intBig.txt";
    filename = filePrepend + fileAppend;
    arr = readArray(filename);
    count = readArrayNoLines(filename);
    System.out.print("MergeSort - " + fileAppend + ": ");
    startTime = System.nanoTime();
    MergeSort.sort(arr);
    endTime = System.nanoTime();
    elapsedTime = endTime - startTime;
    System.out.println("Elapsed time in nanoseconds: " + elapsedTime + ", counting " + count + " elements.");


}
}
