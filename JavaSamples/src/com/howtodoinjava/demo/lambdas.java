package com.howtodoinjava.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class lambdas {

    Function<Long,String> f= l -> l.toString();


    public static void main(String[] args) {
        demoGetQueryParamsFromList();

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
   }
