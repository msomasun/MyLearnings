package com.howtodoinjava.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
interface Calculator {
     int calculate(int a,int b);
}
interface Checker {
    void oddOrEven(int a);
}
public class lambdas {

    Function<Long,String> f= l -> l.toString();


    public static void main(String[] args) {
        demoGetQueryParamsFromList();
        doArithmatic();
        doCheckOddorEven();
    }
    private static void demoGetQueryParamsFromList(){
        List<Integer> list= new ArrayList<>();
        list.add(22);
        list.add(32);
        list.add(43);
        System.out.println(getQueryParamsFromList(list));
    }
    private static String getQueryParamsFromList(List<Integer> ids) {
       String queryParam = ids.stream().map(id -> "id=" + id).collect(Collectors.joining("&", "?", ""));
       return queryParam;
    }

    private static void doArithmatic() {
        Calculator add = ( a, b)-> (a+b);
        System.out.println(add.calculate(2,4));
    }
    private static void doCheckOddorEven() {
        Checker check=( a) -> {
            if (a % 2 ==0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };
        check.oddOrEven(4);
        check.oddOrEven(1);
    }
   }
