package com.company.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Candy {
   public static ArrayList<Integer> candyStore(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an array:");
       int N = sc.nextInt();
       System.out.println("Enter the array elements:");
       int[] candies = new int[N];
       for (int i = 0; i < N; i++) {
           candies[i] = sc.nextInt();
       }
       System.out.println("Enter the k value:");
       int K = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        int minCost=0,maxCost=0,index=0,n=0;
        Arrays.sort(candies);
        for(int i=0;i<N;i++){
            minCost+=candies[i];
            N=N-K;
        }
        list.add(minCost);
        N=candies.length;
        for(int i=N-1;i>=index;i--){
            maxCost+=candies[i];
            index+=K;
        }
        list.add(maxCost);
        return list;
    }
}
