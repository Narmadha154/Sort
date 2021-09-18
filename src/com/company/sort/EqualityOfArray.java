package com.company.sort;

import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArray {
    public static boolean checkEquality() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array1:");
        int size = sc.nextInt();
        System.out.println("Enter the array1 elements:");
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array2 elements:");
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<size;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
