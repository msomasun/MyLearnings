package com.howtodoinjava.demo;

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
public static void main(String[] args){
        int[] arr = {3,4,2,54,22};
        Node newList = arraytoList(arr);
        display(newList);
}
}


