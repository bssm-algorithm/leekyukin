package com.java.firstTry.day02;

import java.util.Scanner;

public class MergeImplement {
    static int[] sorted = new int[1000000];

    static void mergeSort(int[] arr, int l, int r) {
        int m;
        if (l < r) {
            m = (l+r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;


        while(i <= mid && j <= right) {
            if (arr[i] < arr[j])
                sorted[k++] = arr[i++];
            else
                sorted[k++] = arr[j++];
        }
        if (i > mid) {
            for (l = j; l <= right; l++)
                    sorted[k++] = arr[l];
        }
        else {
            for (l = i; l <= mid; l++)
                sorted[k++] = arr[l];
        }
        for (l = left; l <= right; l++)
            arr[l] = sorted[l];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = scan.nextInt();

        mergeSort(arr, 0, N-1);
        for (int num : arr)
            System.out.println(num);
    }
}
