public class Runner {
    public static void main(String[] args) {
        int[] testArr = SortingUtil.randIntArr(10);
        int[] finalArr = testArr;
        System.out.print("Before: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        long time = System.nanoTime();
        SortingUtil.bubbleSort(finalArr);
        time = System.nanoTime() - time;
        System.out.print("After: ");
        System.out.println();
        for (int num:testArr) {
            System.out.print(num + " ");
            System.out.println();
        }
        if (!SortingUtil.isSorted(testArr) && !SortingUtil.checkSum(finalArr, testArr)) {
            System.out.println("Something went wrong in the sorting method that the numbers are not correctly sorted and there are different numbers within your previous array and the array after the sorting method!");
        }
        else if (!SortingUtil.isSorted(testArr) && SortingUtil.checkSum(finalArr, testArr)) {
            System.out.println("All of your numbers within your array are the same as before but something went wrong in your sorting method that they are not correctly sorted!");
        }
        else if (SortingUtil.isSorted(testArr) && !SortingUtil.checkSum(finalArr, testArr)) {
            System.out.println("All of your numbers are correctly sorted but something went wrong in your sorting method that there are different numbers within your previous array and the array after the sorting method!");
        }
        else {
            System.out.println("All of your numbers are correctly sorted and contain all of the same numbers within the previous array and the array after the sorting method!");
        }
        System.out.println("Time taken: " + time + " nanoseconds");
    }
}