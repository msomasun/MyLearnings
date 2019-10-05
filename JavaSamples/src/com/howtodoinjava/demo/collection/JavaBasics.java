package com.howtodoinjava.demo.collection;

import com.sun.deploy.util.StringUtils;
import sun.swing.StringUIClientPropertyKey;

public class JavaBasics {

    public static void main(String[] args) {

        String input="abcdddd$cba";
        System.out.println(checkPalindromeanyOrder(input));

    }
    public static boolean checkPalindromeanyOrder(String in){

        char[] chars = in.toCharArray();
        int i=0,j=0;
        boolean skipchar=true;
        System.out.println("Array Length is= "+chars.length);
        System.out.println("going to traverse array for "+chars.length/2 +"times only");

        for(i=0; i< (chars.length);i++) {
            System.out.println("entering outer loop at "+ i);

            if('\0' != (chars[i])) {
                System.out.println("entering inner loop at "+i);

                for(j= i+1; j< chars.length; j++) {
                    System.out.println("Inside  inner loop at "+j);

                    if(chars[i] == chars[j]) {
                        System.out.println("char matched"+ Character.toString(chars[j]));
                        chars[j]= '\0';
                        break;

                    } else if( j==chars.length && skipchar) {
                        skipchar=false;
                        break;
                    }else if(j==chars.length-1)
                        return false;
                }
            }
        }
        return true;
    }
}
