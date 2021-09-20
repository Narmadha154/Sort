package com.company.sort;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the program number:");
            int number=sc.nextInt();
            switch(number) {
                case 1:
                    SelectionSort select = new SelectionSort();
                    select.doSelectionSort();
                    break;
                case 2:
                    BubbleSort bubble = new BubbleSort();
                    bubble.doBubbleSort();
                    break;
                case 3:
                    InsertionSort insert = new InsertionSort();
                    insert.doInsertionSort();
                    break;
                case 4:
                    MergeSort merge = new MergeSort();
                    merge.doMergeSort();
                    break;
                case 5:
                    QuickSort quick = new QuickSort();
                    quick.doQuickSort();
                    break;
                case 8:
                    KthSmallest small= new KthSmallest();
                    small.findKthSmallestElement();
                    break;
                case 10:
                    Anagram gram = new Anagram();
                    boolean val=gram.isAnagram();
                    System.out.println(val);
                    break;
                case 11:
                    EqualityOfArray check= new EqualityOfArray();
                    boolean value=check.checkEquality();
                    System.out.println(value);
                    break;
                case 14:
                    Closest close= new Closest();
                    close.findClosest();
                    break;
                case 15:
                    MaximizeToys maxi= new MaximizeToys();
                    maxi.toyCount();
                    break;
                case 16:
                    Bitonic bio= new Bitonic();
                    bio.doBitonic();
                    break;
                case 17:
                    Candy shop= new Candy();
                    ArrayList<Integer> list=shop.candyStore();
                    System.out.println(list);
                    break;
                default:
                    System.out.println("no program");
            }
    }
}
