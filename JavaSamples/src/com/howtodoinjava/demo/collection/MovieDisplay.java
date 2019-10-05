package com.howtodoinjava.demo.collection;
import java.util.*;

 class ComparebyRating implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        if(m1.getRating() == m2.getRating()) return 0;
        else{
            return (m1.getRating() > m2.getRating())?1:-1;
        }
     }
 }
class ComparebyName implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
public class MovieDisplay {
    public static void main(String[] args) {
        ArrayList<Movie> movieArray = new ArrayList<Movie>();

        movieArray.add(new Movie("Friends",1999,4.8));
        movieArray.add(new Movie("Guna",1996,4.5));
        movieArray.add(new Movie("VeerZaara",1993,4.8));
        movieArray.add(new Movie("Kadal",2013,2.8));
        movieArray.add(new Movie("Kadhal",2005,4.8));

        Collections.sort(movieArray);
        for (Movie m: movieArray) {
            System.out.println(m.getName() +  "\t"+ m.getRelease()+ "\t"+m.getRating());
        }
        System.out.println("by Name");
        Collections.sort(movieArray,new ComparebyName());
        for (Movie m: movieArray) {
            System.out.println(m.getName() +  "\t"+ m.getRelease()+ "\t"+m.getRating());
        }
        System.out.println("by Rating");
        Collections.sort(movieArray,new ComparebyRating());
        for (Movie m: movieArray) {
            System.out.println(m.getName() +  "\t"+ m.getRelease()+ "\t"+m.getRating());
        }
    }

}
