package com.company.sort;

import java.util.Scanner;

public class SelectionSort {
    public static void doSelectionSort(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            int minIdx=i;
            for(int j=i+1;j<size;j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}

