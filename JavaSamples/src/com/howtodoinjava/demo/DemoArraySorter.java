package com.howtodoinjava.demo;

public class DemoArraySorter {
    private static int[] intarray = {33,4,2,453,2,1,0};

    private static void findLast2MinBest(){

        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for(int i:intarray) {
            if (i < min) {
                secmin = min;
                min=i;
            }
            else if(i < secmin && i != min)
                secmin=i;
        }
        System.out.println(min+"\t"+secmin);

    }

//{1,4,2,4,23,45}  ans: 45 23 4
    private static void find3Largest() {
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE, third= Integer.MIN_VALUE;
        for (int i:intarray) {
            if(i>first) {
                third=second;
                second=first;
                first=i;
            } else if( i > second) {
                third=second;
                second=i;
            } else if( i > third) {
                third=i;
            }
        }
        System.out.println(first+"   "+second+"  "+third);
    }

    public static void main(String[] args){
        //int[] argarray = args;
        findLast2MinBest();
        find3Largest();
    }
}
