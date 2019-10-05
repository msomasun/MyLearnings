package com.howtodoinjava.demo;

import java.io.IOException;

public class Greeter implements  java.io.Closeable,Runnable,Comparable

{
    public void performGreet(Greeting gr){
        gr.greet();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting =()-> System.out.print("greeting lamdba");
//Inteface inteface=()->{ add lines to give impl for the single method inside this interface;};
        Greeting lambdaClassGreeting =new Greeting() {
            public void greet(){
                System.out.print("greeting by annonymous class");
            }
        };
        greeter.performGreet(lambdaClassGreeting);
        greeter.performGreet(lambdaGreeting);
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public void run() {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
