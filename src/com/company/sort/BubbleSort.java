package com.company.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void doBubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
