package com.howtodoinjava.demo;

class FibonacciExample2{
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        System.out.print(n1+" "+n2);//printing 0 and 1

        if((count-2)>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }

    static void checkString(){
        String a="hello";
        String b="hello";
        String c= new String("hello");
        String d=c;
        String e=new String("hello");
        System.out.println("=="+a==b);
        System.out.println("a.equals b?"+a.equals(b));
        System.out.println("a=c "+a==c);
        System.out.println("c equals d?"+ c.equals(d));
        System.out.println("c=e "+c==e);
        System.out.println("c equals e"+c.equals(e));
    }
    public static void main(String args[]){
        int count=10;
      //  printFibonacci(count);//n-2 because 2 numbers are already printed
        checkString();
    }
}
