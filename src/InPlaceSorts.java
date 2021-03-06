public class InPlaceSorts {

    public static void swap(int[] list1, int i, int j) {
        int temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void swap(double[] list1, int i, int j) {
        double temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void swap(String[] list1, int i, int j) {
        String temp = list1[i];
        list1[i] = list1[j];
        list1[j] = temp;
    }

    public static void bubbleSort(String[] list1) {
        int swaps = -1;
        while (swaps != 0) {
            swaps = 0;
            for (int i = 0; i < list1.length - 1; i++) {
                if (list1[i].compareTo(list1[i+1]) > 0) {
                    swap(list1, i, i + 1);
                    swaps++;
                }
            }
        }
    }

    public static void selectionSort(double[] list1) {
        int minPos = 0;
        for (int curPos = 0; curPos < list1.length-1; curPos++) {
            double minVal = list1[curPos];
            minPos = curPos;
            for (int i = curPos + 1; i < list1.length-1; i++) {
                if (list1[i] < minVal) {
                    minVal = list1[i];
                }
            }
            swap(list1, curPos, minPos);
        }
    }

    public static void insertionSort(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list1[i] < list1[j]) {
                    swap(list1, i, j);
                }
                else {
                    j = 0;
                }
            }
        }
    }

    public static int[] randIntArr(int count) {
        int[] randomArr = new int[count];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = (int) (Math.random() * 10001);
        }
        return randomArr;
    }

    public static double[] randDoubleArr(int count) {
        double[] randomArr = new double[count];
        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = Math.random() * 10001;
        }
        return randomArr;
    }

    public static String[] randStringArr(int num, int length) {
        String[] randomArr = new String[num];
        while (num > 0) {
            int i = 0;
            String s = "";
            while (i < length) {
                char c = (char)((Math.random() * 26) + 97);
                s = s + c;
                i++;
            }
            num--;
            randomArr[num] = s;
        }
        return randomArr;
    }

    public static int[] copyIntArray(int[] list1) {
        int[] list2 = new int[list1.length];
        for (int i = 0; i < list1.length; i++) {
            list2[i] = list1[i];
        }
        return list2;
    }

    public static double[] copyDoubleArray(double[] list1) {
        double[] list2 = new double[list1.length];
        for (int i = 0; i < list1.length; i++) {
            list2[i] = list1[i];
        }
        return list2;
    }

    public static String[] copyStringArray(String[] list1) {
        String[] list2 = new String[list1.length];
        for (int i = 0; i < list1.length; i++) {
            list2[i] = list1[i];
        }
        return list2;
    }

    public static boolean isSorted(int[] list1) {
        for (int i = 0; i < list1.length - 1; i++) {
            if (list1[i] > list1[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(double[] list1) {
        for (int i = 0; i < list1.length - 1; i++) {
            if (list1[i] > list1[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(String[] list1) {
        for (int i = 0; i < list1.length - 1; i++) {
            if (list1[i].compareTo(list1[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int[] before, int[] after) {
        int sum1 = 0;
        int sum2 = 0;
        if (before.length != after.length) {
            return false;
        } else {
            for (int i = 0; i < before.length; i++) {
                sum1 += before[i];
                sum2 += after[i];
            }
            if (sum1 != sum2) {
                return false;
            }
            return true;
        }
    }

    public static boolean checkSum(double[] before, double[] after) {
        double sum1 = 0;
        double sum2 = 0;
        if (before.length != after.length) {
            return false;
        } else {
            for (int i = 0; i < before.length; i++) {
                sum1 += before[i];
                sum2 += after[i];
            }
            if (sum1 != sum2) {
                return false;
            }
            return true;
        }
    }

    public static boolean checkSum(String[] before, String[] after) {
        if (before.length != after.length) {
            return false;
        }
        int sum1 = 0;
        int x = 0;
        int sum2 = 0;
        int y = 0;
        for (int i = 0; i < before.length; i++ ) {
            for (int j = 0; j < before[i].length(); j++) {
                x += (int) before[i].charAt(j);
                sum1 += x;
            }
        }
        for (int n = 0; n < after.length; n++) {
            for (int m = 0; m < after[n].length(); m++) {
                y += (int) after[n].charAt(m);
                sum2 += y;
            }
        }
        if (sum1 != sum2) {
            return false;
        }
        return true;
    }

}