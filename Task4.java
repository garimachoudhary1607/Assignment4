import java.util.Arrays;
import java.util.Collections;

public class Task4 {

    public static void main(String args[]) {

        int[] array = {44, 66, 99, 77, 33, 22, 55};
        // sort array in ascending order
        Arrays.sort(array);
        System.out.println(" Sorted Array: " + Arrays.toString(array));
        System.out.println("length of an array: " + array.length);
        // after sorting an array in ascending order  and finding the length of an  array , we can find the second
        //largest and second smallest
        System.out.println("Second largest element in the array :" + array[5]);
        System.out.println("Second smallest element in the array :" + array[1]);
        addTwoMatrices();
        zerosToEnd();
        // a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.
        int[] a = {2, 2, 3, 3, 4, 4, 4, 11, 11, 11, 11};
        int x = a.length;
        for (int i = 0; i < x; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        removeDuplicates(a, x);
        // Print updated array
        for (int i = 0; i < x; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        //Java program to get the difference between the largest and smallest values in an array of integers.
        differenceMaxMin();
        //Java program to find the sum of the two elements of a given array which is equal to a given integer
        sumOfTwoElements();
//Java program to find the two elements from a given array of positive and negative numbers such that
// their sum is closest to zero.
        sumIsZero();
    }

    public static void addTwoMatrices() {
        // for two dimensional array
        int a[][] = {{0, 1, 2, 7}, {1, 2, 3, 9}};
        int b[][] = {{1, 2, 2, 0}, {0, 0, 0, 1}};
        //need to create third array to store the addition of both the array
        int x[][] = new int[2][4];// there are two rows and three columns
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 4; k++) {
                x[i][k] = a[i][k] + b[i][k];
                System.out.print(x[i][k] + " ");
            }
            System.out.println();
        }

    }

    //Java program to move all 0's to the end of an arra
    public static void zerosToEnd() {
        //use of Integer not int as Integer storeInteger helps in converting int into object
        // and to convert an object into int as per requirement.
        Integer zerroArray[] = {0, 0, 0, 1, 2, 77, 9, 0, 34, 87};
        Arrays.sort(zerroArray);
        System.out.println(Arrays.toString(zerroArray));
        Arrays.sort(zerroArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(zerroArray));
    }

    public static void removeDuplicates(int a[], int x) {

        int[] temp = new int[x];

        // Start traversing elements
        int j = 0;
        for (int i = 0; i < x - 1; i++)
            // If current element is equal to next element then store that current element
            if (a[i] != a[i + 1])
                temp[j++] = a[i];
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = a[x - 1];

        // Modify original array
        for (int i = 0; i < a.length; i++)
            a[i] = temp[i];

    }

    public static void differenceMaxMin() {
        int a[] = {0, 76, 4, 6, 7, -1};
        Arrays.sort(a);
        int n = a.length;
        System.out.println(Arrays.toString(a) + " length of an array: " + n);
        System.out.println("Difference of maximum and minimum numbers are: " + (a[5] - a[0]));
    }

    public static void sumOfTwoElements() {

        int a[] = {1, 2, 4, 6, 8, 5, 0};
        int sum = 6;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) == sum)
                    count++;
            }
        }
        System.out.println("Number of pairs available with the sum of two element equals to 6: " + count);
    }

    public static void sumIsZero() {
        int a[] = {2, -3, 5, -1, 8, 7, -9};
        int min;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        min = Math.abs(a[0] + a[1]);
        int sum, min1=0, min2=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                sum = Math.abs(a[i] + a[j]);
                if (sum < min) {
                    min1 = i;
                    min2 = j;
                    min = sum;

                }
            }
        }
        System.out.println("Minimum value  1:"+a[min1]);
        System.out.println("Minimum value  2:"+a[min2]);
    }
}



