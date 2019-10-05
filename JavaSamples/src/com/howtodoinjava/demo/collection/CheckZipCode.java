package com.howtodoinjava.demo.collection;

import com.sun.deploy.util.StringUtils;
import java.lang.*;

public class CheckZipCode {

    public static void main(String[] args) {

        String input = "1243+1232";
        System.out.println(ValidateZipcode(input));

    }


    private static String ValidateZipcode(String in) {

        int result = 0;
        String zipcode = in;


        if (zipcode.isEmpty() || zipcode.length() < 5) {
            zipcode = "";

        } else {
            zipcode = zipcode.substring(0, 5);
            if(Integer.parseInt(zipcode) == 0) {
                zipcode = "";
            }
         }

        return zipcode;
    }
}
