public class Runner {
    public static void main(String[] args) {
        int[] intArr = InPlaceSorts.randIntArr(5);
        int[] copyArr1 = InPlaceSorts.copyIntArray(intArr);
        double[] doubleArr = InPlaceSorts.randDoubleArr(5);
        double[] copyArr2 = InPlaceSorts.copyDoubleArray(doubleArr);
        String[] stringArr = InPlaceSorts.randStringArr(5,5);
        String[] copyArr3 = InPlaceSorts.copyStringArray(stringArr);


        System.out.println("Bubble Sort");
        System.out.println("Before: ");
        for (String str:stringArr) {
            System.out.print(str + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        InPlaceSorts.bubbleSort(copyArr3);
        time = System.nanoTime() - time;
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        for (String str:copyArr3) {
            System.out.print(str + " ");
            System.out.println();
        }
        if (!InPlaceSorts.isSorted(copyArr3) && !InPlaceSorts.checkSum(stringArr, copyArr3)) {
            System.out.println("Something went wrong in the sorting method that the strings are not correctly sorted and there are different strings within your previous array and the array after the sorting method!");
        }
        else if (!InPlaceSorts.isSorted(copyArr3) && InPlaceSorts.checkSum(stringArr, copyArr3)) {
            System.out.println("All of your strings within your array are the same as before but something went wrong in your sorting method that they are not correctly sorted!");
        }
        else if (InPlaceSorts.isSorted(copyArr3) && !InPlaceSorts.checkSum(stringArr, copyArr3)) {
            System.out.println("All of your strings are correctly sorted but something went wrong in your sorting method that there are different strings within your previous array and the array after the sorting method!");
        }
        else {
            System.out.println("All of your strings are correctly sorted and contain all of the same strings within the previous array and the array after the sorting method!");
        }
        System.out.println("Time taken: " + time + " nanoseconds");
        System.out.println();

        System.out.println("Selection Sort");
        System.out.println("Before: ");
        for (double doub:doubleArr) {
            System.out.print(doub + " ");
            System.out.println();
        }
        long value = System.nanoTime();
        InPlaceSorts.selectionSort(copyArr2);
        value = System.nanoTime() - value;
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        for (double doub:copyArr2) {
            System.out.print(doub + " ");
            System.out.println();
        }
        if (!InPlaceSorts.isSorted(copyArr2) && !InPlaceSorts.checkSum(doubleArr, copyArr2)) {
            System.out.println("Something went wrong in the sorting method that the numbers are not correctly sorted and there are different numbers within your previous array and the array after the sorting method!");
        }
        else if (!InPlaceSorts.isSorted(copyArr2) && InPlaceSorts.checkSum(doubleArr, copyArr2)) {
            System.out.println("All of your numbers within your array are the same as before but something went wrong in your sorting method that they are not correctly sorted!");
        }
        else if (InPlaceSorts.isSorted(copyArr2) && !InPlaceSorts.checkSum(doubleArr, copyArr2)) {
            System.out.println("All of your numbers are correctly sorted but something went wrong in your sorting method that there are different numbers within your previous array and the array after the sorting method!");
        }
        else {
            System.out.println("All of your numbers are correctly sorted and contain all of the same numbers within the previous array and the array after the sorting method!");
        }
        System.out.println("Time taken: " + value + " nanoseconds");
        System.out.println();

        System.out.println("Insertion Sort");
        System.out.println("Before: ");
        for (int num:intArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long amount = System.nanoTime();
        InPlaceSorts.insertionSort(copyArr1);
        amount = System.nanoTime() - amount;
        System.out.println();
        System.out.print("After: ");
        System.out.println();
        for (int num:copyArr1) {
            System.out.print(num + " ");
            System.out.println();
        }
        if (!InPlaceSorts.isSorted(copyArr1) && !InPlaceSorts.checkSum(intArr, copyArr1)) {
            System.out.println("Something went wrong in the sorting method that the numbers are not correctly sorted and there are different numbers within your previous array and the array after the sorting method!");
        }
        else if (!InPlaceSorts.isSorted(copyArr1) && InPlaceSorts.checkSum(intArr, copyArr1)) {
            System.out.println("All of your numbers within your array are the same as before but something went wrong in your sorting method that they are not correctly sorted!");
        }
        else if (InPlaceSorts.isSorted(copyArr1) && !InPlaceSorts.checkSum(intArr, copyArr1)) {
            System.out.println("All of your numbers are correctly sorted but something went wrong in your sorting method that there are different numbers within your previous array and the array after the sorting method!");
        }
        else {
            System.out.println("All of your numbers are correctly sorted and contain all of the same numbers within the previous array and the array after the sorting method!");
        }
        System.out.println("Time taken: " + amount + " nanoseconds");

    }

}