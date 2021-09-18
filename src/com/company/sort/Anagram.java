package com.company.sort;

import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.next();
        System.out.println("Enter the second string:");
        String str2=sc.next();
        int [] freq1=new int[256];
        int [] freq2=new int[256];
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            for(int i=0;i<str1.length();i++){
                freq1[str1.charAt(i)]++;
                freq2[str2.charAt(i)]++;
            }
        }
        for(int i=0;i<256;i++){
            if(freq1[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}
