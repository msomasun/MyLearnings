package com.howtodoinjava.demo.collection;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * This class is implementation practice of Stack data structure.
 *
 * Members:
 * unanimous class: Node class instance var - int Data,Node Next,single arg constructor()
 * List of Nodes- to add/remove/update.Top- curent top node ref.
 *
 * Push(int element)-Adds given element to the top/end of the list and updates the tail pointer.OVerflow condition
 * Pop() - returns element from the top or end of the list and removes it from the list. UnderFlow condition
 * Peep() - returns element from the end of the list but does not remove.
 * isEmpty()
 *
 * Types: Array based OR List based
 */
public class MyListStack {
    private static final int capacity = 2;
    private  int userCapacity = capacity;
    private List<Object> listNodes = new ArrayList<>(capacity);


    public void MyListStack(int capacityarg) {
        this.listNodes = new ArrayList<>(capacityarg);
        this.userCapacity=capacityarg;
    }
    public void push(int v){
       if(isFull()){
           throw new StackOverflowError("StackOverFlowError");
       }
       this.listNodes.add(v);
    }
    public Object pop() {
       if(this.listNodes.isEmpty()) {
           throw new EmptyStackException();
       }
       return this.listNodes.remove(this.listNodes.size()-1);
    }
    public Object peek(){
       return this.listNodes.get(this.listNodes.size()-1);
    }

    public int getSize(){
       return this.listNodes.size();
    }
    public int getCapacity(){
       return userCapacity;
    }
    public boolean isFull(){
       return (this.userCapacity == this.listNodes.size());
    }

    public boolean isEmpty(){
        return (0 == this.listNodes.size());
    }
}
