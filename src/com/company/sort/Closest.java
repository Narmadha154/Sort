package com.company.sort;

import java.util.Arrays;
import java.util.Scanner;

public class Closest {
    public static void findClosest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int left=0,right=size-1;
        int previousSum=0;
        while(left<right){
            if(Math.abs(arr[left]+arr[right])<previousSum){
                previousSum=arr[left]+arr[right];
            }
            if(previousSum<0){
                left++;
            }
            if(previousSum>0){
                right--;
            }
        }
        System.out.println(previousSum);
    }
}
