package com.howtodoinjava.demo.stringDemo;

import java.util.stream.Collectors;
import java.util.List;
import java.util.regex.*;
public class ConvertStringtoArray {
    public static List<Character> stringtoList(String str){
        List<Character> list = str.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
        Matcher matcher=Pattern.compile(String.valueOf('t')).matcher("TestestTtest");
        int count=0;
        while(matcher.find()) {
            count++;
        }
        System.out.println(count);
        return list;
    }

    public static boolean isVowel(char c) {
        switch(c) {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               return true;
            default:
                return false;
        }

    }

    public static boolean checkPossibility(String s1,String s2) {

        int len1 = s1.length();
        int len2 = s2.length();
        if(len1!= len2)
            return false;

        for(int i =0; i<len1;i++)
        {
            if(isVowel(s1.charAt(i)) && isVowel(s2.charAt(i)))
                continue;
            else if(!isVowel(s1.charAt(i)) && !isVowel(s2.charAt(i)))
            continue;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args){
            String in="aetxfioadou";
            for(char ch: stringtoList(in)) {
                System.out.println(ch);
            }
            int counter=0;
            for(int i=0; i<in.length()-1;i++) {
                if (isVowel(in.charAt(i)) && isVowel(in.charAt(i + 1))) {
                    counter++;
                }
            }
            System.out.println("Vowel Count::"+counter);

    }
}
