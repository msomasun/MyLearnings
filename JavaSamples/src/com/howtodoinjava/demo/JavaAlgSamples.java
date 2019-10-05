package com.howtodoinjava.demo;

public class JavaAlgSamples {

    public static void main(String[] args) {
        printPrimeNos(20);
        printFibnSeries(10);
        System.out.println(printNfact(10));

    }

    static void printPrimeNos(int size) {
        for (int i = 1; i < size; i++) {
            if (checkforPrime(i))
                System.out.println(i);
        }
    }

    static boolean checkforPrime(int n) {
        for (int j = n - 1; j >= 2; j--) {  //Skip number 1 here.we expect this tobe always divisible.
            if (n % j == 0)
                return false;
            else
                continue;
        }
        return true;
    }

    static void printFibnSeriesRec(int n) {
        System.out.println("    ");
        int sum = 0;
      //  for (int i = 0; i < n; i++) {
               System.out.print(sum + "\t");
        }

    static void printFibnSeries(int n) {
        System.out.println("Printing fibonocci series ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.print(sum + "\t");
        }
    }

    static void printFibnociExceptPrime(int n) {
        System.out.println("Printing fibonocci series ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.print(sum + "\t");
        }
    }

    static int printNfact(int n) {
    if(n <0)
        return -1;
    if(n==1)
        return 1;
    return (n * printNfact(n-1));
    }
}
