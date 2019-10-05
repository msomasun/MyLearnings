package com.howtodoinjava.demo.collection;

import java.util.Date;

public class Movie implements Comparable<Movie>{

 private String  name;
 private int release;
 private double rating;

 Movie(String name,int rel, double rate) {
     this.name= name;
     this.release= rel;
     this.rating=rate;
 }
 public String getName(){
     return this.name;
 }
 public double getRating(){
     return this.rating;
 }
 public int getRelease(){
     return this.release;
 }

    @Override
    public int compareTo(Movie o) {
        return this.release- o.release;
    }
}
