package com.company.sort;

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
                default:
                    System.out.println("no program");
            }
    }
}
