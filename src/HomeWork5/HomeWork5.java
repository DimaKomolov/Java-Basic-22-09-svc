package HomeWork5;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        fillRay(array);
        long startTime = System.currentTimeMillis();
        selectSort (array);
        long endTime = System.currentTimeMillis();
        System.out.println("SelectSort выполнялся" + " " + (endTime - startTime));
        int[] array2 = new int[10000];
        fillRay(array2);
        startTime = System.currentTimeMillis();
        Arrays.sort(array2);
        endTime = System.currentTimeMillis();
        System.out.println("FillRay выполнялся" + " " + (endTime - startTime));
        //printArray(array);
    }
    private static void selectSort(int[]array){
        boolean sorted = false;
        while (!sorted) {
            sorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    sorted = false;
                }
            }
            //printArray(array);
        }
    }
    private static void printArray(int[] arr) {
        System.out.println(" ");
        for (int i = 0;i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }
    private static void fillRay(int[] array) {
    for (int i = 0;i< array.length ;i++){
        array[i] = new Random().nextInt();
    }
    }
}
