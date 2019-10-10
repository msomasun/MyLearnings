package com.howtodoinjava.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.*;

public class ArraytoList {

    static class Node {
       int data;
       Node next;
    }
    static Node insert(Node root, int d){
        Node temp = new Node();
        Node ptr;
        temp.data=d;
        temp.next=null;

        if(root == null) //this is the head element
        {
            root = temp;
        } else{
            ptr=root;
            while(ptr.next != null)
                ptr=ptr.next;
            ptr.next=temp;
        }
        return root;
    }
    static void display(Node root){

        while(root !=null){
            System.out.println(root.data);
            root = root.next;
        }
    }
    static Node arraytoList(int[] argArray){
        int l = argArray.length;
        Node root = null;
        for(int i:argArray){
            root= insert(root,i);
        }
        return root;
    }

    static boolean checkforDigit(String str) {
        boolean res=false;
        char[] ca = str.toCharArray();
        for (char c : ca) {
            if (Character.isDigit(c)) {
                res= true; break;
            }

        }
        return res;

    }
public static void main(String[] args) throws IOException {
     System.out.println("does "+"Test3"+"contains digit?"+checkforDigit("test5"));
     String[] sa = {"test","test"};
    // List<String> names= Arrays.asList(sa);

   //  Arrays.stream(sa).filter(StringBuilder::new,(sb,c)->sb.append(c))

        int[] arr = {3,4,2,54,22};
        Node newList = arraytoList(arr);
    //    display(newList);

      /*  ArrayList<String> list = new ArrayList<String>()
                .stream()
                .peek(e->System.out.println(e))
                .map(e->e.hashCode())
                .filter( e-> (e.hashCode()%2)==0).collect(Collectors.toCollection(ArrayList::new));
       */
   // IntStream.range(1,10).skip(5).forEach(System.out::print);
    System.out.println(IntStream.range(1,10).sum());
    Stream.of(2,2,2,2,2).forEach(e-> System.out.print(e));
  //  Stream.of(2,2,2,2,2).distinct().System.out::print);

    System.out.println("\nstream from inline list");
    Stream.of("muthu","prnav","praba","satya").sorted().findAny().ifPresent(System.out::println);
    System.out.println("stream from array");
    String[] names= {"muth","prnv","satya","pranav"};
    Arrays.stream(names).sorted().forEach(System.out::println);
    Arrays.stream(names).filter(x -> x.startsWith("p")).forEach(System.out::println);
    Arrays.stream(names).filter(x ->x.startsWith("p")).map(x -> x.toUpperCase()).forEach(System.out::print);

    //Stream<String> bands = Files.lines(Paths.get("C/test.txt"));
    //bands.sorted().filter(x ->x.startsWith("t")).forEach(System.out::println);

    IntSummaryStatistics istat= IntStream.of(1,2,3,4).summaryStatistics();
    System.out.println(istat);
    }
}


