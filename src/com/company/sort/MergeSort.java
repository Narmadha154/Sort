package com.company.sort;
import java.util.Scanner;
public class MergeSort {
    public static void mSort(int [] a,int i,int j){
        if(i<j){
            int mid=(i+j)/2;
            mSort(a,i,mid);
            mSort(a,mid+1,j);
            merge(a,i,mid,j);
        }
    }
    public static void merge(int [] arr,int beg,int mid,int end){
        int l = mid - beg + 1;
        int r = end - mid;
        int LeftArray[] = new int [l];
        int RightArray[] = new int [r];
        for (int i=0; i<l; ++i) {
            LeftArray[i] = arr[beg + i];
        }
        for (int j=0; j<r; ++j) {
            RightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = beg;
        while (i<l&&j<r)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<l)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j<r)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
           /* int i=low;
        int j=mid+1;
        int k=low;
        int [] b=new int [a.length];
        while(i<=mid&&j<=high) {
            if (a[i] <a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
                k++;
            while (i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }
            while (j <= high) {
                b[k] = a[j];
                j++;
                k++;
            }
        }*/
    }
    public static void doMergeSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        mSort(arr,0, size-1);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
