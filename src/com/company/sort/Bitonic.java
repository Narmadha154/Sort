package com.company.sort;

import java.util.Scanner;

public class Bitonic {
    public static void doBitonic() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int [] oddArr=new int[size/2];
        int [] evenArr=new int[(size/2)+1];
        int k=0,l=0;
        for(int i=0;i<size;i++){
            if(i%2==0){
                evenArr[k++]=arr[i];
            }
            else{
                oddArr[l++]=arr[i];
            }
        }
        for(int i=1;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(evenArr[j]>evenArr[j+1]){
                    int temp=evenArr[j];
                    evenArr[j]=evenArr[j+1];
                    evenArr[j+1]=temp;
                }
                if(oddArr[j]<oddArr[j+1]){
                    int temp=oddArr[j];
                    oddArr[j]=oddArr[j+1];
                    oddArr[j+1]=temp;
                }
            }
        }
        int s=0,t=0;
        for(int i=0;i<size;i++){
            if(i%2==0){
                arr[i]=evenArr[s++];
            }
            else{
                arr[i]=oddArr[t++];
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
