package com.company.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeToys {
   public static void toyCount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value:");
        int k = sc.nextInt();
        int count=0,sum=0;
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            if(sum+arr[i]<=k){
                sum+=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }

}
