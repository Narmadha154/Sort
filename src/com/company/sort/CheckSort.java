package com.company.sort;

import java.util.Scanner;

public class CheckSort {
    public static boolean doBubbleSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        boolean val=false;
        if(size!=1){
            for(int i=0;i<size-1;i++){
                if(arr[i]<=arr[i+1]){
                    val=true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return true;
        }
        return val;
    }
}
