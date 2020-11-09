//https://pastebin.com/4xUaaLnz
//copy in this code from this pastebin


import java.util.*;
class Main 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
        list.add(new Movie("Avengers", 8.2, 1983));
        list.add(new Movie("Justice", 8.3, 1983)); 
    //all unique
        list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 
        //same year        
        list.add(new Movie("Avengers", 8.2, 1944));
        list.add(new Movie("Willump", 8.4, 1944)); 
        list.add(new Movie("Justice", 8.3, 1944)); 
        
        //same year and rating
        list.add(new Movie("Hello", 8.3, 1957)); 
        list.add(new Movie("Returned", 8.3, 1957)); 
        list.add(new Movie("Blades", 8.3, 1957)); 
        // Collections.sort(list);
        // for (Movie movie: list) 
        //     System.out.println(movie.getYear() + " " + 
        //                        movie.getRating() + " " + 
        //                        movie.getName()+" "); 
        // System.out.println();
        // // uses comparator to sort by name
        // NameCompare nameCompare = new NameCompare();
        // Collections.sort(list, nameCompare);
        // for (Movie movie: list) 
        //     System.out.println(movie.getYear() + " " + 
        //                        movie.getRating() + " " + 
        //                        movie.getName()+" "); 
        // System.out.println();
        // RatingCompare ratingCompare = new RatingCompare();
        // Collections.sort(list, ratingCompare);
        // for (Movie movie: list) 
        //     System.out.println(movie.getYear() + " " + 
        //                        movie.getRating() + " " + 
        //                        movie.getName()+" ");

        System.out.println();
        Collections.sort(list);
        for (Movie movie: list) 
            System.out.println(movie.getYear() + " " + 
                               movie.getRating() + " " + 
                               movie.getName()+" ");
        System.out.println();
        YearCompare yearCompare = new YearCompare();
        Collections.sort(list, yearCompare);
        for (Movie movie: list) 
            System.out.println(movie.getYear() + " " + 
                               movie.getRating() + " " + 
                               movie.getName()+" ");

        
    } 
} 
class Movie implements Comparable<Movie>
{ 
    private double rating; 
    private String name; 
    private int year; 
  
    // Constructor 
    public Movie(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 

    public int compareTo(Movie m){
      return this.year - m.year;
    }
  
    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName()   {  return name; } 
    public int getYear()      {  return year;  } 
} 

class NameCompare implements Comparator<Movie>{
  public int compare(Movie m1, Movie m2){
    return m1.getName().compareTo(m2.getName());
  }
}

class RatingCompare implements Comparator<Movie>{
  public int compare(Movie m1, Movie m2){
    if(m1.getRating() < m2.getRating())
      return -1;
    if(m1.getRating() > m2.getRating()) 
      return 1;
    else return 0;
  }
}

class YearCompare implements Comparator<Movie>{
  public int compare(Movie m1, Movie m2){
    if(m1.getYear() < m2.getYear())
      return -1;
    if(m1.getYear() > m2.getYear())
      return 1;
    if(m1.getRating() < m2.getRating())
      return -1;
    if(m1.getRating() > m2.getRating())
      return 1;
    
    return 0;
  }
}
